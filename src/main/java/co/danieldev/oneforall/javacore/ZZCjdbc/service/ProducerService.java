package co.danieldev.oneforall.javacore.ZZCjdbc.service;

import co.danieldev.oneforall.javacore.ZZCjdbc.domain.Producer;
import co.danieldev.oneforall.javacore.ZZCjdbc.repository.ProducerRepository;

import java.util.List;

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
    public static void updatePreparedStatement(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.updatePreparedStatement(producer);
    }

    public static List<Producer> findAll() {
        return ProducerRepository.findAll();
    }

    public static List<Producer> findByName(String name) {
        return ProducerRepository.findByName(name);
    }

    public static List<Producer> findByNamePreparedStatement(String name) {
        return ProducerRepository.findByNamePreparedStatement(name);
    }
    public static List<Producer> findByNameCallableStatement(String name) {
        return ProducerRepository.findByNameCallableStatement(name);
    }

    public static List<Producer> findByNameAndUpdateToLowerCase(String name) {
        return ProducerRepository.findByNameAndUpdateToLowerCase(name);
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        return ProducerRepository.findByNameAndInsertWhenNotFound(name);
    }

    public static void findByNameAndDelete(String name) {
        ProducerRepository.findByNameAndDelete(name);
    }

    public static void showResultMetaData() {
        ProducerRepository.showResultMetaData();
    }

    public static void showDriverMetaData() {
        ProducerRepository.showDriverMetaData();
    }

    public static void showTypeScrollWorking() {
        ProducerRepository.showTypeScrollWorking();
    }

    public static void requireValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid argument passed to id, it is bigger than 0? ");
        }
    }
}
