package com.apress.prospring4.ch8;

import com.apress.prospring4.ch8.domain.Contact;
import com.apress.prospring4.ch8.service.ContactService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by SERGE on 02.11.2014.
 */
public class SpringJPASample {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/beans-8.xml");
        ContactService contactService = ctx.getBean(
                "jpaContactService", ContactService.class);
        listContacts(contactService.findAll());
    }

    private static void listContacts(List<Contact> contacts) {
        System.out.println("");
        System.out.println("Listing contacts without details:");
        for (Contact contact: contacts) {
            System.out.println(contact);
            System.out.println();
        }
    }
}
