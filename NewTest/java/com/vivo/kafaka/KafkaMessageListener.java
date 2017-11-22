package com.vivo.kafaka;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.listener.MessageListener;


/**
 * <p>Title: KafkaMessageListener</p>
 * <p>Description: kafka监听器
 * <p>Company: </p> 
 * @author luohx
 * @date 2017年10月26日 上午11:32:36
 */
public class KafkaMessageListener implements MessageListener<String, String> {


	private static final Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);

	@Override
	public void onMessage(ConsumerRecord<String, String> record) {
		System.out.println("-----------kafka监听器启动了--------");
		System.out.println("kafka消息: " + record.key() + " : " + record.value());
	}

}
