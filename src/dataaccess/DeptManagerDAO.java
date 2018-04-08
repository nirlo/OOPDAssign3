package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import builder.Builder;
import factory.DeptManagerFactory;
import factory.Factory;
import transfer.DeptManager;
import transfer.Employee;
import transfer.Salary;

public class DeptManagerDAO implements DAO<DeptManager> {
	
	private static final String GET_ALL_DEPT_MANAGER = "SELECT * FROM dept_manager ORDER BY emp_no";
	
	private static final String GET_BY_CODE_DEPT_MANAGER = "SELECT * FROM dept_manager WHERE emp_no = ?";
	
	private static final String INSERT_DEPT_MANAGER = "INSERT INTO dept_manager (emp_no, dept_no, from_date, to_date) VALUES (?, ?, ?, ?)";
	
	private static final String UPDATE_DEPT_MANAGER = "UPDATE dept_manager SET to_date = ? where emp_no = ? AND dept_no = ?";
	
	private static final String DELETE_DEPT_MANAGER = "DELETE FROM dept_manager WHERE emp_no = ? AND dept_no = ?";
	
	private Factory<DeptManager> factory;
	
	
	
	public DeptManagerDAO() {
		factory = new DeptManagerFactory();
	}

	@Override
	public List<DeptManager> getAll() {
		List<DeptManager> list = Collections.emptyList();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			DataSource ds = new DataSource();
			con = ds.createConnection();
			pstmt = con.prepareStatement(GET_ALL_DEPT_MANAGER);
			rs = pstmt.executeQuery();
			list = factory.createListFromResultSet(rs);
			
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
	public DeptManager getByID(String id) {
		DeptManager deptMan = new DeptManager();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			DataSource ds = new DataSource();
			con = ds.createConnection();
			pstmt = con.prepareStatement(GET_BY_CODE_DEPT_MANAGER);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			deptMan = factory.createFromResultSet(rs);
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
		return deptMan;
	}

	@Override
	public void add(DeptManager t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( INSERT_DEPT_MANAGER);){
            pstmt.setLong(1, t.getEmpNo());
            pstmt.setLong(2, t.getDeptNo());
            pstmt.setDate(3, t.getFromDate());
            pstmt.setDate(4, t.getToDate());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public void update(DeptManager t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( UPDATE_DEPT_MANAGER);){
            pstmt.setDate(1, t.getToDate());
            pstmt.setLong(2, t.getEmpNo());
            pstmt.setLong(3,  t.getDeptNo());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public void delete(DeptManager t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( DELETE_DEPT_MANAGER);){
            pstmt.setLong(1, t.getEmpNo());
            pstmt.setLong(2,  t.getDeptNo());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

}
