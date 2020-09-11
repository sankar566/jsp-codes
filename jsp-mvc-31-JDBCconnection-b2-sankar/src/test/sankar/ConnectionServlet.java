package test.sankar;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;  
       
  
    public ConnectionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
      //define the fields
		String username="root";
		String password="root";
		String jdbcURL = "jdbc:mysql://localhost:3306/employeedirectory";
		String driver= "com.mysql.jdbc.Driver";
		try {
			
			//Get the printWriter object
			PrintWriter writer=response.getWriter();
			writer.println("conncting to database" +jdbcURL);
			//Load the driver 
			Class.forName(driver);
			 // get the connection
			Connection connection=DriverManager.getConnection(jdbcURL,username,password);
			writer.println("connection successfull");
			// close the connection 
			connection.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
