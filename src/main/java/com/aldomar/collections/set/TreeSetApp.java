package com.aldomar.collections.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet
 * - Tiene costo de rendimiento porque tiene que ordenar las posiciones
 * - No acepta elementos duplicados
 *
 * @author Aldo Omar
 * @since 2022-06-24
 */
public class TreeSetApp {
    public static void main(String[] args) {
        TreeSetApp app = new TreeSetApp();
        app.treeSetTest1();
    }

    /**
     * Ejemplo 01
     */
    public void treeSetTest1() {
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("Aldo");
        stringSet.add("Omar");
        stringSet.add("Li");
        stringSet.add("Jimena");
        stringSet.add("Li");
        System.out.println("args = " + stringSet);
    }
}
