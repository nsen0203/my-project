package com.spring;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm() {
		String str=null;
		System.out.println(str.charAt(0));
		return "fileform";
	}

	@RequestMapping(value = "/uploadimage", method = RequestMethod.POST)
	public String fileupload(@RequestParam("profile") CommonsMultipartFile file, HttpSession s, Model m) {

		System.out.println("File Upload Handler");

		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());

		//get the byte data
		byte[] data = file.getBytes();

		// we have save this file in server
		String path = s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator
				+ "image" + File.separator + file.getOriginalFilename();
		System.out.println(path);

		try {
			FileOutputStream fout = new FileOutputStream(path);
			fout.write(data);
			fout.close();
			System.out.println("File Uploaded Successfully");
			
			m.addAttribute("msg", "File uploaded successfully");
			m.addAttribute("filename", file.getOriginalFilename());
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Uploading Error");
			m.addAttribute("msg", "File uploading Error");
		}
		
		
		return "filesuccess";
	}

}
