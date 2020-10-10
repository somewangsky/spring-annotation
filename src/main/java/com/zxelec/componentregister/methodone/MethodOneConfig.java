package com.zxelec.componentregister.methodone;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * MethodOneConfig
 * <p>
 * 包扫描+spring自带的注解
 *
 * @author vimicro
 * @date 2020/10/10
 */
@Configuration
@ComponentScan(value = {"com.zxelec.componentregister.methodone"},
        useDefaultFilters = false, //在使用includeFilters的时候，需要关闭默认的过滤，也就是useDefaultFilters=false
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class}),
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Book.class),
                @ComponentScan.Filter(type = FilterType.CUSTOM, value = CustomerTypeFilter.class)}
)
public class MethodOneConfig {


}
