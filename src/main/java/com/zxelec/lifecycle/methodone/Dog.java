package com.zxelec.lifecycle.methodone;

/**
 * Dog
 *
 * @author vimicro
 * @date 2020/10/12
 */
public class Dog {

    private String name;

    private String color;

    public Dog() {
        System.out.println("dog constructor.......");
    }

    public void init() {
        System.out.println("dog init().........");
    }

    public void destroy() {
        System.out.println("dog destroy().........");
    }
}
