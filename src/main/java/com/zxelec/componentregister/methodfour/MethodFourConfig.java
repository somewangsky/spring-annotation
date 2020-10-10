package com.zxelec.componentregister.methodfour;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MehodFourConfig
 *
 * @author vimicro
 * @date 2020/10/10
 */
@Configuration
public class MethodFourConfig {

    @Bean
    public CustomerFactoryBean customerFactoryBean() {
        return new CustomerFactoryBean();
    }
}
