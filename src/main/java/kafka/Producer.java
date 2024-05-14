package kafka;



import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class Producer {

    public static void main(String[] args) {
        // Configuration
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<String,String> producer = new KafkaProducer<String, String>(props);

        // Continuous message sending
        try {
            while (true) {
                ProducerRecord<String, String> message = new ProducerRecord<String, String>("Topic1", "MSG send successfully");
                producer.send(message);
                Thread.sleep(1000); // Adjust delay between messages as needed
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            producer.close(); // Close the producer when done
        }
    }
}
