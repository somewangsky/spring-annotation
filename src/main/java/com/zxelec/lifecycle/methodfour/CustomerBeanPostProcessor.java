package com.zxelec.lifecycle.methodfour;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * CustomerBeanProcessor
 *
 * @author vimicro
 * @date 2020/10/12
 */
@Component
public class CustomerBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization()..." + beanName + "bean:" + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("postProcessAfterInitialization()..." + beanName + "bean:" + bean);
        return bean;
    }
}
