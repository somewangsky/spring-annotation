package com.zxelec.test;

import com.zxelec.propertyvalue.PropertyValueConfig;
import com.zxelec.propertyvalue.Tea;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * PropertyValueTest
 *
 * @author vimicro
 * @date 2020/10/12
 */
public class PropertyValueTest {

    @Test
    public void propertyValue() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertyValueConfig.class);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("tea.nickname");

        System.out.println(property);
        Tea tea = (Tea) applicationContext.getBean("tea");
        System.out.println(tea);
    }

}
