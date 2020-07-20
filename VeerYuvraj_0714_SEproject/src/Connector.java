import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connector {
	static PreparedStatement pst;
	static Connection con;
	public static void doConnect()
	 {
	 	    try {
			      	Class.forName("com.mysql.jdbc.Driver");
			      	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaworkbench","root","bce");
			     	System.out.println("Connection Established");
		} 
	 	     catch (ClassNotFoundException | SQLException e) 
	 	{
				e.printStackTrace();
			}
	 }
	    public static void doSaveProperty(int Area, int Cost, String PostalCode)
	    {
	   								      
			try {
				pst=con.prepareStatement("insert into properties(area,cost, postalcode)values(?,?,?)");
			    pst.setInt(1, Area);
			    pst.setInt(2, Cost);
				pst.setString(3, PostalCode);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   	
	    }

}
