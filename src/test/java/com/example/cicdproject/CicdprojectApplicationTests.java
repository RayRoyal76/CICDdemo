package com.example.cicdproject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CicdprojectApplicationTests {

	@Autowired
	private MathController mathController;

	@Test
	void contextLoads() throws Exception {
		assertThat(mathController).isNotNull();
	}

}
