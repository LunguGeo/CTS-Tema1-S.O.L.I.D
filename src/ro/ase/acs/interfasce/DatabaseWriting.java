package ro.ase.acs.interfasce;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DatabaseWriting {
    void printData(ResultSet resultSet) throws SQLException;
}
