package ro.ase.acs.main;

import ro.ase.acs.classes.*;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Orchestrator orchestrator = new Orchestrator(new ConnectionToDatabase(), new CreatingTableDatabase(), new InserterDatabase(),
                new ReaderDatabase(), new WriterDatabase());
        orchestrator.runWorkFlow();


    }
}
