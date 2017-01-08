package advancd.quiz;

import java.io.BufferedOutputStream;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

import util.ConnectionFactory;
import util.ConnectionPool;

public class CreateVOFile {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;
		FileWriter fw = null;
		String typeName;
		String cName;
		String modTName;
		try {
			System.out.print("VO를 생성할 테이블명 (종료 : exit) :");
			String tName = sc.nextLine();
			
			fw = new FileWriter("result/" + tName +".txt", true);
			
			if (tName.contains("tb_") ){
				modTName = tName.replace("tb_", "");
			} else {
				modTName = tName;
			}
			
			con = ConnectionPool.getConnection();
			String sql = "select * from " + tName ;
			
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int colCnt = rsmd.getColumnCount();
			fw.write("public class " + modTName + "VO {\n" );
			if(rs.next()) {
				for(int i = 1; i <= colCnt; i++) {
					typeName = rsmd.getColumnTypeName(i);
						switch(typeName.toLowerCase()){
						case "char" : typeName = "String"; break;
						case "varchar2" : typeName = "String"; break;
						case "number" :	typeName = "int"; break;
						case "date" :	typeName = "Date"; break;
						}
					cName = rsmd.getColumnName(i);
					cName = cName.toLowerCase();
					int index = cName.indexOf("_");
					if (index >= 0) {
					System.out.println(index);
					cName = (cName.replace("_", ""));
					char upp = cName.charAt(index);
					upp = (char)(upp -32);
					System.out.println(upp);
					String c1 =cName.substring(0, index);
					String c2 =cName.substring(index +1);
					cName = c1+upp+c2;
					System.out.println(cName);
					} 
				fw.write("\tprivate " + typeName + " " + cName + ";\n" );
				}
				fw.write("\n");
				for(int i = 1; i <= colCnt; i++) {
					typeName = rsmd.getColumnTypeName(i);
					switch(typeName.toLowerCase()){
					case "char" : typeName = "String"; break;
					case "varchar2" : typeName = "String"; break;
					case "number" :	typeName = "int"; break;
					case "date" :	typeName = "Date"; break;
					}
				cName = rsmd.getColumnName(i);
				cName = cName.toLowerCase();
				int index = cName.indexOf("_");
				if (index >= 0) {
				System.out.println(index);
				cName = (cName.replace("_", ""));
				char upp = cName.charAt(index);
				upp = (char)(upp -32);
				System.out.println(upp);
				String c1 =cName.substring(0, index);
				String c2 =cName.substring(index +1);
				cName = c1+upp+c2;
				System.out.println(cName);
				} 
			
				char fir = cName.charAt(0);	
				fir = (char)(fir - 32);
				fw.write("\tpublic void get" + fir + cName.substring(1) + "() {\n\t\treturn " + cName +";\n\t}\n" );
				fw.write("\tpublic void set" + fir + cName.substring(1) + " " + "(" + typeName + " " + cName + ") {\n\t\tthis." 
							+ cName + " = " + cName + ";\n\t}\n" );
				}
				fw.write("}");
			}
			System.out.println("VO파일 생성완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(pstmt);
			ConnectionPool.releaseConnection(con);
			try {
				if (fw != null) {
					fw.close();
				}
			}catch (Exception e2){
				
			}
		}
		
	}
}
