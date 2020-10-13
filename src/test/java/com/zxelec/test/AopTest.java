package com.zxelec.test;

import com.zxelec.aop.AopConfig;
import com.zxelec.aop.MathCalculator;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AopTest
 *
 * @author vimicro
 * @date 2020/10/13
 */
public class AopTest {

    @Test
    public void aop(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);

        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);

        mathCalculator.div(4,2);
    }
}
