# Event-Driven Microservices with Spring Boot and ActiveMQ

[original](https://itnext.io/event-driven-microservices-with-spring-boot-and-activemq-5ef709928482)

![Spring Boot and ActiveMQ](https://github.com/a11exe/eventdrivenmicroserviceswithspringbootactivemq/blob/master/SpringMQ.png.png)

Event-driven communication is important when propagating changes across several microservices and their related domain models. This means that when changes occur, we need some way to coordinate changes across the different models. This ensures reliable communication as well as loose coupling between microservices.
There are multiple patterns to achieve event-driven architecture. One of the common and popular one is messaging pattern. This is extremely scalable, flexible and guarantee delivery of messages. There are several tools that can be used for messaging pattern such as RabbitMQ, ActiveMQ, Apache Kafka and so on.

![MessagingPattern](https://github.com/a11exe/eventdrivenmicroserviceswithspringbootactivemq/blob/master/MessagingPattern.png)

## Installing ActiveMQ

Installed ActiveMQ by downloading [here](https://activemq.apache.org/components/classic/download/)
Once you have installed, the ActiveMQ server should be available at [http://localhost:8161/admin](http://localhost:8161/admin) and we will see the following welcome page.

![ActiveMQ](https://github.com/a11exe/eventdrivenmicroserviceswithspringbootactivemq/blob/master/ActiveMQ.png)

## Run receiver spring boot application

    git clone https://github.com/a11exe/activemqreceiver
    mvn spring-boot:run

## Run sender spring boot application

    git clone https://github.com/a11exe/activemqsender
    mvn spring-boot:run

## Testing ActiveMQ

Run both the applications and run the URL [http://localhost:8080/api/message/Welcome](http://localhost:8080/api/message/Welcome) to ActiveMQ! in browser or any REST API testing tool.
In the consumer application, we will see the following log in console.

    2019–08–06 22:29:57.667 INFO 17608 — [enerContainer-2] c.t.activemq.consumer.MessageConsumer : Message received Welcome to ActiveMQ!

What just happened is that the message was put on the queue. The consumer application that was listening to the queue read the message from queue.
In the ActiveMQ dashboard, navigate to Queue tab. We can see the details such as number of consumers to a queue, number of messages pending, queued and dequeued.

Stop the application activemq-receiver. Run this URL again http://localhost:8080/api/message/Welcome to ActiveMQ! In browser.
Navigate to ActiveMQ dashboard and notice the queue state.

