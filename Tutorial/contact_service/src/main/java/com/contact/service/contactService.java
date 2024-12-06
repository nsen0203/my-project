package com.contact.service;

import java.util.List;

import com.contact.entity.Contact;

public interface contactService {

	public List<Contact> getContactofUser(Long userId);
}