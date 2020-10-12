package com.zxelec.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * OrderService
 *
 * @author vimicro
 * @date 2020/10/12
 */
@Service
public class OrderService {

    //@Qualifier(value = "orderDao2")
    //@Autowired(required = false)
    @Autowired
    private OrderDao orderDao;

    //@Autowired
    //private OrderDao orderDao2;

    @Override
    public String toString() {
        return "OrderService{" +
                "orderDao=" + orderDao +
                '}';
    }
}
