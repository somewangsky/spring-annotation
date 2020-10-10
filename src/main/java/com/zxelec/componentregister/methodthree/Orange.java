package com.zxelec.componentregister.methodthree;

/**
 * Orange
 *
 * @author vimicro
 * @date 2020/10/10
 */
public class Orange {

    private String name;

    private Double price;

    public Orange() {
    }

    public Orange(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
