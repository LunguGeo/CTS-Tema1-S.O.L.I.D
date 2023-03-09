package ro.ase.acs.classes;

import ro.ase.acs.interfasce.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDatabase implements DatabaseConnection {
    private final String URL_DB = "jdbc:sqlite:database.db";

    @Override
    public Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(URL_DB);
        connection.setAutoCommit(false);
        return connection;

    }
}
