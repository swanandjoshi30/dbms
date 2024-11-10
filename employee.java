import java.sql.*;
class employee{
public static void main(String args[]){
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con = DriverManager.getConnection("jdbc : odbc: abc " ) ;
System.out.println("Connection established");
Statement st = con.createStatement();

st.execute("create table employee (product_id int,product_name varchar(20))");
System. out.println(" created");
con. close();
}
catch(Exception e){
    System.out.println("Error");
}
}
}