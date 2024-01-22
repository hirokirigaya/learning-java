package co.danieldev.oneforall.javacore.ZZCjdbc.repository;

import co.danieldev.oneforall.javacore.ZZCjdbc.conn.ConnectionFactory;
import co.danieldev.oneforall.javacore.ZZCjdbc.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
   public static void save(Producer producer) {
       String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());

       try (Connection conn = ConnectionFactory.Connection();
            Statement stmt = conn.createStatement()
       ) {
           int rowsAffected = stmt.executeUpdate(sql);
           log.info("Inserted producer '{}'.Affected rows in the database {}",producer.getName(), rowsAffected);
       } catch (SQLException e) {
           log.error("Error trying to insert producer '{}'", producer.getName(), e);
       }
   }
   public static void delete(int id) {
       String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);

       try (Connection conn = ConnectionFactory.Connection();
            Statement stmt = conn.createStatement()
       ) {
           int rowsAffected = stmt.executeUpdate(sql);
           log.info("Deleted producer '{}'.Affected rows in the database {}",id, rowsAffected);
       } catch (SQLException e) {
           log.error("Error trying to delete producer '{}'", id, e);
       }
   }
   public static void update(Producer producer) {
       String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');".formatted(producer.getName(),producer.getId());

       try (Connection conn = ConnectionFactory.Connection();
            Statement stmt = conn.createStatement()
       ) {
           int rowsAffected = stmt.executeUpdate(sql);
           log.info("Updated producer with id '{}'.Affected rows in the database {}",producer.getId(), rowsAffected);
       } catch (SQLException e) {
           log.error("Error trying to update producer '{}'", producer.getId(), e);
       }
   }

    public static List<Producer> findAll() {
       return findByName("");
    }

    public static List<Producer> findByName(String name) {
        String sql = "SELECT * FROM `anime_store`.`producer` WHERE name LIKE '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.Connection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)
        ) {
            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }

        return producers;
    }

    public static void showResultMetaData() {
        String sql = "SELECT * FROM `anime_store`.`producer`;";
        try (Connection conn = ConnectionFactory.Connection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)
        ) {

            ResultSetMetaData rsMetaData = rs.getMetaData();
            int columnCount = rsMetaData.getColumnCount();

            log.info("Column count '{}'", columnCount);

            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name {}", rsMetaData.getTableName(i));
                log.info("Column name {}", rsMetaData.getColumnName(i));
                log.info("Column size {}", rsMetaData.getColumnDisplaySize(i));
                log.info("Column type {}", rsMetaData.getColumnTypeName(i));
            }

        } catch (SQLException e) {
            log.error("Error trying to showing meta data of the producers", e);
        }


    }
}
