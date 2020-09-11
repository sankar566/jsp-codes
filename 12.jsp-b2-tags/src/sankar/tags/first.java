package sankar.tags;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class first extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String firtName=req.getParameter("fn");
		 String lastName=req.getParameter("ln");
		 String birth =req.getParameter("dob");
	     String fullName= firtName+lastName;
	     
	     req.setAttribute("name", fullName);
	     req.setAttribute("dob", birth);
	RequestDispatcher dispatcher = req.getRequestDispatcher("/output.jsp");
    dispatcher.forward(req, resp);
	}


}
