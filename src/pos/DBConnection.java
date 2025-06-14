package pos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author hasith
 */
public class DBConnection {
   
    public static Connection mycon (){
            Connection conn = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection ("jdbc:mysql://localhost/coffeeshop","root","");
                return conn;
            }catch (ClassNotFoundException | SQLException e)
            {
                System.out.println("Database connection failed: " + e.getMessage());
                return conn;
            }
    }
   
}
