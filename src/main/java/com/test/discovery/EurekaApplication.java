package com.test.discovery;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient//集群时作为客户端注册到其他的Eureka节点上
public class EurekaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 * 
	 * 在SpringBoot应用启动之前执行一些代码。比如：<br/> 1. 打印信息<br/> 2. 初始化参数<br/> ...
	 */
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// System.out.println("CommandLineRunner.run()!");
	}
}
