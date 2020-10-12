package com.zxelec.test;

import com.zxelec.autowire.AutoWireConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AutoWireConfig
 *
 * @author vimicro
 * @date 2020/10/12
 */
public class AutoWireConfigTest {

    @Test
    public void autoWire(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutoWireConfig.class);

        Object orderService = applicationContext.getBean("orderService");

        System.out.println(orderService);
    }
}
