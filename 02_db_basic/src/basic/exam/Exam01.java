package basic.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import basic.EmployeesVO;



public class Exam01 {
	public static void printEmployee(String cityName, int salary) {
		List<EmployeesVO> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
			String sql = "select l.city, e.first_name, e.salary "
							+ "from locations l "
							+ "inner join departments d "
							+ "on l.location_id = d.location_id "
							+ "inner join employees e "
							+ "on d.department_id = e.department_id "
							+ "where l.city like ? and e.salary >= ? ";	
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, "%" + cityName + "%");
			pstmt.setInt(2, salary);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				EmployeesVO vo = new EmployeesVO();
				vo.setCityName(rs.getString("city"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setSalary(rs.getInt("salary"));
				
				list.add(vo);
			}
			for (EmployeesVO vo : list) {
				System.out.printf("%s\t%s\t%d\n", 
									vo.getCityName(), vo.getFirstName(), vo.getSalary());
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			
			if (con != null) {
				try {
					con.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("================================================");
		printEmployee("cisco", 6000);
		System.out.println("================================================");
		printEmployee("attle", 15000);
		System.out.println("================================================");
		
	}
}
