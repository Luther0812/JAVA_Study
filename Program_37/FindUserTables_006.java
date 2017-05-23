/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_37;

/**
 * @author up
 *
 */
import java.sql.*;

public class FindUserTables_006 {
	public static void main(String[] args)throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook", "scott", "tiger");
		System.out.println("Database connected");
		
		DatabaseMetaData dbMetaData = connection.getMetaData();
		
		ResultSet rsTables = dbMetaData.getTables(null, null, null, new String[]{"TABLE"});
		System.out.println("User tables:");
		while(rsTables.next()){
			System.out.print(rsTables.getString("TABLE_NAME") + " ");
		}
		
		connection.close();
	}

}
