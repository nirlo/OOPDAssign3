
import dataaccess.*;
import java.util.List;
import transfer.Department;
import transfer.DeptEmployee;
import transfer.DeptManager;
import transfer.Employee;
import transfer.Salary;
import transfer.Title;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pl
 */
public class TestMain {

	public static void main(String[] args){
	List<Employee> list = new EmployeeDAO().getAll();
	List<Salary> list2 = new SalaryDAO().getAll();
	List<Title> list3 = new TitleDAO().getAll();
	List<DeptManager> list4 = new DeptManagerDAO().getAll();
	List<Department> list5 = new DepartmentDAO().getAll();
	List<DeptEmployee> list6 = new DeptEmployeeDAO().getAll();
	}
	
}
