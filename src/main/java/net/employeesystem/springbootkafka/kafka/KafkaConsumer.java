package net.employeesystem.springbootkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @KafkaListener(topics="${spring.kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    public void consume(String message){
        LOGGER.info(String.format("message recieved  %s",message) );
    }
}
