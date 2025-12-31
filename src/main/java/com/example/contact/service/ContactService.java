package com.example.contact.service;

import com.example.contact.model.Contact;
import com.example.contact.repository.ContactRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final ContactRepository repo;

    public ContactService(ContactRepository repo) {
        this.repo = repo;
    }

    public Contact save(Contact contact) {
        return repo.save(contact);
    }
}
