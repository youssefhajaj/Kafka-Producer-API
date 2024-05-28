package kafka;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class Kafka_Word_Count {

    public static void main(String[] args) {
        
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<String,String> producer = new KafkaProducer<String, String>(props);

        
        String filePath = "file.txt";

        
        try (InputStream inputStream = Kafka_Word_Count.class.getClassLoader().getResourceAsStream(filePath);
             BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }
            String texte = sb.toString();

            
            int repetitions = detecterRepetitions(texte.toLowerCase(), "kafka");

            
            ProducerRecord<String, String> message = new ProducerRecord<String, String>("Topic1", "Le mot \"kafka\" apparaît " + repetitions + " fois dans le texte");
            producer.send(message);

            producer.close(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public static int detecterRepetitions(String texte, String mot) {
        int repetitions = 0;
        int index = texte.indexOf(mot);
        while (index != -1) {
            repetitions++;
            index = texte.indexOf(mot, index + 1);
        }
        return repetitions;
    }
}
