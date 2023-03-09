package ro.ase.acs.interfasce;

import java.sql.Connection;
import java.sql.SQLException;

public interface DatabaseInsert {
    void insertData(Connection connection, int index, String name, String address, double salary) throws SQLException;
}
