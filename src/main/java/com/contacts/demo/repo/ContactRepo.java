package com.contacts.demo.repo;

import com.contacts.demo.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface ContactRepo extends JpaRepository<Contact, String> {
    Optional<Contact> findById(String id);
}
