#给容器中注册组件的几种方式
`java`
    
    1）、包扫描+组件标注注解（@Controller/@Service/@Repository/@Component）[自己写的类]
	2）、@Bean[导入的第三方包里面的组件]
	3）、@Import[快速给容器中导入一个组件]
	  	1）、@Import(要导入到容器中的组件)；容器中就会自动注册这个组件，id默认是全类名
	  	2）、ImportSelector:返回需要导入的组件的全类名数组；
	  	3）、ImportBeanDefinitionRegistrar:手动注册bean到容器中
	4）、使用Spring提供的 FactoryBean（工厂Bean）;
	  	1）、默认获取到的是工厂bean调用getObject创建的对象
	  	2）、要获取工厂Bean本身，我们需要给id前面加一个&
	  			&colorFactoryBean