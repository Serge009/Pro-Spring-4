package com.apress.prospring4.ch7;

import com.apress.prospring4.ch7.dao.ContactDao;
import com.apress.prospring4.ch7.domain.Contact;
import com.apress.prospring4.ch7.domain.ContactTelDetail;
import com.apress.prospring4.ch7.domain.Hobby;
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

//        listContacts(contactDao.findAllWithDetail());
        Contact contact = contactDao.findById(1l);
        System.out.println("");
        System.out.println("Contact with id 1:" + contact);
        System.out.println("");
    }

    private static void listContacts(List<Contact> contacts) {
        System.out.println("");
        System.out.println("Listing contacts without details:");
        for (Contact contact: contacts) {
            System.out.println(contact);

            if (contact.getContactTelDetails() != null) {
                for (ContactTelDetail contactTelDetail:
                        contact.getContactTelDetails()) {
                    System.out.println(contactTelDetail);
                }
            }

            if (contact.getHobbies() != null) {
                for (Hobby hobby: contact.getHobbies()) {
                    System.out.println(hobby);
                }
            }

            System.out.println();
        }
    }
}
