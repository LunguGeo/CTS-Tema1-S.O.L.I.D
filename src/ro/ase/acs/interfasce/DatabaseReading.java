package ro.ase.acs.interfasce;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface DatabaseReading {
    ResultSet readData(Connection connection) throws SQLException;
}
