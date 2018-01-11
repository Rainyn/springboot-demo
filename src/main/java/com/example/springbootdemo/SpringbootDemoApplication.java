package com.example.springbootdemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//该包是最底层的包，其他新建包应该在此包内

@SpringBootApplication //Spring Boot 应用的标识
@ComponentScan
public class SpringbootDemoApplication {
	/**
	 *  Application很简单，一个main函数作为主入口。SpringApplication引导应用，并将Application本身作为参数传递给run方法。具体run方法会启动嵌入式的Tomcat并初始化Spring环境及其各Spring组件。
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}
}
