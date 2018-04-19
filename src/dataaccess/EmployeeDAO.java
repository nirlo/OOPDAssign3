package dataaccess;

import factory.DTOFactoryCreator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import factory.Factory;
import transfer.Employee;

public class EmployeeDAO implements DAO<Employee> {
	
	private static final String GET_ALL_EMPLOYEES = "SELECT * FROM employees ORDER BY emp_no";
	
	private static final String GET_BY_CODE_EMPLOYEE = "SELECT * FROM employees WHERE emp_no = ?";
	
	private static final String INSERT_EMPLOYEE = "INSERT INTO employees (emp_no, first_name, last_name, gender, hire_date) VALUES(?, ?, ?, ?, ?, ?)";
	
	private static final String UPDATE_EMPLOYEE = "UPDATE employees SET last_name = ? WHERE emp_no = ?";
	
	private static final String DELETE_EMPLOYEE = "DELETE FROM employees WHERE emp_no = ?";
	
	private Factory<Employee> factory;
	
	
	
	@SuppressWarnings("unchecked")
	public EmployeeDAO() {
		factory = (Factory<Employee>) DTOFactoryCreator.getFactory(Employee.class);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAll() {
		List<Employee> list = Collections.emptyList();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			DataSource ds = new DataSource();
			con = ds.createConnection();
			pstmt = con.prepareStatement(GET_ALL_EMPLOYEES);
			rs = pstmt.executeQuery();
			list = (List<Employee>)factory.createListFromResultSet(rs);
			
		}catch(SQLException ex) {
			Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return list;
	}

	@Override
	public Employee getByID(String id) {
		Employee employee = new Employee();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			DataSource ds = new DataSource();
			con = ds.createConnection();
			pstmt = con.prepareStatement(GET_BY_CODE_EMPLOYEE);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			employee = (Employee) factory.createListFromResultSet(rs);
		}catch(SQLException ex) {
			Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
		return employee;
	}

	@Override
	public void add(Employee t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( INSERT_EMPLOYEE);){
            pstmt.setLong(1, t.getEmpNo());
            pstmt.setDate(2, t.getBirthDate());
            pstmt.setString(3, t.getFirstName());
            pstmt.setString(4, t.getLastName());
            pstmt.setString(5, t.getGender());
            pstmt.setDate(6, t.getHireDate());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public void update(Employee t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( UPDATE_EMPLOYEE);){
            pstmt.setLong(1, t.getEmpNo());
            pstmt.setString(2, t.getLastName());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public void delete(Employee t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( DELETE_EMPLOYEE);){
            pstmt.setLong(1, t.getEmpNo());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

}
