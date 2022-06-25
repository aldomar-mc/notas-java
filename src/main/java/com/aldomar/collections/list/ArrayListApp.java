package com.aldomar.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ArrayList
 * - Permite elementos duplicados y es ordenado
 * - Usar para almacenar y acceder a datos
 */
public class ArrayListApp {
    public static void main(String[] args) {
        ArrayListApp app = new ArrayListApp();
        app.arrayListTest1();
    }

    public void arrayListTest1() {
        List<String> list = new ArrayList<>();
        list.add("Aldo");
        list.add("Omar");
        list.add("Lu");
        list.add("Li");
        System.out.println("args = " + list);

        boolean b = list.add("Lu");
        System.out.println("Permite elementos duplicados = " + b);
        System.out.println("args = " + list);

        //Ordenar la lista
        //Forma 01: Asc
        //Collections.sort(list);

        //Forma 02: Asc/Desc
        //Collections.sort(list,(o1,o2)->o2.compareTo(o1));

        //Forma 03: Asc/Desc
        //list.sort((o1, o2) -> o2.compareTo(o1));

        // Forma 04: Java 8
        //list.sort(Comparator.comparing((String value) -> value)); //Asc
        list.sort(Comparator.comparing((String value) -> value).reversed()); //Desc

        System.out.println("args = " + list);
    }
}
