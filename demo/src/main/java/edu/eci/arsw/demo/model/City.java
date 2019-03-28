package edu.eci.arsw.demo.model;

import java.io.Serializable;

public class City implements Serializable {

    public static String name;

    public City() {
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        City.name = name;
    }

}
