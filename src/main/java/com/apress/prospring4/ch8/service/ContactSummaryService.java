package com.apress.prospring4.ch8.service;

import com.apress.prospring4.ch8.domain.ContactSummary;

import java.util.List;

/**
 * Created by SERGE on 02.11.2014.
 */
public interface ContactSummaryService {
    List<ContactSummary> findAll();
}
