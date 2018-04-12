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
import factory.SalariesFactory;
import transfer.Salary;

public class SalaryDAO implements DAO<Salary> {
	
	private static final String GET_ALL_SALARIES = "SELECT * from Salaries ORDER BY emp_no";
	
	private static final String GET_BY_CODE_SALARY = "SELECT * FROM Salaries WHERE emp_no = ?";
	
	private static final String INSERT_SALARY = "INSERT INTO Salaries (emp_no, salary, from_date, to_date) VALUES (?, ?, ?, ?)";
	
	private static final String UPDATE_SALARY = "UPDATE salaries SET salary = ? WHERE emp_no = ? ";
	
	private static final String DELETE_SALARY = "DELETE FROM Salaries WHERE emp_no = ?";
	
	private Factory<Salary> factory;
	
	
	
	public SalaryDAO() {
		factory = DTOFactoryCreator.getFactory(Salary.class);
	}

	@Override
	public List<Salary> getAll() {
		List<Salary> list = Collections.emptyList();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			DataSource ds = new DataSource();
			con = ds.createConnection();
			pstmt = con.prepareStatement(GET_ALL_SALARIES);
			rs = pstmt.executeQuery();
			list = (List<Salary>)factory.createListFromResultSet(rs);
			
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
	public Salary getByID(String id) {
		Salary salary = new Salary();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			DataSource ds = new DataSource();
			con = ds.createConnection();
			pstmt = con.prepareStatement(GET_BY_CODE_SALARY);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			salary = factory.createFromResultSet(rs);
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
		return salary;
	}

	@Override
	public void add(Salary t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( INSERT_SALARY);){
            pstmt.setLong(1, t.getEmpNo());
            pstmt.setDouble(2, t.getSalary());
            pstmt.setDate(3, t.getFromDate());
            pstmt.setDate(4, t.getToDate());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public void update(Salary t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( UPDATE_SALARY);){
            pstmt.setDouble(1, t.getSalary());
            pstmt.setLong(2, t.getEmpNo());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public void delete(Salary t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( DELETE_SALARY);){
            pstmt.setLong(1, t.getEmpNo());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

}
