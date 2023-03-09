package ro.ase.acs.classes;

import ro.ase.acs.interfasce.DatabaseReading;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReaderDatabase implements DatabaseReading {
    public static final String SQL_SELECT = "SELECT * FROM employees";

    @Override
    public ResultSet readData(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(SQL_SELECT);
        return rs;
    }
}

