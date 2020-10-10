package com.zxelec.componentregister.methodthree;

/**
 * Melon
 *
 * @author vimicro
 * @date 2020/10/10
 */
public class Melon {

    private String name;

    private Double price;

    public Melon() {
    }

    public Melon(String name, Double price) {
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
        return "Melon{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
