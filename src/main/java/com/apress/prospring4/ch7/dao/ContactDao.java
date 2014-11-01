package com.apress.prospring4.ch7.dao;

import com.apress.prospring4.ch7.domain.Contact;

import java.util.List;

/**
 * Created by SERGE on 01.11.2014.
 */
public interface ContactDao {
    List<Contact> findAll();

    List<Contact> findAllWithDetail();

    Contact findById(Long id);

    Contact save(Contact contact);

    void delete(Contact contact);
}
