package basic.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import basic.DepartmentVO;

public class Exam02 {
	public static void departmentPrint(int deptNo){
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean flag = false;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
			String sql = "select department_name, manager_id "
							+ "from departments "
							+ "where department_id = ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, deptNo);
			
			ResultSet rs = pstmt.executeQuery();
			flag = rs.next();
				if(flag) {
					DepartmentVO vo = new DepartmentVO();
					vo.setDepartmentName(rs.getString("department_name"));
					vo.setManagerID(rs.getInt("manager_id"));
					System.out.printf("입력하신 부서아이디(%d) 에 해당하는\n부서명 :: %s\n부서장 아이디 :: %d\n",
										deptNo, vo.getDepartmentName(), vo.getManagerID());
					flag = true;
				}
				if(!flag) {
					System.out.println("입력하신 부서아이디" + deptNo + "에 해당하는 부서명은 없습니다.");
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
			
			if(con != null) {
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
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.print("부서번호 :");
		int deptNo = Integer.parseInt(sc.nextLine());
		departmentPrint(deptNo);
		}
	}
}
