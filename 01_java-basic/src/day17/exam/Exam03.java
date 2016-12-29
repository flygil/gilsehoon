package day17.exam;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import day17.exam.EmployeeVO;


public class Exam03 {
	public static void main(String[] args) {
		try {
			searchEmployeeInfo("data/employee.txt", "김");
			searchEmployeeInfo("data/employee.txt", "다");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param readFileName
	 *            : 읽을 파일명
	 * @param lastName
	 *            : 찾을 성씨
	 * @throws Exception
	 */
	public static void searchEmployeeInfo(String readFileName, String lastName) throws Exception {

		// 내용 구현
		Scanner sc = null;
		String strF;
		int count = 0;
		ArrayList<EmployeeVO> eList = new ArrayList<>();
		int index = 0;
		
		
		try {
			File f = new File(readFileName);
			sc = new Scanner(f);
			
			while (sc.hasNextLine()) {
				EmployeeVO emp = new EmployeeVO();
				strF = sc.nextLine();
				String[] result = strF.split(":");
					//System.out.println(Arrays.toString(result));
				
				emp.setName(result[0]);
				emp.setAge(Integer.parseInt(result[1]));
				emp.setDepartment(result[2]);
				emp.setFee(Integer.parseInt(result[3]));
				
				eList.add(emp);	
				}
			
			System.out.println("===========================================");
			for (int i = 0; i < eList.size(); i++) {
				EmployeeVO emp = eList.get(i);
				if (emp.getName().charAt(0) == lastName.charAt(0)) {
					System.out.printf("이름 : %s   나이 : %d   부서 : %s   월급 : %d\n", 
							emp.getName(), emp.getAge(), emp.getDepartment(), emp.getFee());
					count++;
				}
			}
			System.out.println("===========================================");
			System.out.printf("%s씨 성을 가진 회원은 총 %d명 입니다.\n", lastName, count);
			System.out.println("===========================================");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
