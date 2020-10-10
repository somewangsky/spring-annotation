package com.zxelec.componentregister.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * ConditionCOnfig
 *
 * @author vimicro
 * @date 2020/10/10
 */
@Configuration
public class ConditionConfig {

    @Conditional(value = {WindowsCondition.class})
    @Bean
    public Person bill() {
        return new Person("bill", 45);
    }

    @Conditional(value = LinuxCondition.class)
    @Bean
    public Person linus() {
        return new Person("linus", 50);
    }
}
