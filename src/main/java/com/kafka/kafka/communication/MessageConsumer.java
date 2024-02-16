package com.kafka.kafka.communication;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    // Listener as Queue for Partition 1
    @KafkaListener(topics = "my-topic", groupId = "my-group-id", containerFactory = "customKafkaListenerContainerFactory")
    public void listener1(String message, Acknowledgment acknowledgment) {
        System.out.println("Message 1: '" + message  + "' from customListener");
        acknowledgment.acknowledge();
    }

    // Listener as Queue for Partition 2
    @KafkaListener(topics = "my-topic", groupId = "my-group-id", containerFactory = "customKafkaListenerContainerFactory")
    public void listener2(String message, Acknowledgment acknowledgment) {
        System.out.println("Message 2: '" + message + "' from customListener");
        acknowledgment.acknowledge();
    }

    // Listener as Queue for Partition 1
    @KafkaListener(topics = "my-topic", groupId = "new-group-id", containerFactory = "kafkaListenerContainerFactory")
    public void listener3(String message) {
        System.out.println("Received message 1: " + message);
    }


}