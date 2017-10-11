/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.laidani;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

/**
 *
 * @author laidani.youcef
 */
public class Person {

    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private String email;
    private List<String> tels;

    public Person() {
    }

    public Person(final PersonBuilder personBuilder) {
        this.firstName = personBuilder.firstName;
        this.lastName = personBuilder.lastName;
        this.birthDay = personBuilder.birthDay;
        this.email = personBuilder.email;
        this.tels = personBuilder.tels;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getTels() {
        return tels;
    }

    public void setTels(List<String> tels) {
        this.tels = tels;
    }

    @Override
    public String toString() {
        StringBuilder showInformations = new StringBuilder();
        showInformations.append("I'm ")
                .append(firstName)
                .append(", ")
                .append(lastName)
                .append(", I have ")
                .append(Period.between(birthDay, LocalDate.now()).getYears())
                .append(" years old, My email is ")
                .append(email)
                .append(" I have few phone numbers ")
                .append(tels);
        return showInformations.toString();
    }

}
