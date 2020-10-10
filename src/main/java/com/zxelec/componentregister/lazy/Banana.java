package com.zxelec.componentregister.lazy;

/**
 * Banner
 *
 * @author vimicro
 * @date 2020/10/10
 */
public class Banana {

    private String name;

    private Double price;

    public Banana() {
    }

    public Banana(String name, Double price) {
        System.out.println("构造香蕉实例");
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
        return "Banana{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
