package cn.liyong.test.springboot;


import cn.liyong.test.springboot.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * This is Description
 *
 * @author liyong
 * @date 2022/03/22
 */
@Configuration
@EnableTransactionManagement
@SpringBootApplication
public class SpringbootApplication {
    public static void main(String[] args) throws Exception{
        ConfigurableApplicationContext content = SpringApplication.run(SpringbootApplication.class, args);
        //StudentService studentService = (StudentService) content.getBean("studentService");
        //studentService.saveStudent("小周");
    }
}
