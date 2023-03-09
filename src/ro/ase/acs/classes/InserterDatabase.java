package ro.ase.acs.classes;

import ro.ase.acs.interfasce.DatabaseInsert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserterDatabase implements DatabaseInsert {
    public static final String SQL_INSERT_WITH_PARAMS = "INSERT INTO employees VALUES (?,?,?,?)";

    @Override
    public void insertData(Connection connection, int index, String name, String address, double salary) throws SQLException {

        PreparedStatement preparedStatement =
                connection.prepareStatement(SQL_INSERT_WITH_PARAMS);
        preparedStatement.setInt(1, index);
        preparedStatement.setString(2, name);
        preparedStatement.setString(3, address);
        preparedStatement.setDouble(4, 4000);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.commit();
    }
}
