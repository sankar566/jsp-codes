package EmployeeDAO.sankar;

import java.util.List;

import Entity.sankar.Employee;

public interface EmployeeDAO {
 List<Employee>get();
 boolean Save (Employee e);
 Employee get(int id);
 boolean update(Employee e);
 boolean delete(int id);
}
 