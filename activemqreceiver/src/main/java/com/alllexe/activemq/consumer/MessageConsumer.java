package com.alllexe.activemq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 04.12.2019
 */
@Component
@EnableJms
public class MessageConsumer {

  private final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

  @JmsListener(destination = "test-queue")
  public void listener(String message){
    logger.info("Message received {} ", message);
  }
}