package dao;

import java.util.List;

import model.Employ;

public interface EmployDao {
	List<Employ> showEmploy();
	Employ searchEmploy(int empno);
	void updateEmploy(Employ employ);
	void deleteEmploy(int empno);
	void addEmploy(Employ employ);
}
