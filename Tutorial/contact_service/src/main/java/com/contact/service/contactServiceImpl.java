package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class contactServiceImpl implements contactService {

	List<Contact> list = List.of(new Contact(111L, "abc@gmail.com", "renu", 1L),
			new Contact(11L, "nishti@gmail.com", "nishti", 1L),
			 new Contact(12L, "abcd@gmail.com", "srashti", 2L),
			new Contact(13L, "nisha@gmail.com", "nisha", 3L));

	@Override
	public List<Contact> getContactofUser(Long userId) {

		List<Contact> a1 = list.stream().filter(e -> e.getUserId().equals(userId)).collect(Collectors.toList());
		return a1;
	}

}