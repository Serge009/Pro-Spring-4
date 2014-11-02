package com.apress.prospring4.ch8.service;

import com.apress.prospring4.ch8.domain.ContactSummary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by SERGE on 02.11.2014.
 */
@Service("contactSummaryService")
@Repository
@Transactional
public class ContactSummaryServiceImpl implements ContactSummaryService {
    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @Override
    public List<ContactSummary> findAll() {
        List<ContactSummary> result = em.createQuery(
                "select new com.apress.prospring4.ch8.domain.ContactSummary("
                        + "c.firstName, c.lastName, t.telNumber) "
                        + "from Contact c left join c.contactTelDetails t "
                        + "where t.telType='Home'",
                ContactSummary.class).getResultList();
        return result;
    }
}
