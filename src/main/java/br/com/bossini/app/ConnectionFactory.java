package br.com.bossini.app;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private final String host = "localhost";
    private final String port = "3306";
    private final String user = "root";
    // Máquinas da USJT : anima123
    private final String password = "anima123";
    private final String db = "psc_bossini";
    
    public Connection conectar() throws Exception {
        String s = String.format(
            "jdbc:mysql://%s:%s/%s",
            host, port, db    
        );
        
        Connection c = DriverManager.getConnection(
            s, 
            user, 
            password
        );
        
        return c;
    }
}
