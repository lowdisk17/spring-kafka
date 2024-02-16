package com.kafka.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic myTopic() {
        return new NewTopic("my-topic", 2, (short) 1);
    }
    
}
