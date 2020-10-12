package com.zxelec.lifecycle.methodthree;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Duck
 *
 * @author vimicro
 * @date 2020/10/12
 */
@Component
public class Duck {
    private String name;

    private String color;

    public Duck() {
        System.out.println("duck constructor.........");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("duck postConstruct().........");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("duck preDestroy().........");
    }
}
