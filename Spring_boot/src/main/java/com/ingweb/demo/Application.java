package com.ingweb.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ingweb.demo.dao.ContactReporsitory;
import com.ingweb.demo.entities.Contact;

@SpringBootApplication
public class Application implements CommandLineRunner{
	@Autowired
	private ContactReporsitory contactReporsitory;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		contactReporsitory.save(new Contact("nom", "prenom", df.parse("10/12/1998"), "email", "photo", 1234));
		contactReporsitory.save(new Contact("nom2", "prenom2", df.parse("02/12/1960"), "email", "photo", 12534));
		contactReporsitory.findAll().forEach(c -> {System.out.println(c.getNom());});
		
	}

}
