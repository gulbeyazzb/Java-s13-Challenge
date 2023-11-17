package com.workintech.firstChallenge;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public void checkGiro(double giro) {
        if (giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id <= 0) {
            System.out.println("id can not be negative");
        } else {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        checkGiro(giro);
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperCounts( String[] developerName) {
       this.developerNames = developerName;
    }

    public void addEmployee(int index, String name) {
        for (int i = 0; i < getDeveloperNames().length; i++) {
            if (i == index && (getDeveloperNames()[index]!=null)) {
                System.out.println("index is full");
            }
            if (i == index && getDeveloperNames()[index]==null) {
                getDeveloperNames()[index] = name;
                System.out.println("new developer was added succesfully");
            }
        }
        if(index>getDeveloperNames().length){
            System.out.println("entered index is more from array length");
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(getDeveloperNames()) +
                '}';
    }
}
