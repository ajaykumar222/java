package anything;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class mySql {

	public static void main(String[] args) throws SQLException  {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		Statement stmt=con.createStatement();
		String s ="SELECT * FROM Sampledata";
		stmt.execute(s);
		con.close();
		System.out.println("the query was executed");

	}

}
