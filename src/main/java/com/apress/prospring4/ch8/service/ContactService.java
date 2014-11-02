package com.apress.prospring4.ch8.service;

import com.apress.prospring4.ch8.domain.Contact;

import java.util.List;

/**
 * Created by SERGE on 02.11.2014.
 */
public interface ContactService {
    List<Contact> findAll();

    List<Contact> findAllWithDetail();

    Contact findById(Long id);

    Contact save(Contact contact);

    void delete(Contact contact);

    List<Contact> findAllByNativeQuery();
}
