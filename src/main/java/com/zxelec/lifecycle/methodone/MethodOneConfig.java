package com.zxelec.lifecycle.methodone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MethodOneConfig
 * bean的生命周期：bean的构造------->bean的初始化------->bean的销毁
 *
 * @author vimicro
 * @date 2020/10/12
 */
@Configuration
public class MethodOneConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Dog dog() {
        System.out.println("IOC container load.........");
        return new Dog();
    }
}
