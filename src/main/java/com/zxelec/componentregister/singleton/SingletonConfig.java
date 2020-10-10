package com.zxelec.componentregister.singleton;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

/**
 * SingletonConfig
 *
 * @author vimicro
 * @date 2020/10/10
 */
@Configuration
public class SingletonConfig {

    /**
     * 默认情况下spring容器加载的类都是单例的，如果需要多例则要配置其scope为prototype
     *
     * SCOPE_PROTOTYPE 多例
     * SCOPE_SINGLETON 单例
     * SCOPE_REQUEST 一个请求域
     * SCOPE_SESSION 一个会话域
     */
    @Scope(SCOPE_PROTOTYPE)
    @Bean
    public Apple apple() {
        return new Apple("富士苹果", 0.5);
    }
}
