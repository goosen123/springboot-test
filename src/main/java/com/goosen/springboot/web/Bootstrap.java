package com.goosen.springboot.web;

//import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@ImportResource(value = "classpath:spring/spring-root.xml")
@SpringBootApplication
//@Slf4j
public class Bootstrap {
	
	private static  final transient Logger log = Logger.getLogger(Bootstrap.class);
	
    public static void main(String[] args) {
         log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> springboot-test启动开始 >>>>>>>>>>>>>>");
         SpringApplication.run(Bootstrap.class, args);
         log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> springboot-test启动成功 >>>>>>>>>>>>>>");
    }

}
