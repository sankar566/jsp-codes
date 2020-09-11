package JSTL.sankar;

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
		student student = new student();
		student.setName("sankar");
		student.setAge(29);
	    student.setLocation("Tamilnadu");
	     
	     req.setAttribute("studentobject", student);
	  
	     
	RequestDispatcher dispatcher = req.getRequestDispatcher("/output.jsp");
    dispatcher.forward(req, resp);
	}


}
