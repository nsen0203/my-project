package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	//fake list of contacts
	List<Contact> list = List.of(
			new Contact(1L, "test1@gmail.com", "Test1", 1211L),
			new Contact(2L, "test2@gmail.com", "Test2", 1211L),
			new Contact(3L, "test3@gmail.com", "Test3", 1212L),
			new Contact(4L, "test4@gmail.com", "Test4", 1212L),
			new Contact(5L, "test5@gmail.com", "Test5", 1213L),
			new Contact(6L, "test6@gmail.com", "Test6", 1213L)
			);

	@Override
	public List<Contact> getContactsOfuser(Long userID) {
		
		return list.stream().filter(contact -> contact.getUserId().equals(userID)).collect(Collectors.toList());
	}

}
