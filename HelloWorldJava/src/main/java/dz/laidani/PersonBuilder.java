/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.laidani;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author laidani.youcef
 */
public class PersonBuilder {

    public String firstName;
    public String lastName;
    public LocalDate birthDay;
    public String email;
    public List<String> tels;

    public PersonBuilder() {
    }

    public PersonBuilder firstName(final String value) {
        this.firstName = value;
        return this;
    }

    public PersonBuilder lastName(final String value) {
        this.lastName = value;
        return this;
    }

    public PersonBuilder birthDay(final LocalDate value) {
        this.birthDay = value;
        return this;
    }

    public PersonBuilder email(final String value) {
        this.email = value;
        return this;
    }

    public PersonBuilder tels(final List<String> value) {
        this.tels = value;
        return this;
    }

    public Person build() {
        return new Person(this);
    }    

}
