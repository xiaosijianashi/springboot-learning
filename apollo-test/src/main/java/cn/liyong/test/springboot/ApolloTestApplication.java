package cn.liyong.test.springboot;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApolloTestApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(ApolloTestApplication.class, args);
		System.out.println("111");

		Config config = ConfigService.getConfig("DEPT299.bd-ocean-damp-client-sdk.properties");
		String key = "damp.report.kafka.brokers";
		String value = config.getProperty(key, "");
		System.out.println("key = " + key);
		System.out.println("value = " + value);
		System.out.println("222");

	}

}
