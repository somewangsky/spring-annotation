package com.zxelec.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * AopConfig
 *
 * @author vimicro
 * @date 2020/10/13
 */
@EnableAspectJAutoProxy
@Configuration
public class AopConfig {

    @Bean
    public MathCalculator mathCalculator() {
        return new MathCalculator();
    }

    @Bean
    public LogAspects logAspects() {
        return new LogAspects();
    }
}
