/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.laidani;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

/**
 *
 * @author laidani.youcef
 */
public class Main {

    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .firstName("LAIDANI")
                .lastName("Youcef")
                .birthDay(LocalDate.of(1991, Month.JULY, 03))
                .email("laidani.icd@gmail.com")
                .tels(Arrays.asList("+213-559-474-632", "+213-699-761-708"))
                .build();
        System.out.println(person.toString());
    }
}
