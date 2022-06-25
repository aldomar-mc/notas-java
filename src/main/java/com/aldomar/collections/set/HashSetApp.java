package com.aldomar.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSet
 * - No permite valores duplicados y no es ordenado
 * - Mejor rendimiento
 *
 * @author Aldo Omar
 * @since 2022-06-24
 */
public class HashSetApp {
    public static void main(String[] args) {
        HashSetApp app = new HashSetApp();
        //app.hashSetTest1();
        //app.hashSetTest2();
        app.hashSetTest3();
    }

    /**
     * Ejemplo 01
     */
    public void hashSetTest1() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Aldo");
        hashSet.add("Omar");
        hashSet.add("Lu");
        hashSet.add("Li");
        System.out.println("args = " + hashSet);

        boolean b = hashSet.add("Omar");
        System.out.println("Permite elementos duplicados = " + b);
        System.out.println("args = " + hashSet);
    }

    /**
     * Ejemplo 02: Identificar elementos duplicados
     */
    public void hashSetTest2() {
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado"};
        Set<String> stringSet = new HashSet<>();
        for (String pez : peces) {
            if (!stringSet.add(pez)) {
                System.out.println("Elemento duplicado = " + pez);
            }
        }
        System.out.println(stringSet.size() + " elementos no duplicados");
    }

    /**
     * Ejemplo 03:
     */
    public void hashSetTest3() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Aldo");
        hashSet.add("Omar");
        hashSet.add("Lu");
        hashSet.add("Li");

        System.out.println("*** Iterando usando for ***");
        for (String value:hashSet){
            System.out.println(value);
        }


        System.out.println("*** Itenrando usando while y iterator ***");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("*** Iterando usando Stream forEach ***");
        //hashSet.forEach(value->System.out.println(value));
        hashSet.forEach(System.out::println);
    }
}
