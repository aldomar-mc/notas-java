package com.aldomar.collections.list;

import java.util.LinkedList;

/**
 * LinkedList
 * - Usar para manipular datos, tiene varios métodos para realizar ciertas operaciones de manera más eficiente
 */
public class LinkedListApp {
    public static void main(String[] args) {
        LinkedListApp app = new LinkedListApp();
        app.linkedListTest1();
    }

    public void linkedListTest1() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Aldo");
        list.add("Omar");
        list.add("Lu");
        list.add("Li");

        list.addFirst("Tomás");
        list.addLast("Maria");

        System.out.println("First element = "+list.getFirst());
        System.out.println("Last element = " + list.getLast());
        System.out.println("Index element = " + list.get(3));

        list.removeFirst();

        list.forEach(System.out::println);
    }
}
