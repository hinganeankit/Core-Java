package read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FecthData {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdetails","root","root");
		
		String sql="select*from book";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			  
			  System.out.print("   Book Id    "+rs.getInt(1));
			  System.out.print("   Book Name  "+rs.getString(2));
			  System.out.println(" Book Price "+rs.getFloat(3));
			  
		  }
		  
		  rs.close();
	}

}
