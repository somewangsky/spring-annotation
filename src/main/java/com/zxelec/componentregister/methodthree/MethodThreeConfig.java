package com.zxelec.componentregister.methodthree;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * MethodThreeConfig
 *
 * @author vimicro
 * @date 2020/10/10
 */

/**
 * Import有三种方式
 * 第一种:直接导入
 * 第二种:实现ImportSelector接口
 * 第三种:实现ImportBeanDefinitionRegistrar接口
 */
@Configuration
@Import({Cherry.class, CustomerImportSelector.class, CustomerImportBeanDefinitionRegistrar.class})
public class MethodThreeConfig {

}
