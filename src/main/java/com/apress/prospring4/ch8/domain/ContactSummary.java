package com.apress.prospring4.ch8.domain;

import java.io.Serializable;

/**
 * Created by SERGE on 02.11.2014.
 */
public class ContactSummary implements Serializable {
    private String firstName;
    private String lastName;
    private String homeTelNumber;

    public ContactSummary(String firstName, String lastName,
                          String homeTelNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeTelNumber = homeTelNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getHomeTelNumber() {
        return homeTelNumber;
    }

    public String toString() {
        return "First name: " + firstName + " Last Name: " + lastName
                + " Home Phone: " + homeTelNumber;
    }
}
