package EmployeeDAO.sankar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBConnectionUtil.sankar.DBConnectionUtil;
import Entity.sankar.Employee;


public class EmployeeDAOImpl implements EmployeeDAO {
	
	Connection connection = null;
	ResultSet resultSet = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;

	 
	@Override
	public List<Employee> get() {
		
		List<Employee> list = null;
		Employee employee = null;
		
		try {
			
			list = new ArrayList<Employee>();
			//create the sql query
			String sql = "SELECT * FROM tbl_employee";
			// get the database connection
			connection = DBConnectionUtil.openConnection();
			// create the statement
			statement = connection.createStatement();
			// Execute the sql query
			resultSet = statement.executeQuery(sql);
			//process the result set
			while(resultSet.next()) {
				employee = new Employee();
				employee.setId(resultSet.getInt("id"));
				employee.setName(resultSet.getString("name"));
				employee.setDepartment(resultSet.getString("department"));
				employee.setDob(resultSet.getString("dob"));
				// Add employee to list
				list.add(employee);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		//return the list
		return list;
	}


	@Override
	public boolean Save(Employee e) {
		boolean flag = false;
		try {
			String sql = "INSERT INTO tbl_employee(name,dob,department)VALUES('"+e.getName()+"','"+e.getDob()+"','"+e.getDepartment()+"')";
			connection = DBConnectionUtil.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
			
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		return false;
	}

}