package controller.sankar;

import java.io.IOException;
import java.util.List;
import java.util.PrimitiveIterator.OfDouble;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.authenticator.SavedRequest;

import EmployeeDAO.sankar.EmployeeDAO;
import EmployeeDAO.sankar.EmployeeDAOImpl;
import Entity.sankar.Employee;
import jdk.nashorn.internal.codegen.CompilerConstants.Call;

public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	RequestDispatcher dispatcher= null;
	//create a reference  variable for employee DAO
	EmployeeDAO employeeDAO = null;
	//create the constructor and initilize employee DAO
	public EmployeeController() {
	employeeDAO = new EmployeeDAOImpl();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     String action = request.getParameter("action");
	     if(action == null)
	     {
	    	 action = "LIST";
	     }
	     switch(action) {
	     case "LIST":
	    	 listEmployees(request, response);
	    	 break;
	     case "EDIT":
	    	 getSingleEmployee(request, response);
	    	 break;
	     
		  default:
			listEmployees(request, response);
			break;
	     }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String id = request.getParameter("id");
//		String name = request.getParameter("name");
//		String dob = request.getParameter("dob");
//		String department = request.getParameter("department");
//		System.out.println("Employee id:"+id);
//		System.out.println("First name:"+name);
//		System.out.println("date of birth :"+dob);
//		System.out.println("depertment:"+department);
//	    Employee e = new Employee();
//	    e.setId(Integer.parseInt(id));
//	    e.setName(name);
//	    e.setDepartment(department);
//	    e.setDob(dob);
//	   
//	    if(employeeDAO.update(e)) {
//	    	request.setAttribute("message", "Update sucessfully");
//	    	
//	    }
//	    listEmployees(request,response);
//	   
//       
//	}
	
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String dob = request.getParameter("dob");
	String department = request.getParameter("department");

	Employee e = new Employee();
	e.setName(request.getParameter("name"));
	e.setDepartment(request.getParameter("department"));
	e.setDob(request.getParameter("dob"));
	

		
		if(employeeDAO.update(e)) {
			request.setAttribute("message", "Employee Saved Successfully!");
		}

	listEmployees(request, response);
}


	
	
	public void listEmployees(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Call dao Method to get list OfDouble employees
		List<Employee>list = employeeDAO.get();
		// Add the employees to request object
		request.setAttribute("list", list);
		//Get the request dispatcher
		dispatcher=request.getRequestDispatcher("/views/employee-list.jsp");
		//forward the req and res objects
		 dispatcher.forward(request, response);
	
	}
	
	public void getSingleEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
//		System.out.println("id:" +id);
		Employee employee = employeeDAO.get(Integer.parseInt(id));
		request.setAttribute("employee", employee);
		//Get the request dispatcher
		dispatcher=request.getRequestDispatcher("/views/employee-add.jsp");
		//forward the req and res objects
		 dispatcher.forward(request, response);
	}

}
