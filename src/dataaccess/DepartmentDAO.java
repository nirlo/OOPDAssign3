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
import transfer.Department;

public class DepartmentDAO implements DAO<Department> {
	
	private static final String GET_ALL_DEPARTMENT = "SELECT * FROM salaries ORDER BY emp_no";
	
	private static final String GET_BY_CODE_DEPARTMENT = "SELECT * FROM departments WHERE dept_no = ?";
	
	private static final String INSERT_DEPARTMENT = "INSERT INTO departments (dept_no, dept_name) VALUES(?, ?)";
	
	private static final String UPDATE_DEPARTMENT = "UPDATE departments SET dept_name = ? WHERE dept_no = ?";
	
	private static final String DELETE_DEPARTMENT = "DELETE FROM departments WHERE dept_no = ?";
	
	private Factory<Department> factory;
	
	
	
	@SuppressWarnings("unchecked")
	public DepartmentDAO() {
		factory = (Factory<Department>) DTOFactoryCreator.getFactory(Department.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Department> getAll() {
		List<Department> list = Collections.emptyList();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			DataSource ds = new DataSource();
			con = ds.createConnection();
			pstmt = con.prepareStatement(GET_ALL_DEPARTMENT);
			rs = pstmt.executeQuery();
			list = (List<Department>)factory.createListFromResultSet(rs);
			
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
	public Department getByID(String id) {
		Department department = new Department();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			DataSource ds = new DataSource();
			con = ds.createConnection();
			pstmt = con.prepareStatement(GET_BY_CODE_DEPARTMENT);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			department = (Department) factory.createListFromResultSet(rs);
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
		return department;
	}

	@Override
	public void add(Department t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( INSERT_DEPARTMENT);){
            pstmt.setString(1, t.getCode());
            pstmt.setString(2, t.getName());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public void update(Department t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( UPDATE_DEPARTMENT);){
            pstmt.setString(1, t.getName());
            pstmt.setString(2, t.getCode());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public void delete(Department t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( DELETE_DEPARTMENT);){
            pstmt.setString(1, t.getCode());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

}
