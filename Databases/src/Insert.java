import java.sql.*;
public class Insert {

	public static void main(String[] args) throws Exception {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con = DriverManager.getConnection("jdbc:derby:C:/mynewdb/company");
		Statement stmt = con.createStatement();
		String sql = "INSERT INTO employee(id,name,salary) VALUES "+" (4,'Heid:',10000)";
		int result = stmt.executeUpdate(sql);
		System.out.println(result +"row affexted");
		stmt.close();
		con.close();
	}

}