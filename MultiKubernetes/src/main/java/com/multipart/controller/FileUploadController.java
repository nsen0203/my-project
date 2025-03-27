package com.multipart.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.multipart.service.FileUploadService;

@RestController
@RequestMapping("/home")
public class FileUploadController {
	
	@Autowired
	private FileUploadService fileUploadService;
	
	@PostMapping("/file")
	public String fileUploadController(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		fileUploadService.uploadFile(file);
		return "File uploaded successfully";	
	}
	
	@GetMapping("/testing")
	public String testData() {
		return "API is working";
	}

}
