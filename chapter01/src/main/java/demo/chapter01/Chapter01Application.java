package demo.chapter01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 建议启动程序的包层次最高, 其他类均在其下.
 * 这样SpringBoot默认自动搜索启动程序之下的所有类
 */
@SpringBootApplication
public class Chapter01Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter01Application.class, args);
    }

}

