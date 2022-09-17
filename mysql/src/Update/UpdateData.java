package Update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		int id=155;
		String name="Let us Java";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdetails", "root", "root");
		String sql="update book set name=? where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setInt(2, id);
        int i=ps.executeUpdate();
		
		if(i==1) {
			System.out.println("Upate Data");
		}
	}

}
