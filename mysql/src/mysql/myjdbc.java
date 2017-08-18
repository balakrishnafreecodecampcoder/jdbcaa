package mysql;
import java.sql.*;
public class myjdbc extends property_file {
  	   		   public static void main(String[] args) throws SQLException {
  	   			   
  	   		Connection conn = null;
  	   	 PreparedStatement pStmt = null;
  	   		 try {
  	   		            Class.forName(driver);
  	   		     }
  	   		            catch(ClassNotFoundException cnfex) {
  	   		            System.out.println("Problem in loading MySQL JDBC driver");
  	   		            cnfex.printStackTrace();
  	   		        }
  	   		         try {
  	   		            conn= DriverManager.getConnection(
  	   		          url,username ,password ); 
  	   		        String query = generalQuery;
  	   		      pStmt = conn.prepareStatement (query);
  	   		           int sqlQueryResult = pStmt.executeUpdate();
  	   		            if(0 == sqlQueryResult) {
  	   		                System.out.println("New table created successfully");
  	   		            }
  	   		            else {
  	   		                System.out.println("Error in creating table");
  	   		            }
  	   		        }
  	   		        catch(SQLException sqlex){
  	   		            sqlex.printStackTrace();
  	   		        }
  	   		        finally {
  	   		       
  	   		       conn.close();     
  	   		                }
  	   		           	   		      	   		            }
  	   		     	   		}