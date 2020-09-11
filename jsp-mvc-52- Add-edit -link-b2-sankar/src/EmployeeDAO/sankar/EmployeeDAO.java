package EmployeeDAO.sankar;

import java.util.List;

import Entity.sankar.Employee;

public interface EmployeeDAO {
 List<Employee>get();
 boolean Save (Employee e);
}
 