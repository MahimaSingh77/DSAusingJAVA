import java.sql.*;

public class frist {

public static void main(String args[])
{
Connection con = null;
Statement st = null;

try
{
// Load driver class
Class.forName("com.mysql.jdbc.Driver");
System.out.println("Driver Loaded");

// Obtain a connection
con = DriverManager.getConnection("","","");
System.out.println("Database Connected Successfully!");

//Create Query
String sql = "INSERT INTO Student(sname, scity) values('ABC','Pune')";

// Obtain a statement

st = con.createStatement();
// Execute the query
int check = st.executeUpdate(sql);
if (check > 0)
{
System.out.println("Insert Done");
}
}
catch(Exception e)
{
System.out.println(e);
}
finally
{
//Close Connection
st.close();
con.close();
}
}
}