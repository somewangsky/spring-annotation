package com.zxelec.propertyvalue;

import org.springframework.beans.factory.annotation.Value;

/**
 * Tea
 *
 * @author vimicro
 * @date 2020/10/12
 */
public class Tea {

    //使用@Value赋值；
    //1、基本数值
    //2、可以写SpEL； #{}
    //3、可以写${}；取出配置文件【properties】中的值（在运行环境变量里面的值）

    @Value("铁观音")
    private String name;

    @Value("#{20-7}")
    private Double price;

    @Value("${tea.nickname}")
    private String nickName;

    public Tea() {
    }

    public Tea(String name, Double price, String nickName) {
        this.name = name;
        this.price = price;
        this.nickName = nickName;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
