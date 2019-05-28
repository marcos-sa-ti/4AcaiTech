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
            String url = "jdbc:mysql://localhost:3307/ecommerceacaitech";
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
