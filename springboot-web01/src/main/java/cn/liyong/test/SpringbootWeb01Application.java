package cn.liyong.test;

import cn.liyong.test.springboot.entity.sys.UserTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootWeb01Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringbootWeb01Application.class, args);
		UserTest user = (UserTest) context.getBean("userTest");
		System.out.println("111");

	}

}
