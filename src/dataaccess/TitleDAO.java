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
import factory.DTOFactoryCreator;
import factory.Factory;
import factory.TitlesFactory;
import transfer.Employee;
import transfer.Salary;
import transfer.Title;

public class TitleDAO implements DAO<Title> {
	
	private static final String GET_ALL_TITLES = "SELECT * FROM titles ORDER BY emp_no";
	
	private static final String GET_BY_CODE_TITLE = "SELECT * FROM titles WHERE emp_no = ?";
	
	private static final String INSERT_TITLE = "INSERT INTO titles (emp_no, title, from_date, to_date) VALUES (?, ?, ?, ?)";
	
	private static final String UPDATE_TITLE = "UPDATE titles SET title = ? WHERE emp_no = ?";
	
	private static final String DELETE_TITLE = "DELETE FROM titles WHERE emp_no = ? AND title = ?";
	
	private Factory<Title> factory;
	
	
	
	public TitleDAO() {
		factory = DTOFactoryCreator.getFactory(Title.class);
	}

	@Override
	public List<Title> getAll() {
		List<Title> list = Collections.emptyList();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			DataSource ds = new DataSource();
			con = ds.createConnection();
			pstmt = con.prepareStatement(GET_ALL_TITLES);
			rs = pstmt.executeQuery();
			list = (List<Title>)factory.createListFromResultSet(rs);
			
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
	public Title getByID(String id) {
		Title title = new Title();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			DataSource ds = new DataSource();
			con = ds.createConnection();
			pstmt = con.prepareStatement(GET_BY_CODE_TITLE);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			title = factory.createFromResultSet(rs);
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
		return title;
	}

	@Override
	public void add(Title t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( INSERT_TITLE);){
            pstmt.setLong(1, t.getEmpNo());
            pstmt.setString(2, t.getTitle());
            pstmt.setDate(3, t.getFromDate());
            pstmt.setDate(4, t.getToDate());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public void update(Title t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( UPDATE_TITLE);){
            pstmt.setString(1, t.getTitle());
            pstmt.setLong(2, t.getEmpNo());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public void delete(Title t) {
		try( Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement( DELETE_TITLE);){
            pstmt.setLong(1, t.getEmpNo());
            pstmt.setString(2,  t.getTitle());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

}
