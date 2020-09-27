package com.giordanbetat.designpatterns.creational.fluentbuilder;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder>{

    public EmployeeBuilder workAt(String position){
        person.position = position;
        return self();
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
