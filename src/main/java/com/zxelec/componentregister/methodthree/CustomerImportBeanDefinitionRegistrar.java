package com.zxelec.componentregister.methodthree;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * CustomerImportBeanDefinitionRegistrar
 *
 * @author vimicro
 * @date 2020/10/10
 */
public class CustomerImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * @param importingClassMetadata 导入的类信息
     * @param registry               注册器
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
                                        BeanDefinitionRegistry registry) {
        boolean configuration = registry.containsBeanDefinition("com.zxelec.componentregister.methodthree.Cherry");
        if (configuration) {
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition("com.zxelec.componentregister.methodthree.Orange");
            registry.registerBeanDefinition("orange", rootBeanDefinition);
        }
    }
}
