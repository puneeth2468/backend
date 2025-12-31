package com.example.contact.controller;

import com.example.contact.model.Contact;
import com.example.contact.service.ContactService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://frontend-pzu9.onrender.com")
@RestController
@RequestMapping("/api/contact")
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @PostMapping("/contact")
    public Contact saveContact(@RequestBody Contact contact) {
        return service.save(contact);
    }
}
