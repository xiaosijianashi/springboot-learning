package cn.liyong.test.springboot;

import com.alibaba.fastjson.JSON;
import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.douyu.ocean.damp.client.entry.TaskInstanceReportEntry;
import com.douyu.ocean.damp.client.enums.ComputeClusterEnum;
import com.douyu.ocean.damp.client.enums.EngineTypeEnum;
import com.douyu.ocean.damp.client.service.ReportInstance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApolloTestApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(ApolloTestApplication.class, args);
		System.out.println("111");

		Config config = ConfigService.getConfig("bd-ocean-damp-client-sdk.properties");
		String key = "damp.report.kafka.brokers";
		String value = config.getProperty(key, "");
		System.out.println("key = " + key);
		System.out.println("value = " + value);

		//entry
		TaskInstanceReportEntry entry = new TaskInstanceReportEntry.Builder("1111", 1)
				.bizCommitterName("张三")
				.cluster(ComputeClusterEnum.HIVE_C4)
				.engine(EngineTypeEnum.FLINK_SQL)
				.startTime(System.currentTimeMillis())
				.endTime(System.currentTimeMillis())
				.sqlStatement("select * from dy_tmp.ods_xxx")
				.build();
		String msg = JSON.toJSONString(entry);
		//send
		ReportInstance.send(entry);



		System.out.println("222");



	}

}
