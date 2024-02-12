package testScripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EmpDBTest
{
    static Connection con=null;
	
	private static Statement stmt;
	
	public static String DB_URL="jdbc:sqlite:C:\\sqlite\\EmpDB.db";
	
	public static String DB_USER="";
	
	public static String DB_PASSWORD="";
	@BeforeTest
	public void setUp()throws Exception
	{
		try
		{
			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			stmt=con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test
	  public void test()
	  {
		  try
		  {
			  String query1="SELECT emp.emp_name FROM employee emp JOIN department dept ON emp.dept_id = dept.dept_id WHERE dept.dept_name = 'HR';";
			  ResultSet res1=stmt.executeQuery(query1);
			  String empName="";
			  while(res1.next())
			  {
				  empName=res1.getString("emp_name");
			  }
			  System.out.println("Employee name: "+empName);
			  
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }
	@AfterTest
	  public void tearDown()throws Exception
	  {
		  if(con!=null)
		  {
			  con.close();
		  }
	  }
}
