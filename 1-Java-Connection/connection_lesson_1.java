package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Connection class
 *
 * @author Samadhi
 * @version 1
 * @date 2021/04/05
 */
public class MyConnection {

    public static Connection toConnect() {
        String url = "jdbc:mysql://localhost:port/data_base";
        String user = "user";
        String password = "password";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "SUCCESSFULLY CONNECTED!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "CONNECTION ERROR! " + ex);
        }
        return conn;
    }
}
