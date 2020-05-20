package mysql;
import java.sql.*;
public class MySQLAccess {
	public static void main(String[] args) {
		 try {
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tabiul","root","1070");
			 Statement stmt=con.createStatement();
			 ResultSet rs=stmt.executeQuery("SELECT * FROM tabiul");
			 while(rs.next()){
		          System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		          
		          
			 }
			 //int i=stmt.executeUpdate("delete from tabiul where first_name = 'bot'");
	           // System.out.println(i);
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	
}

}