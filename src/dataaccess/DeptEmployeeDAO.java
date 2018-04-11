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

import factory.DeptEmpFactory;
import factory.Factory;
import transfer.DeptEmployee;

public class DeptEmployeeDAO implements DAO<DeptEmployee> {
	
	private static final String GET_ALL_DEPT_EMPLOYEE = "SELECT * FROM dept_emp ORDER BY emp_no";
	
	private static final String GET_BY_CODE_DEPT_EMPLOYEE = "SELECT * FROM dept_emp WHERE emp_no = ? AND dept_no = ?";
	
	private static final String INSERT_DEPT_EMPLOYEE = "INSERT INTO dept_emp (emp_no, dept_no, from_date, to_date) VALUES (?, ?, ?, ?)";
	
	private static final String UPDATE_DEPT_EMPLOYEE = "UPDATE dept_emp SET to_date = ? WHERE emp_no = ? AND dept_no = ?";
	
	private static final String DELETE_DEPT_EMPLOYEE = "DELETE FROM dept_emp WHERE emp_no = ? AND dept_no = ?";
	
	private Factory<DeptEmployee> factory;
	
	
	
	public DeptEmployeeDAO() {
		
		factory = DTOFactoryCreator.getFactory(DeptEmployee.class);
	}

	@Override
	public List<DeptEmployee> getAll() {
		List<DeptEmployee> list = Collections.emptyList();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			DataSource ds = new DataSource();
			con = ds.createConnection();
			pstmt = con.prepareStatement(GET_ALL_DEPT_EMPLOYEE);
			rs = pstmt.executeQuery();
			list = (List<DeptEmployee>)factory.createListFromResultSet(rs);
			
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
	public DeptEmployee getByID(String id) {
		DeptEmployee deptEmp = new DeptEmployee();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			DataSource ds = new DataSource();
			con = ds.createConnection();
			pstmt = con.prepareStatement(GET_BY_CODE_DEPT_EMPLOYEE);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			deptEmp = factory.createFromResultSet(rs);
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
		return deptEmp;
	}

	@Override
	public void add(DeptEmployee t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( INSERT_DEPT_EMPLOYEE);){
            pstmt.setLong(1, t.getDeptNo());
            pstmt.setLong(2, t.getEmpNo());
            pstmt.setDate(3, t.getFromDate());
            pstmt.setDate(4, t.getToDate());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public void update(DeptEmployee t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( UPDATE_DEPT_EMPLOYEE);){
            pstmt.setDate(1, t.getToDate());
            pstmt.setLong(2, t.getEmpNo());
            pstmt.setLong(3, t.getDeptNo());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public void delete(DeptEmployee t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( DELETE_DEPT_EMPLOYEE);){
            pstmt.setLong(1, t.getEmpNo());
            pstmt.setLong(2, t.getDeptNo());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

}
