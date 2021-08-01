package com.TMS;

public class Commodity extends Shop {
    private int id;
    private String name;
    private int price;

    public Commodity (int id, String name) {
        this.id = id;
        this.name = name;

    }
    @Override
    public void addCommodity(Commodity commodity) {
        CommodityList.put (commodity.id, commodity.name);
    }

}