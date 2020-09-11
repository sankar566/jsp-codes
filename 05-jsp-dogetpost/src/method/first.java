package method;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class first extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String firtName=req.getParameter("fn");
		 String lastName=req.getParameter("ln");
	     String fullName= firtName+lastName;
	     
	     System.out.println("my name is " +fullName);
	     String department=req.getParameter("dept");
	     String birth=req.getParameter("dob");
	     System.out.println(" his date of birth is " +birth+ " and his department is "+department);
		
	}
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//	}

}
