package com.zxelec.componentregister.lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * LazyConfig
 *
 * @author vimicro
 * @date 2020/10/10
 */
@Configuration
public class LazyConfig {

    /**
     * 在单例默认情况下，bean在容器初始化的时候就加载了，如果要在使用的时候才加载需要设置为@Lazy
     * 在多例情况下，默认是在使用的时候才加载
     *
     * @return
     */

    @Lazy
    @Bean
    public Banana banana() {
        System.out.println("将香蕉加载到spring容器中");
        return new Banana("香蕉", 0.2);
    }

}
