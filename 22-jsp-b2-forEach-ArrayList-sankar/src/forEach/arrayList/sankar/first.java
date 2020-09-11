package forEach.arrayList.sankar;

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
	
	     List<student>s=new ArrayList<student>();	  
	     student student = new student();
	     student.setName("sankar");
	     student.setAge(28);
	     student.setLocation("chennai");
	     s.add(student); // add this student object to the  list
	      
	     student = new student(); //one more student object create
	     student.setName("ram");
	     student.setAge(25);
	     student.setLocation("tamilnadu");
	     s.add(student); // add this student object to the  list
	     
	     req.setAttribute("li", s);
	RequestDispatcher dispatcher = req.getRequestDispatcher("/output.jsp");
    dispatcher.forward(req, resp);
	}

 
}
