package com.contact.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.contactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private contactService contactservice;

	@GetMapping("/user/{userId}")
	public List<Contact> getContactDetail(@PathVariable("userId") Long userId) {
		List<Contact> a1 = this.contactservice.getContactofUser(userId);
		return a1;
	}
}