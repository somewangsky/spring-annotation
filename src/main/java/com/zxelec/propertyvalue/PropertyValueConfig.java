package com.zxelec.propertyvalue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * PropertyValueConfig
 *
 * @author vimicro
 * @date 2020/10/12
 */
//使用@PropertySource读取外部配置文件中的k/v保存到运行的环境变量中;加载完外部的配置文件以后使用${}取出配置文件的值
@PropertySource(value = {"classpath:/tea.properties"})
@Configuration
public class PropertyValueConfig {

    @Bean
    public Tea tea(){
        return new Tea();
    }
}
