package com.kodila.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String firstname;
    private String lastname;
    private int schoolNumber;

    public Principal(String firstname, String lastname, int schoolNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.schoolNumber = schoolNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return schoolNumber == principal.schoolNumber && Objects.equals(firstname, principal.firstname) && Objects.equals(lastname, principal.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, schoolNumber);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", schoolNumber=" + schoolNumber +
                '}';
    }
}



