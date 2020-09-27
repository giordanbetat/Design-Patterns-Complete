package com.giordanbetat.designpatterns.creational.builder;

public class App {

    public static void main(String[] args) {

        HtmlBuilder htmlBuilder = new HtmlBuilder("ul");

        htmlBuilder
                .addChild("li", "hello")
                .addChild("li", "world");

        System.out.println(htmlBuilder);

    }

}
