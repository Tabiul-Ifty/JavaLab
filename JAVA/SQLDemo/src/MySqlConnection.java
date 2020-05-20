import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnection {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tabiul","root","1070");

	    Statement mystat=con.createStatement();

	    ResultSet myrs=mystat.executeQuery("Select * from sample ");
        
	    while(myrs.next())

	    {

	    	System.out.println(myrs.getString("name")+"  , "+myrs.getInt("id")+"  , "+myrs.getDate("DOB"));
    
	    }

	}

}
