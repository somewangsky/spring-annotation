package com.zxelec.componentregister.methodthree;

/**
 * Cherry
 *
 * @author vimicro
 * @date 2020/10/10
 */
public class Cherry {

    private String name;
    private Double price;

    public Cherry() {
    }

    public Cherry(String name, Double price) {
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
        return "Cherry{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
