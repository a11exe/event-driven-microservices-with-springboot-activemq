package com.alllexe.activemq.configuration;

import javax.jms.Queue;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

/**
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 04.12.2019
 */
@Configuration
@EnableJms
public class JmsConfig {

  @Bean
  public Queue queue(){
    return new ActiveMQQueue("test-queue");
  }
}
