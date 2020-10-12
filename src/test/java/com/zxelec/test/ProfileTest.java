package com.zxelec.test;

import com.zxelec.profile.ProfileConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * ProfileTest
 *
 * @author vimicro
 * @date 2020/10/12
 */
public class ProfileTest {

    //1、使用命令行动态参数: 在虚拟机参数位置加载 -Dspring.profiles.active=test
    //2、代码的方式激活某种环境；

    @Test
    public void profile() {
        //1.获取applicationContext
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //2.设置spring的环境
        applicationContext.getEnvironment().setActiveProfiles("dev");
        //3.注册配置信息
        applicationContext.register(ProfileConfig.class);
        //4.刷新
        applicationContext.refresh();

        String[] beanNamesForType = applicationContext.getBeanNamesForType(DataSource.class);

        for (String name : beanNamesForType) {
            System.out.println(name);
        }
    }
}
