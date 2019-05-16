/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Android
 */
public class ConnectionFactory {
     public  Connection getConnection() throws SQLException, ClassNotFoundException {
        try {
            Connection connection = null;
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            String nomeBD = "lojadegames";
            String url = "jdbc:mysql://localhost:3306/" + nomeBD + "?zeroDateTimeBehavior=convertToNull";
            String username = "root";
            String password = "";
            connection = DriverManager.getConnection(url, username, password);
            return connection;

        } catch (SQLException e) {
            System.out.println("Erro na conexão do banco de dados: " + e);
            return null;
        }
    }

    public void restartConnection() throws SQLException, ClassNotFoundException {
        getConnection().close();
        getConnection();
    }
}
