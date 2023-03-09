package ro.ase.acs.classes;

import ro.ase.acs.interfasce.DatabaseWriting;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WriterDatabase implements DatabaseWriting {
    @Override
    public void printData(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println("id: " + rs.getInt("id"));
            System.out.println("name: " + rs.getString(2));
            System.out.println("address: " + rs.getString("address"));
            System.out.println("salary: " + rs.getDouble("salary"));
        }
        rs.close();
    }
}
