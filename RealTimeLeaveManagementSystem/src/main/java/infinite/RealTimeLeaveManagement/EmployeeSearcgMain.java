package infinite.RealTimeLeaveManagement;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeSearcgMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empno;
		System.out.println("Enter the Employee Number here ");
		empno = sc.nextInt();
		EmployeeDAO dao = new EmployeeDAO();
		try {
			Employee employee = dao.searchEmploy(empno);
			if(employee!=null) {
				System.out.println(employee);
			}else {
				System.out.println("the records does not found****");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
