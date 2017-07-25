package com.mycompany.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.*;
import java.sql.SQLException;


/**
 * 
 * @author Dinesh Krishnan
 *
 */

public class EmployeeService extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// defining the PrintWriter object
		PrintWriter out = response.getWriter();
		
		// setting the response type
		response.setContentType("application/json");
		
		// creating employee object
		Employee employee = new Employee();
	//	List<Employee> emp=new ArrayList<Employee>();
		try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "");
            
            PreparedStatement ps=con.prepareStatement("select * from employee");  
            ResultSet rs1=ps.executeQuery();  
           while(rs1.next()) 
		   {
     //System.out.println( rs1.getInt(1)+" "+rs1.getString(2)+"  "+rs1.getString(3)+" "+rs1.getDate(4)+" "+rs1.getString(5)+" "+rs1.getInt(6)); 
		// setting the attributes
		employee.setEmpId(rs1.getInt(1));
		employee.setEmpName(rs1.getString(2));
		employee.setEmpAge(rs1.getInt(3));
		employee.setEmpQualifcation(rs1.getString(4));
		employee.setEmpEmailId(rs1.getString(5));
		employee.setEmpPhone(rs1.getString(6));
		out.println(JSONConverter.convert(employee));
		   }
		// converting object to json using Gson api.
		
	con.close();

            }
            catch(Exception e)
            {
                System.out.println(e);
            }
				out.close();
    }
	
	}

	