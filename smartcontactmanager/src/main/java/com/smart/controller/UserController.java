package com.smart.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.Principal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.smart.dao.ContactRepository;
import com.smart.dao.UserRepository;
import com.smart.entities.Contact;
import com.smart.entities.User;
import com.smart.helper.Message;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

//	@Autowired
//	private UserRepository userRepository;
//
//	@GetMapping("/index")
//	public String dashboard(Model m, Principal principal) {
//
//		String userName = principal.getName();
//		System.out.println("UserName " + userName);
//
//		// get the user by userName
//
//		User user = userRepository.getuserByUserName(userName);
//		System.out.println("User " + user);
//
//		m.addAttribute("user", user);
//
//		return "normal/user_dashboard";
//	}

	/****************************************************************************************************************/

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ContactRepository contactRepository;

	// method for Common data (i.e. User)
	@ModelAttribute
	public void addCommonData(Model m, Principal principal) {

		String userName = principal.getName();
		System.out.println("UserName " + userName);

		// get the user by userName

		User user = userRepository.getuserByUserName(userName);
		System.out.println("User " + user);

		m.addAttribute("user", user);

	}

	// user dashboard
	@GetMapping("/index")
	public String dashboard(Model m, Principal principal) {

		m.addAttribute("title", "User Dashboard");

		return "normal/user_dashboard";
	}

	// handler for add contacts
	@GetMapping("/add-contact")
	public String openAddcontactForm(Model m) {

		m.addAttribute("title", "Add Contact");
		m.addAttribute("contact", new Contact());

		return "normal/add_contact_form";
	}

	// processing add contact form
	@PostMapping("/process-contact")
	public String processContact(@ModelAttribute Contact contact, @RequestParam("profileImage") MultipartFile file,
			Principal principal, HttpSession session) {

		try {
			String name = principal.getName();
			User user = this.userRepository.getuserByUserName(name);

			// processing and uploading file
			if (file.isEmpty()) {
				System.out.println("There is no image file");
				contact.setcImage("contact.png");
			} else {
				contact.setcImage(file.getOriginalFilename());

				File imageFile = new ClassPathResource("static/image").getFile();

				// getting path where file needs to upload
				Path path = Paths.get(imageFile.getAbsolutePath() + File.separator + file.getOriginalFilename());

				// uploading image file logic
				Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);

				System.out.println("Image Uploaded Successfully");

			}

			contact.setUser(user); // passing user to contact

			user.getContacts().add(contact); // now take contact and update in user list

			this.userRepository.save(user); // saving into to database

			System.out.println("Data " + contact);

			System.out.println("Added to data base");

			// success message
			session.setAttribute("message", new Message("Your contact is added !! Add more..", "success"));

		} catch (Exception e) {
			e.printStackTrace();

			// error message
			session.setAttribute("message", new Message("Something went wrong !! Try Again..", "danger"));

		}

		return "normal/add_contact_form";
	}

	// show all contact handler
	// this way of working also work
	/*
	 * @GetMapping("/show-contacts") public String showContacts(Model m, Principal
	 * principal) {
	 * 
	 * m.addAttribute("title", "View Contacts");
	 * 
	 * //sending contact list to html page String userName = principal.getName();
	 * 
	 * User user = this.userRepository.getuserByUserName(userName); List<Contact>
	 * contacts = user.getContacts();
	 * 
	 * 
	 * return "normal/show_contacts"; }
	 */

	// show all contact handler
	/*
	 * @GetMapping("/show-contacts") public String showContacts(Model m, Principal
	 * principal) {
	 * 
	 * m.addAttribute("title", "View Contacts");
	 * 
	 * //code to get userId String userName = principal.getName(); User user =
	 * this.userRepository.getuserByUserName(userName);
	 * 
	 * //fetching contacts list List<Contact> contacts =
	 * this.contactRepository.findContactsByUser(user.getId());
	 * 
	 * m.addAttribute("contacts", contacts);
	 * 
	 * 
	 * return "normal/show_contacts"; }
	 */

	// show all contact handler
	// pagination concept
	// per page we will show 5 enteries
	// current page is 0 page
	@GetMapping("/show-contacts/{page}")
	public String showContacts(@PathVariable("page") Integer page, Model m, Principal principal) {

		m.addAttribute("title", "View Contacts");

		// code to get userId
		String userName = principal.getName();
		User user = this.userRepository.getuserByUserName(userName);

		// pagination concept...
		// currentPgae --> page
		// contact per page - 3
		Pageable pagebale = PageRequest.of(page, 3);

		// fetching contacts list
		Page<Contact> contacts = this.contactRepository.findContactsByUser(user.getId(), pagebale);

		m.addAttribute("contacts", contacts);
		m.addAttribute("currentPage", page); // this is for current page on which we are present
		m.addAttribute("totalPages", contacts.getTotalPages()); // get toltal pages

		return "normal/show_contacts";
	}

	// showing specific contact details
	@GetMapping("/{cId}/contact")
	public String showContactDetail(@PathVariable("cId") Integer cId, Model m, Principal principal) {

		System.out.println("CId" + cId);

		Optional<Contact> contactOptional = this.contactRepository.findById(cId);
		Contact contact = contactOptional.get();

		// resolving bug code
		String userName = principal.getName();
		User user = this.userRepository.getuserByUserName(userName);

		if (user.getId() == contact.getUser().getId()) {

			m.addAttribute("contact", contact);
			m.addAttribute("title", contact.getcName());

		}

		// m.addAttribute("contact", contact);

		return "normal/contact_detail";
	}

	// deleting contact handler
	@GetMapping("/delete/{cId}")
	public String deleteContact(@PathVariable("cId") Integer cId, Principal principal) {

		/*
		 * Optional<Contact> contactOptional = this.contactRepository.findById(cId);
		 * Contact contact = contactOptional.get();
		 * 
		 * 
		 * //check String userName = principal.getName(); User user =
		 * this.userRepository.getuserByUserName(userName);
		 * 
		 * if(user.getId()==contact.getUser().getId()) {
		 * 
		 * this.contactRepository.delete(contact);
		 * 
		 * }
		 * 
		 * 
		 * //checking the correct user deleting the contact
		 * 
		 * contact.setUser(null); this.contactRepository.delete(contact);
		 */
		
		
		Optional<Contact> contactOptional = this.contactRepository.findById(cId);
		Contact contact = contactOptional.get();
		
		String name = principal.getName();
		User user = this.userRepository.getuserByUserName(name);
		
		user.getContacts().remove(contact);
		
		this.userRepository.save(user);
		

		return "redirect:/user/show-contacts/0";
	}

	// update form handler
	@PostMapping("/update-contact/{cId}")
	public String updateContact(@PathVariable("cId") Integer cId, Model m) {

		m.addAttribute("title", "Update Contact Form");

		Optional<Contact> contactOptional = this.contactRepository.findById(cId);
		Contact contact = contactOptional.get();

		m.addAttribute("contact", contact);

		return "normal/update_form";
	}

	// process update contact handler
	@PostMapping("/process-update")
	public String updateHandler(@ModelAttribute Contact contact, @RequestParam("profileImage") MultipartFile file,
			Model m, Principal principal) {

		// System.out.println("Contact Name "+ contact.getcName());

		try {

			// fetching old contact details
			Contact oldConatctDetail = this.contactRepository.findById(contact.getcId()).get();

			// if user changes profileImage then this "if block will run" otherwise "else
			// block run "
			if (!file.isEmpty()) {

				// delete old image

				File deleteFile = new ClassPathResource("static/image").getFile();

				File file1 = new File(deleteFile, oldConatctDetail.getcImage());
				file1.delete();

				// Updating new image file

				File saveFile = new ClassPathResource("static/image").getFile();

				// getting path where file needs to upload
				Path path = Paths.get(saveFile.getAbsolutePath() + File.separator + file.getOriginalFilename());

				// uploading image file logic
				Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);

				// now we have set the new image with the name in database
				contact.setcImage(file.getOriginalFilename());

			} else {

				contact.setcImage(oldConatctDetail.getcImage());

			}

			User user = this.userRepository.getuserByUserName(principal.getName());

			contact.setUser(user);

			this.contactRepository.save(contact);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Contact Name " + contact.getcName());
		System.out.println("Contact Id " + contact.getcId());

		return "redirect:/user/" + contact.getcId() + "/contact";
	}
	
	
	
	// Your profile handler
	@GetMapping("/profile")
	public String yourProfile(Model m) {
		
		m.addAttribute("title", "Profile Page");
		
		return "normal/profile";
	}

}
