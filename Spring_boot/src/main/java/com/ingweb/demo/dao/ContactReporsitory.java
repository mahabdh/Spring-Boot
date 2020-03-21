package com.ingweb.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingweb.demo.entities.Contact;

public interface ContactReporsitory extends JpaRepository<Contact, Long>{ //entite = contact   id est de type Long

}
