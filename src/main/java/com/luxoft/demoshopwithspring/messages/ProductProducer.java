package com.luxoft.demoshopwithspring.messages;

import com.luxoft.demoshopwithspring.configuration.KafkaProperties;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductProducer {
    private KafkaTemplate<String, ProductEvent> productKafkaTemplate;
    private KafkaProperties kafkaProperties;

    public ProductProducer(KafkaTemplate<String, ProductEvent> productKafkaTemplate,
                           KafkaProperties kafkaProperties) {
        this.productKafkaTemplate = productKafkaTemplate;
        this.kafkaProperties = kafkaProperties;
    }

    public void sendProductEventMessage(ProductEvent productEvent) {
        productKafkaTemplate.send(kafkaProperties.getProductTopic(), productEvent.getKey(), productEvent);
    }
}
