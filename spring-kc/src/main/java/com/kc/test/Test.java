package com.kc.test;

import com.kc.app.AppConfig;
import com.kc.service.CityService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author KCWang
 * @version 1.0
 * @date 2022/11/19 11:49 上午
 */
public class Test {
	public static void main(String[] args) {
		//初始化Spring
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(annotationConfigApplicationContext.getBean(CityService.class));
		System.out.println("123");
	}
}
