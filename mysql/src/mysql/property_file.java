package mysql;

public class property_file {
	static	String driver = "com.mysql.jdbc.Driver";
	static	String url = "jdbc:mysql://localhost:3306/test";
	static	String username ="root";
	static	String password = "root";
static String generalQuery ="CREATE TABLE PLAYER23(" +
           " PLAYER_ID INT(6) NOT NULL AUTO_INCREMENT, " +
           " NAME VARCHAR(50) NOT NULL, " + 
           " AGE INT(3) NOT NULL, " + 
           " MATCHES INT(3) NOT NULL, " + 
           " PRIMARY KEY (`PLAYER_ID`))";
}
