
package Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author gayan
 */
public class MyConnection {
    private static final String username ="root";
    private static final String password ="Gayan@12345678";
    private static final String dataConn ="jdbc:mysql://localhost:3306/student_management";
    private static Connection con =null;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dataConn, username, password);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
        
}
