import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DBConnection1 {
	static Connection connection = null;
	static String databaseName = "";
	static String url = "jdbc:mysql://localhost:3306/" +databaseName;
	static String username = "root";
	static String password = "pass@word1";

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connection =  DriverManager.getConnection(url, username, password);
		PreparedStatement ps = connection.prepareStatement("INSERT INTO `traveldatabase`.`traveluser` (`name`) VALUES ('Sathwik Bhat');");
		int status = ps.executeUpdate();
		if (status!=0) {
			System.out.println("Database was connected");
			System.out.println("Record was inserted");
		}
	}

}
