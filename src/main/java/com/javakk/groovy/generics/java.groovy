package com.javakk.groovy.generics

/***
 * Excerpted from "Programming Groovy, 2nd Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vslg2 for more book information.
 ***/
// Java code

class Generics {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2.0);
        list.add("hello");

        System.out.println("List populated");
        for (int element : list) {
            System.out.println(element);
        }
    }
}

