package springbootdemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("测试提交");
		System.out.println("测试在git上更新");
		SpringApplication.run(DemoApplication.class, args);
	}

}

