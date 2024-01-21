package co.danieldev.oneforall.javacore.ZZCjdbc.test;

import co.danieldev.oneforall.javacore.ZZCjdbc.conn.ConnectionFactory;
import co.danieldev.oneforall.javacore.ZZCjdbc.domain.Producer;
import co.danieldev.oneforall.javacore.ZZCjdbc.repository.ProducerRepository;
import co.danieldev.oneforall.javacore.ZZCjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Hiro Kirigaya").build();
        Producer producerToUpdate = Producer.builder().id(4).name("Yuuki Asuna").build();
//        ProducerService.save(producer);
//        ProducerService.delete(producer);
        ProducerService.update(producerToUpdate);
    }
}
