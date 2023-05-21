package br.com.kafka.consumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    // ação a ser realizada com a mensagem
    @KafkaListener(topics = "${topic.bora-praticar}", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info("Consume message -> {}", message);
    }
}