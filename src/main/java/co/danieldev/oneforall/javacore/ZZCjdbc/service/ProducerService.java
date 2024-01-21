package co.danieldev.oneforall.javacore.ZZCjdbc.service;

import co.danieldev.oneforall.javacore.ZZCjdbc.domain.Producer;
import co.danieldev.oneforall.javacore.ZZCjdbc.repository.ProducerRepository;

public class ProducerService {
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }
    public static void delete(Integer id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static void requireValidId(Integer id) {
        if(id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid argument passed to id, it is bigger than 0? ");
        }
    }
}
