package com.javatech.springboot_backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
class SpringbootBackendApplicationTests {

	@Test
	void contextLoads() {
	}

}
