package com.giordanbetat.designpatterns.creational.facetedbuilder;

public class App {

    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();
        Person person = builder
                .lives()
                    .at("Rua dos Devs 01")
                    .in("Porto Alegre")
                    .withPostcode("54515614")
                .works()
                    .at("Developers")
                    .asA("Engineer")
                    .earning(123000)
                .build();

        System.out.println(person);

    }

}
