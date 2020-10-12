package com.zxelec.test;

import com.zxelec.lifecycle.MainConfig;
import com.zxelec.lifecycle.methodone.MethodOneConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * LifeCycleTest
 *
 * @author vimicro
 * @date 2020/10/12
 */
public class LifeCycleTest {

    @Test
    public void main(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        applicationContext.close();
    }

    @Test
    public void methodOne(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MethodOneConfig.class);
        applicationContext.close();
    }

}
