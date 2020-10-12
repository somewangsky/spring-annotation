package com.zxelec.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * AutorWireConfig
 *
 * @author vimicro
 * @date 2020/10/12
 */
@ComponentScan(value = {"com.zxelec.autowire"})
@Configuration
public class AutoWireConfig {

    @Primary
    @Bean(name = "orderDao2")
    public OrderDao orderDao() {
        OrderDao orderDao = new OrderDao();
        orderDao.setLabel("2");
        return orderDao;
    }
}
