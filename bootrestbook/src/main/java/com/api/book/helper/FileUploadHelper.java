package com.api.book.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

	// static path
	// public final String Upload_Dir="C:\\Users\\Nikhil
	// Sen\\Documents\\workspace-spring-tool-suite-4-4.17.1.RELEASE\\bootrestbook\\src\\main\\resources\\static\\image";
	/*
	 * public boolean uploadFile(MultipartFile multipartFile) {
	 * 
	 * boolean file = false;
	 * 
	 * try {
	 * 
	 * // InputStream ios=multipartFile.getInputStream(); //get the data // byte
	 * data[]=new byte[ios.available()]; // ios.read(data); //reading data // // //
	 * //write the data // FileOutputStream fos=new FileOutputStream(Upload_Dir +
	 * File.separator + multipartFile.getOriginalFilename()); // fos.write(data); //
	 * // fos.close();
	 * 
	 * Files.copy(multipartFile.getInputStream(), Paths.get(Upload_Dir +
	 * File.separator + multipartFile.getOriginalFilename()),
	 * StandardCopyOption.REPLACE_EXISTING);
	 * 
	 * file = true; } catch (Exception e) { e.printStackTrace(); } return file;
	 * 
	 * }
	 */
	

	// dynamic path code start
	public final String Upload_Dir = new ClassPathResource("static/image/").getFile().getAbsolutePath();

	public FileUploadHelper() throws IOException {

	}
	//// dynamic path code end

	public boolean uploadFile(MultipartFile multipartFile) {

		boolean file = false;

		try {

//			InputStream ios=multipartFile.getInputStream();  //get the data
//			byte data[]=new byte[ios.available()];           
//			ios.read(data);                                  //reading data
//			
//			
//			//write the data
//			FileOutputStream fos=new FileOutputStream(Upload_Dir + File.separator + multipartFile.getOriginalFilename());
//			fos.write(data);
//			
//			fos.close();

			Files.copy(multipartFile.getInputStream(),
					Paths.get(Upload_Dir + File.separator + multipartFile.getOriginalFilename()),
					StandardCopyOption.REPLACE_EXISTING);

			file = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return file;

	}

}
