package com.multipart.service;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.multipart.constant.FileConstant;
import com.multipart.exception.FileNotFoundException;

@Service
public class FileUploadService {

	public void uploadFile(MultipartFile file) throws IllegalStateException, IOException {
		// TODO Auto-generated method stub
		if(file.isEmpty()) {
			throw new FileNotFoundException("File not found");
		}
		
//		File upload = new File(FileConstant.filePath);
//		if(!upload.exists()) {
//			upload.mkdirs();
//		}
		
		File dest = new File(FileConstant.filePath + file.getOriginalFilename());
		file.transferTo(dest);
	}

}
