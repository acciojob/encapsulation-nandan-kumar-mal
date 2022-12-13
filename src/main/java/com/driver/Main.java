package com.driver;

public class Main {

    public static void main(String [] args){

        RWOnly r = new RWOnly();
//        r.name="Nandan";
//        name has private access in com.driver.RWOnly

        r.setName("Nandan");
        System.out.println(r.getName());
    }
}