package controller.sankar;

import java.io.IOException;
import java.util.List;
import java.util.PrimitiveIterator.OfDouble;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import EmployeeDAO.sankar.EmployeeDAO;
import EmployeeDAO.sankar.EmployeeDAOImpl;
import Entity.sankar.Employee;
import jdk.nashorn.internal.codegen.CompilerConstants.Call;

public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
   //create a reference  variable for employee DAO
	EmployeeDAO employeeDAO = null;
	//create the constructor and initilize employee DAO
	public EmployeeController() {
	employeeDAO = new EmployeeDAOImpl();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		//Call dao Method to get list OfDouble employees
		List<Employee>list = employeeDAO.get();
		
		// Add the employees to request object
		request.setAttribute("list", list);
		
		//Get the request dispatcher
		RequestDispatcher dispatcher=request.getRequestDispatcher("/views/employee-list.jsp");
	    
		//forward the req and res objects
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String dob = request.getParameter("dob");
		String department = request.getParameter("department");
		System.out.println("First name:"+name);
		System.out.println("date of birth :"+dob);
		System.out.println("depertment:"+department);
	}

}
