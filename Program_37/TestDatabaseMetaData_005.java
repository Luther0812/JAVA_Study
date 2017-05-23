/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_37;

/**
 * @author up
 *
 */
import java.sql.*;

public class TestDatabaseMetaData_005 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook", "scott", "tiger");
		System.out.println("Database connected");
		
		DatabaseMetaData dbMetaData = connection.getMetaData();
		System.out.println("Database URL: " + dbMetaData.getURL());
		System.out.println("Database username: " + dbMetaData.getUserName());
		System.out.println("Database product name: " + dbMetaData.getDatabaseProductName());
		System.out.println("Database product version: " + dbMetaData.getDatabaseProductVersion());
		System.out.println("JDBC driver name : " + dbMetaData.getDriverName());
		System.out.println("JDBC driver version: " + dbMetaData.getDriverVersion());
		System.out.println("JDBC driver major version: " + dbMetaData.getDriverMajorVersion());
		System.out.println("JDBC driver minor version: " + dbMetaData.getDriverMinorVersion());
		System.out.println("Max number of connections: " + dbMetaData.getMaxConnections());
		System.out.println("MaxTableNameLength: " + dbMetaData.getMaxTableNameLength());
		System.out.println("MaxColumnsInTables: " + dbMetaData.getMaxColumnsInTable());
	}

}
