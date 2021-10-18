package cn.liyong.test.springboot;

import cn.liyong.test.springboot.entity.sys.UserTest;
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
