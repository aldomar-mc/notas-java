package com.aldomar.collections.list;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * ListIterator
 *
 */
public class ListIteratorApp {
    public static void main(String[] args) {
        ListIteratorApp app = new ListIteratorApp();
        app.test01();
    }

    public void test01() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Aldo");
        list.add("Omar");
        list.add("Lu");
        list.add("Li");

        ListIterator<String> iterator = list.listIterator();

        System.out.println("*********** Next ***********");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*********** Previos ***********");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
