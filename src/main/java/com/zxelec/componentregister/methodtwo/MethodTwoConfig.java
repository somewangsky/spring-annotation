package com.zxelec.componentregister.methodtwo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MethodTwoConfig
 *
 * @author vimicro
 * @date 2020/10/10
 */
@Configuration
public class MethodTwoConfig {

    /**
     * Bean在默认情况下以方法名作为id，如果要自定义则需要设置value属性
     *
     * @return
     */
    @Bean(value = "teacher01")
    public Teacher teacher() {
        return new Teacher("张三", 18);
    }
}
