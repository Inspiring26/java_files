import java.sql.*;
import com.mysql.jdbc.Statement;

public class TestJdbcMyself {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("ok");
		java.sql.Connection conn;
		conn=DriverManager.getConnection("jdbc:mysql://10.130.26.159/studentdata","admin","admin");
		System.out.println(conn);
		Statement stmt=(Statement) conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from pudong where name = '黄勇'");
		while(rs.next()){                          
		    String name=rs.getString("name");
		     String plan=rs.getString("plan");
		     System.out.println("name------"+name+"--------plan-"+plan);
		    }
	}

}