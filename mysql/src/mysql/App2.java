package mysql;

import java.io.*;
import java.util.Properties;

public class App2 {
  public static void main(String[] args) {
	Properties prop = new Properties();
	InputStream input = null;
	try {
		FileInputStream fis = new  FileInputStream("C:/Users/Tatvik SriMunesh/workspace/mysql/config.properties");
			
		prop.load(fis);
		System.out.println(prop.getProperty("database"));
		System.out.println(prop.getProperty("dbuser"));
		System.out.println(prop.getProperty("dbpassword"));
		
	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}}}}
