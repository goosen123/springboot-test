package com.goosen.springboot.action;

//import lombok.extern.slf4j.Slf4j;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("person")
//@Slf4j
public class PersonAction {
	
	private static  final transient Logger log = Logger.getLogger(PersonAction.class);
	
	@RequestMapping(value = "sayHello")
    public String sayHello(){
		log.info("person say hello");
        return "hello";
    }
	
}
