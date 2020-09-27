package com.giordanbetat.designpatterns.creational.fluentbuilder;

public class App {

    public static void main(String[] args) {
        EmployeeBuilder builder = new EmployeeBuilder();

        Person person = builder
                .withName("Giordan")
                .workAt("Software Developer")
                .build();

        System.out.println(person);

    }

}
