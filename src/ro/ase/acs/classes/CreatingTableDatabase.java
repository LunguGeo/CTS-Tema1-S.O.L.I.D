package ro.ase.acs.classes;

import ro.ase.acs.interfasce.DatabaseCreateTable;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingTableDatabase implements DatabaseCreateTable {
    public static final String SQL_DROP = "DROP TABLE IF EXISTS employees";
    public static final String SQL_CREATE = "CREATE TABLE employees(id INTEGER PRIMARY KEY,"
            + "name TEXT, address TEXT, salary REAL)";

    @Override
    public void createTable(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate(SQL_DROP);
        statement.executeUpdate(SQL_CREATE);
        statement.close();
        connection.commit();
    }
}
