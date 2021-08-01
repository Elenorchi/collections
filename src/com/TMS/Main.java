package com.TMS;

public class Main {

    public static void main(String[] args) {
        Commodity bread = new Commodity(55, "bread");
        Shop zlatka = new Shop();
        zlatka.addCommodity(bread);
        zlatka.print();
    }
}

