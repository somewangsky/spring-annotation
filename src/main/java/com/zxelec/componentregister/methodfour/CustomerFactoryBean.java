package com.zxelec.componentregister.methodfour;

import org.springframework.beans.factory.FactoryBean;

/**
 * CustomerBeanFactory
 *
 * @author vimicro
 * @date 2020/10/10
 */
public class CustomerFactoryBean implements FactoryBean<Peanut> {

    @Override
    public Peanut getObject() throws Exception {
        return new Peanut("花生", 0.01);
    }

    @Override
    public Class<?> getObjectType() {
        return Peanut.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
