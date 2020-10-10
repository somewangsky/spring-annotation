package com.zxelec.test;

import com.zxelec.componentregister.condition.ConditionConfig;
import com.zxelec.componentregister.lazy.Banana;
import com.zxelec.componentregister.lazy.LazyConfig;
import com.zxelec.componentregister.methodfour.MethodFourConfig;
import com.zxelec.componentregister.methodone.MethodOneConfig;
import com.zxelec.componentregister.methodthree.MethodThreeConfig;
import com.zxelec.componentregister.methodtwo.MethodTwoConfig;
import com.zxelec.componentregister.singleton.Apple;
import com.zxelec.componentregister.singleton.SingletonConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * MainTest
 *
 * @author vimicro
 * @date 2020/10/10
 */
public class ComponentRegisterTest {

    public void printNames(AnnotationConfigApplicationContext context) {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void methodOne() {
        printNames(new AnnotationConfigApplicationContext(MethodOneConfig.class));
    }

    @Test
    public void methodTwo() {
        printNames(new AnnotationConfigApplicationContext(MethodTwoConfig.class));
    }

    @Test
    public void singleton() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SingletonConfig.class);
        printNames(applicationContext);
        Apple apple1 = (Apple) applicationContext.getBean("apple");
        Apple apple2 = (Apple) applicationContext.getBean("apple");

        System.out.println(apple1 == apple2);
    }

    @Test
    public void lazy() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LazyConfig.class);
        printNames(applicationContext);
    }

    @Test
    public void methodThree() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MethodThreeConfig.class);
        printNames(applicationContext);
    }

    @Test
    public void methodFour() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MethodFourConfig.class);
        printNames(applicationContext);

        Object customerFactoryBean1 = applicationContext.getBean("customerFactoryBean");
        System.out.println(customerFactoryBean1.getClass());

        /**
         * 如果想要获取到原始的FactoryBean信息需要添加"&"
         */
        Object customerFactoryBean2 = applicationContext.getBean("&customerFactoryBean");
        System.out.println(customerFactoryBean2.getClass());
    }

    @Test
    public void condition() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);
        printNames(applicationContext);
    }
}
