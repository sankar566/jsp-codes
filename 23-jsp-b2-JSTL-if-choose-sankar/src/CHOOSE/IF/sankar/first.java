package CHOOSE.IF.sankar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class first extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  
	     String s  = req.getParameter("mark");
	     int marks=Integer.parseInt(s);
	    
	     req.setAttribute("mar", marks);
	RequestDispatcher dispatcher = req.getRequestDispatcher("/output.jsp");
    dispatcher.forward(req, resp);
	}

 
}
