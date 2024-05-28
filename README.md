# KafkaProducer-API

This repository contains a Java Maven project that demonstrates how to produce messages to Apache Kafka using the KafkaProducer API. The code continuously sends messages to a Kafka topic with a specified delay between messages.

<img src="https://kafka.apache.org/images/apache-kafka.png" alt="Kafka Logo" width="200">

## Prerequisites
Before running this example, ensure you have the following installed:
- Java Development Kit (JDK)
  You can download JDK from [here](https://www.oracle.com/java/technologies/downloads/#jdk22-windows).
- Apache Kafka
  You can download Apache Kafka from [here](https://kafka.apache.org/downloads).

## Setup
1. Clone this repository to your local machine.
   ```bash
   git clone https://github.com/yousshaj/KafkaProducer-API
2. Navigate to the Kafka directory.
    ```bash
    cd c:\kafka
3. Make sure Apache Kafka is running.
    ```bash
    start bin\windows\kafka-server-start config\server.properties

4. Also run the zookeeper-server.
    ```bash
    start bin\windows\zookeeper-server-start config\zookeeper.properties

5. Create Kafka topics.
   ```bash
   bin\windows\kafka-topics --create --topic Topic1 --bootstrap-server localhost:9092

6. Create Kafka Consumer.
   ```bash
   bin\windows\kafka-console-consumer --topic Topic1 --bootstrap-server localhost:9092

## Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or create a pull request.

## License
This project is licensed under the [MIT License](LICENSE).

#ScreenShots of the program : 
<br><img src="/screen/1.png" alt="Kafka Logo" width="800"><br>
<img src="/screen/2.png" alt="Kafka Logo" width="800"><br>
<img src="/screen/3.png" alt="Kafka Logo" width="800"><br>
<img src="/screen/4.png" alt="Kafka Logo" width="800"><br>
<img src="/screen/5.png" alt="Kafka Logo" width="800"><br>
<img src="/screen/6.png" alt="Kafka Logo" width="800">
