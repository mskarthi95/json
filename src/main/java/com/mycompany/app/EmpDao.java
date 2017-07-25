 
  package com.mycompany.app;
import java.util.*;  
import java.sql.*; 
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class EmpDao extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// defining the PrintWriter object
		PrintWriter out = response.getWriter();
		
		// setting the response type
		response.setContentType("application/json");
		
		// creating employee object 
  
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "");
List<Emp> list=new ArrayList<Emp>();
            //Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from user905");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e=new Emp();  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setCountry(rs.getString(5));  
                list.add(e);  
            }  
            System.out.println(list);
            con.close();  
        }catch(Exception ee){ee.printStackTrace();}  
          
       
    }  
}