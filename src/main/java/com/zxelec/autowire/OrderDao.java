package com.zxelec.autowire;

import org.springframework.stereotype.Repository;

/**
 * OrderDao
 *
 * @author vimicro
 * @date 2020/10/12
 */
@Repository
public class OrderDao {
    private String label = "1";

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "OrderDao{" +
                "label='" + label + '\'' +
                '}';
    }
}
