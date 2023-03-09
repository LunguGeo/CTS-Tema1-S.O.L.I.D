package ro.ase.acs.classes;

import ro.ase.acs.interfasce.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Orchestrator {
    private DatabaseConnection databaseConnection;
    private DatabaseCreateTable databaseCreateTable;
    private DatabaseInsert databaseInsert;
    private DatabaseReading databaseRead;
    private DatabaseWriting databaseWriting;

    public Orchestrator(DatabaseConnection databaseConnection, DatabaseCreateTable databaseCreateTable, DatabaseInsert databaseInsert, DatabaseReading databaseRead, DatabaseWriting databaseWriting) {
        this.databaseConnection = databaseConnection;
        this.databaseCreateTable = databaseCreateTable;
        this.databaseInsert = databaseInsert;
        this.databaseRead = databaseRead;
        this.databaseWriting = databaseWriting;
    }

    public void runWorkFlow() {
        try {
            Connection connection = databaseConnection.getConnection();
            databaseCreateTable.createTable(connection);
            databaseInsert.insertData(connection, 1, "Popescu Ion", "Bucharest", 4000);
            databaseInsert.insertData(connection, 2, "Ionescu Vasile", "Brasov", 4500);
            ResultSet resultSet = databaseRead.readData(connection);
            databaseWriting.printData(resultSet);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
