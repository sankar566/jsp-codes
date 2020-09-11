package Entity.sankar;

public class Employee {
	 // 1. define the fields
	
private Integer id;
private String name;
private String dob;
private String deoartment;
//2. Generate getter and setter
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getDeoartment() {
	return deoartment;
}
public void setDeoartment(String deoartment) {
	this.deoartment = deoartment;
}

//3. Generate toString()

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", deoartment=" + deoartment + "]";
}

	
}
