package mysql;

import java.io.*;
import java.util.*;

public class App3 {
  public static void main(String[] args) {
	  
	Properties prop = new Properties();
	InputStream input = null;
	try {
	FileInputStream fis = new  FileInputStream("C:/Users/Tatvik SriMunesh/workspace/mysql/config.properties");
			
		prop.load(fis);
		Enumeration<?> e = prop.propertyNames();
		while (e.hasMoreElements()){
		String key = (String) e.nextElement();
		String value = prop.getProperty(key);
		System.out.println("key: "+key+" , Value : "+ value);
		}
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
