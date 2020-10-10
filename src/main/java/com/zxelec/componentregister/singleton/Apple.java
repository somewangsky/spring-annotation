package com.zxelec.componentregister.singleton;

/**
 * Apple
 *
 * @author vimicro
 * @date 2020/10/10
 */
public class Apple {

    private String name;

    private Double price;

    public Apple() {
    }

    public Apple(String name, Double price) {
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
        return "Apple{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
