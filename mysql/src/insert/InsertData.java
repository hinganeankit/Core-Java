package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		

		int id=564;
		String name="Thinking in java";
		double price=5555;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdetails", "root", "root");
		
		String query="insert into book values(?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setDouble(3, price);
		
        int i=ps.executeUpdate();
		
		if(i==1) {
			System.out.println("Data Update");	

	}

	}
}


