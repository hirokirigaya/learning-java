package co.danieldev.oneforall.javacore.ZZCjdbc.repository;

import co.danieldev.oneforall.javacore.ZZCjdbc.conn.ConnectionFactory;
import co.danieldev.oneforall.javacore.ZZCjdbc.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());

        try (Connection conn = ConnectionFactory.Connection();
             Statement stmt = conn.createStatement()
        ) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}'.Affected rows in the database {}", producer.getName(), rowsAffected);
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
            log.info("Deleted producer '{}'.Affected rows in the database {}", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error trying to delete producer '{}'", id, e);
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');".formatted(producer.getName(), producer.getId());

        try (Connection conn = ConnectionFactory.Connection();
             Statement stmt = conn.createStatement()
        ) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer with id '{}'.Affected rows in the database {}", producer.getId(), rowsAffected);
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
                producers.add(getProducer(rs));
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

    public static void showDriverMetaData() {
        try (Connection conn = ConnectionFactory.Connection()) {
            DatabaseMetaData dbMetaData = conn.getMetaData();

            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FORWARD_ONLY");

                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("Supports CONCUR_UPDATABLE");
                }
            }
            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE");

                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("Supports CONCUR_UPDATABLE");
                }
            }
            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports TYPE_SCROLL_SENSITIVE");

                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("Supports CONCUR_UPDATABLE");
                }
            }

        } catch (SQLException e) {
            log.error("Error trying to showing meta data of the db", e);
        }
    }
    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM `anime_store`.`producer`;";
        try (Connection conn = ConnectionFactory.Connection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)
        ) {

            log.info("Last row? {}", rs.last());
            log.info("Row number {}", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            log.info("-----------------");

            log.info("First row? {}", rs.first());
            log.info("Row number {}", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            log.info("-----------------");

            log.info("Absolute row? {}", rs.absolute(4));
            log.info("Row number {}", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            log.info("-----------------");

            log.info("Relative row? {}", rs.relative(+1));
            log.info("Row number {}", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            log.info("-----------------");

            log.info("Is Last row? {}", rs.isLast());
            log.info("Row number {}", rs.getRow());
            log.info("-----------------");

            log.info("Is First row? {}", rs.isLast());
            log.info("Row number {}", rs.getRow());
            log.info("-----------------");

            log.info("Last row? {}", rs.last());
            log.info("Row number {}", rs.getRow());
            rs.afterLast();
            while (rs.previous()) {
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            }
        } catch (SQLException e) {
            log.error("Error trying to execute type scroll", e);
        }
    }

    public static List<Producer> findByNameAndUpdateToLowerCase(String name) {
        String sql = "SELECT * FROM `anime_store`.`producer` WHERE name LIKE '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.Connection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)
        ) {
            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toLowerCase());
                rs.updateRow();

                producers.add(getProducer(rs));
            }
        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }

        return producers;
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        String sql = "SELECT * FROM `anime_store`.`producer` WHERE name LIKE '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.Connection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)
        ) {
            if(rs.next()) return producers;

            insertNewProducer(name, rs);

            producers.add(getProducer(rs));
        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }

        return producers;
    }

    public static void findByNameAndDelete(String name) {
        String sql = "SELECT * FROM `anime_store`.`producer` WHERE name LIKE '%%%s%%';".formatted(name);
        try (Connection conn = ConnectionFactory.Connection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)
        ) {
            while (rs.next()) {
               log.info("Deleting '{}'", rs.getString("name"));
               rs.deleteRow();
            }
        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }

    }

    public static List<Producer> findByNamePreparedStatement(String name) {
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.Connection();
             PreparedStatement ps = preparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()
        ) {
            while (rs.next()) {
                producers.add(getProducer(rs));
            }
        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }

        return producers;
    }

    public static List<Producer> findByNameCallableStatement(String name) {
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.Connection();
             CallableStatement ps = callableStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()
        ) {
            while (rs.next()) {
                producers.add(getProducer(rs));
            }
        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }

        return producers;
    }


    public static void updatePreparedStatement(Producer producer) {
        try (Connection conn = ConnectionFactory.Connection();
             PreparedStatement ps = preparedStatementUpdate(conn, producer);
        ) {
            int rowsAffected = ps.executeUpdate();
            log.info("Updated producer with id '{}'.Affected rows in the database {}", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error trying to update producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement preparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM `anime_store`.`producer` WHERE name LIKE ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,  String.format("%%%s%%",name));
        return ps;
    }
    private static CallableStatement callableStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "CALL `anime_store`.`sp_get_producer_by_name`(?);";
        CallableStatement ps = conn.prepareCall(sql);
        ps.setString(1,  String.format("%%%s%%",name));
        return ps;
    }


    private static PreparedStatement preparedStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,  producer.getName());
        ps.setString(2,  producer.getId().toString());
        return ps;
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        return Producer
                .builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .build();
    }

    private static void insertNewProducer(String name, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("name", name);
        rs.insertRow();

        rs.beforeFirst();
        rs.next();
    }
}
