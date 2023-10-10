package br.com.bossini.app;

import java.sql.Connection;
import javax.swing.JOptionPane;

public class TestConectar {
    public static void main(String[] args){
        try {
            var factory = new ConnectionFactory();
            var minhaConexao = factory.conectar();
            System.out.println("Foi !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
        
    }
}
