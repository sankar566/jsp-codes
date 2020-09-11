package forEach.sankar;


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
		
	  String[] countries = {"india", "pakistan", "usa" , "china", "america","japan" };	     
	  req.setAttribute("countryArray",countries);
	  RequestDispatcher dispatcher = req.getRequestDispatcher("/output.jsp");
    dispatcher.forward(req, resp); 
	}


}
