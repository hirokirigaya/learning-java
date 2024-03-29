package co.danieldev.oneforall.javacore.ZZCjdbc.test;

import co.danieldev.oneforall.javacore.ZZCjdbc.conn.ConnectionFactory;
import co.danieldev.oneforall.javacore.ZZCjdbc.domain.Producer;
import co.danieldev.oneforall.javacore.ZZCjdbc.repository.ProducerRepository;
import co.danieldev.oneforall.javacore.ZZCjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Hiro Kirigaya").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();

//        ProducerService.save(producer);
//        ProducerService.delete(producer);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("Asuna");
//        log.info("Producers found {}", producers);
//        ProducerService.showResultMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToLowerCase("Kirito");
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("Dan Ferri");
//        log.info("Producers found {}", producers);
//          ProducerService.findByNameAndDelete("Dan Ferri");
//        List<Producer> producers = ProducerService.findByNamePreparedStatement("Daniel");
//        log.info("Producers found {}", producers);
//        ProducerService.updatePreparedStatement(producerToUpdate);
        List<Producer> producers = ProducerService.findByNameCallableStatement("Jao");
        log.info("Producers found {}", producers);

    }
}
