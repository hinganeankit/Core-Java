package del;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteOp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		int id=121;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdetails", "root", "root");
		
		String sql="delete from book where id=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setInt(1, id);
        
		int i=ps.executeUpdate();
		
		if(i==1) {
			System.out.println("Deleted Data");
		}

	}

}
