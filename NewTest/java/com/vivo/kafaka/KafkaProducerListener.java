package com.vivo.kafaka;

import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.support.ProducerListenerAdapter;

public class KafkaProducerListener extends ProducerListenerAdapter<Object, Object> {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaProducerListener.class);
	
	@Override
	public void onSuccess(String topic, Integer partition, Object key, Object value, RecordMetadata recordMetadata) {
		LOG.info("生产者消息 OnSuccess : offset [{}]  partition [{}]", recordMetadata.offset(), recordMetadata.partition());
	}

	@Override
	public void onError(String topic, Integer partition, Object key, Object value, Exception exception) {
		LOG.error("发送消息失败  Topic :{}, Partition : {}, Key : {}, Value : {}", topic, partition, key, value, exception.getMessage());
	}

}
