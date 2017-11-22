package com.vivo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Controler {
	@Autowired
	private KafkaTemplate template;
	@RequestMapping("test")
	public void test(){
		System.out.println("success");;
	}
	@RequestMapping("kafaka")
	public void testKafaka(){
		System.out.println("kafka消息发送成功");
	
	}
	
}
