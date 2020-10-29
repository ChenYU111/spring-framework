package com.cy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cindy.chen
 * @description
 * @date Created in 2020/10/29 10:56
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("hah");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.toString());
	}
}
