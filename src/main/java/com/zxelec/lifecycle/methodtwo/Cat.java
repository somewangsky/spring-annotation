package com.zxelec.lifecycle.methodtwo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Cat
 *
 * @author vimicro
 * @date 2020/10/12
 */
@Component
public class Cat implements InitializingBean, DisposableBean {

    private String name;

    private String color;

    public Cat() {
        System.out.println("cat constructor.......");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat afterPropertiesSet()......");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("cat destroy()........");
    }
}
