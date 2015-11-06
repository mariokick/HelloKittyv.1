import java.sql.*;
public class Select {
 
	public static void main(String[] args) throws Exception {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con = DriverManager.getConnection("jdbc:derby:C:/mynewdb/company");
		Statement stmt = con.createStatement();
		String sql = "SELECT * FROM employee";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			String str = rs.getInt("id") + " " 
						+ rs.getString("name") +  " "
						+ rs.getDouble("salary");
			System.out.println(str);
			
		}
		stmt.close();
		con.close();
	}

}