package com.cy;

import org.graalvm.compiler.lir.CompositeValue.Component;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cindy.chen
 * @description
 * @date Created in 2020/10/29 10:36
 */
@Configuration
public class JavaConfig {

	@Bean
	public User user() {
		return new User("001", "smart哥");
	}
}
