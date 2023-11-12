package com.kafka.provider.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic generateTopic(){

        Map<String, String> configurations = new HashMap<>();

        //delete (Borra mensaje), compact (Mantiene el mas actual)
        configurations.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);
        //Tiempo de retencion de mensajes- defecto -1 (no se borran nunca)
        configurations.put(TopicConfig.RETENTION_MS_CONFIG, "86400000");
        //Tamaño maximo del segmento
        configurations.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1073741824");
        //Tamaño maximo de cada mensaje - por defecto 1MB
        configurations.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1000012");

        return TopicBuilder.name("unProgramadorNace-Topic")
                .partitions(2)
                .replicas(2)
                .configs(configurations)
                .build();
    }
}
