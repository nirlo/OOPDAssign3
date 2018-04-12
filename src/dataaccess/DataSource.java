package dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Shahriar Emami
 * @author Stanley Pieda
 * @see https://tomcat.apache.org/tomcat-8.0-doc/jndi-resources-howto.html
 */
public class DataSource {
	
//    public Connection createConnection() {
//        Connection connection = null;
//        try {
//            Context initCtx = new InitialContext();
//            Context envCtx = (Context) initCtx.lookup("jdbc:mysql://localhost:3306employees");
//            javax.sql.DataSource ds = (javax.sql.DataSource) envCtx.lookup("jdbc:mysql://localhost:3306employees");
//            connection = ds.getConnection();
//        } catch (NamingException | SQLException ex) {
//            Logger.getLogger(DataSource.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return connection;
//    }
	
	public Connection createConnection() throws SQLException{
		Connection connection = null;
		try{
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "root");
		}
		catch(SQLException e){
			e.printStackTrace();
	}
	return connection;
}
}