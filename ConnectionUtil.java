package com.nc.dao;
import java.sql.*;
public class ConnectionUtil {
private static Connection connection;
private ConnectionUtil() {}
public static Connection getConnection()
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
if(connection==null||connection.isClosed())
{
connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shivali12");	
}
}catch(Exception e)
{e.printStackTrace();}
return connection;
}
}
