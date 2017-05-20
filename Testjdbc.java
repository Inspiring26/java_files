import java.sql.*;

import com.mysql.jdbc.Statement;


public class Testjdbc {
	public static void main(String[] args){ 
	  try {
		   
		    Class.forName("com.mysql.jdbc.Driver");
		    System.out.println("ok");
		    java.sql.Connection conn;
		    conn=DriverManager.getConnection("jdbc:mysql://10.130.26.159/studentdata","admin","admin");
		    System.out.println("conn-------------"+conn);
		    Statement stmt=(Statement) conn.createStatement();
		    ResultSet rs=stmt.executeQuery("select * from pudong");
		    while(rs.next()){                          
		    String name=rs.getString("name");
		     String sex=rs.getString("plan");
		     System.out.println("name------"+name+"--------plan-"+sex);
		    }
		   } catch (ClassNotFoundException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   } catch (SQLException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }
}
	}
