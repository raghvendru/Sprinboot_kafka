package net.employeesystem.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @Value("${spring.kafka.topic-json.name}")
    private String topicJsonName;

//    @Bean
//    public NewTopic myTopic(){
//        return TopicBuilder.name("mytopic")
//                .build();
//    }

//    @Bean
//    public NewTopic myTopicjson(){
//        return TopicBuilder.name("mytopic_json")
//                .build();
//    }

    @Bean
    public NewTopic myTopic(){
        return TopicBuilder.name("topicJsonName")
                .build();
    }
}
