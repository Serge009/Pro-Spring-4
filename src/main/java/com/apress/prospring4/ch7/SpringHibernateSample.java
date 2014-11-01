package com.apress.prospring4.ch7;

import com.apress.prospring4.ch7.dao.ContactDao;
import com.apress.prospring4.ch7.domain.Contact;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by SERGE on 01.11.2014.
 */
public class SpringHibernateSample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
        ctx.refresh();
        ContactDao contactDao = ctx.getBean("contactDao", ContactDao.class);
        listContacts(contactDao.findAll());
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
