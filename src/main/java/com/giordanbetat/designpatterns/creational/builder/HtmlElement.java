package com.giordanbetat.designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.Collections;

public class HtmlElement {

    public String name;
    public String text;
    public ArrayList<HtmlElement> elements = new ArrayList<>();

    private final int identSize = 2;
    private final String newLine = System.lineSeparator();

    public HtmlElement() {
    }

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    private String toStringImpl(int ident) {
        StringBuilder builder = new StringBuilder();
        String i = String.join("", Collections.nCopies(ident * identSize, " "));
        builder.append(String.format("%s<%s>%s", i, name, newLine));
        if (text != null && !text.isEmpty()) {
            builder.append(String.join("", Collections.nCopies(identSize * (ident + 1), " "))).append(text).append(newLine);
        }

        for (HtmlElement element : elements) {
            builder.append(element.toStringImpl(ident + 1));
        }

        builder.append(String.format("%s</%s>%s", i, name, newLine));
        return builder.toString();
    }

    @Override
    public String toString() {
        return toStringImpl(0);
    }
}
