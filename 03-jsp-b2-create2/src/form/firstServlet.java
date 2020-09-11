package form;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class firstServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String firtName=req.getParameter("fn");
	 String lastName=req.getParameter("ln");
     String fullName= firtName+lastName;
     
     System.out.println("my name is" +fullName);
     
		
	}
	
}
