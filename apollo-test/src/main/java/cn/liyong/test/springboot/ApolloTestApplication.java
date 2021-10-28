package cn.liyong.test.springboot;

import com.douyu.ocean.damp.client.entry.TaskInstanceReportEntry;
import com.douyu.ocean.damp.client.enums.ComputeClusterEnum;
import com.douyu.ocean.damp.client.enums.EngineTypeEnum;
import com.douyu.ocean.damp.client.service.ReportInstance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ApolloTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApolloTestApplication.class, args);
		log.info("111");

		//entry
		TaskInstanceReportEntry entry = new TaskInstanceReportEntry.Builder("ocean-test", 1)
				.bizCommitterName("李四")
				.cluster(ComputeClusterEnum.HIVE_C4)
				.engine(EngineTypeEnum.FLINK_SQL)
				.startTime(System.currentTimeMillis())
				.endTime(System.currentTimeMillis())
				.build();
		//String msg = JSON.toJSONString(entry);
		//send
		ReportInstance.send(entry);

		log.info("222");



	}

}
