package com.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.config.AppConstant;

@Service
public class KafkaService {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private Logger logger = LoggerFactory.getLogger(KafkaService.class);
	
	public boolean updateLocation(String location) {
		this.kafkaTemplate.send(AppConstant.locationTopicName, location);
		this.logger.info("Location Produced");
		return true;
		
	}

}
