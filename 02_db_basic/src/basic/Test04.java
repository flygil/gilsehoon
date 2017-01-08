package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import basic.EmployeesVO;

public class Test04 {
	public static void main(String[] args) {
	List<EmployeesVO> list = new ArrayList<>();
	Connection con = null;
	PreparedStatement pstmt = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
			String sql = "select employee_id, last_name, salary from employees order by last_name";
			
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				EmployeesVO vo = new EmployeesVO();
				vo.setEmployeeID(rs.getInt("employee_id"));
				vo.setLastName(rs.getString("last_name"));
				vo.setSalary(rs.getInt("salary"));
				
				list.add(vo);
			}
			for(EmployeesVO vo : list) {
				System.out.printf("%4d%12s%6d\n", vo.getEmployeeID(),vo.getLastName(), vo.getSalary());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
}
