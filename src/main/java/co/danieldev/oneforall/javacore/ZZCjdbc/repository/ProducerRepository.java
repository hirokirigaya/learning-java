package co.danieldev.oneforall.javacore.ZZCjdbc.repository;

import co.danieldev.oneforall.javacore.ZZCjdbc.conn.ConnectionFactory;
import co.danieldev.oneforall.javacore.ZZCjdbc.domain.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
   public static void save(Producer producer) {
       String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());

       try (Connection conn = ConnectionFactory.Connection();
            Statement stmt = conn.createStatement()
       ) {
           int rowsAffected = stmt.executeUpdate(sql);
           System.out.println(rowsAffected);
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
   }
}
