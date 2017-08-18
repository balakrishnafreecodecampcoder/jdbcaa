package mysql;
	import java.io.*;
	import java.util.Properties;

	public class App {
	  public static void main(String[] args) {
		Properties prop = new Properties();
		OutputStream output = null;
		try {
			output = new FileOutputStream("config.properties");
			prop.setProperty("database", "localhost:3306/test");
			prop.setProperty("dbuser", "root");
			prop.setProperty("dbpassword", "root");
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}}}}

