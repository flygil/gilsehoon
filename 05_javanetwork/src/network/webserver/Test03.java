package network.webserver;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class Test03 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			while(true) {
				Socket client = server.accept();
				System.out.println("클라이언트 접속됨");
				
				//요청포맷형식 출력하기(REQUEST)
				//클라이언트 -> 서버
				/*	
				  	시작라인
					헤더
					
					바디
				*/
				InputStream in = client.getInputStream();
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr);
				String reqStartLine = br.readLine();
				
				String[] reqArr = reqStartLine.split(" ");
				String [] uriArr = reqArr[1].split("\\?");
				System.out.println("방식 : " + reqArr[0]);
				System.out.println("URI : " + uriArr[0]);
				if(uriArr.length == 2) {
					String queryString = uriArr[1];
					System.out.println("QueryString : " + queryString);
					
					String[] params = queryString.split("&");
					for (String param : params) {
						String[] pArr = param.split("=");
						System.out.println(pArr[0] + " : " + pArr[1]);
					}
				}
				System.out.println("요청시작라인 : " + reqStartLine);
				// 	요청시작라인 : GET /test?id=hoit&pass=aaa HTTP/1.1
				// 	방식 : GET
				// 	URI : /test
				//	QueryString : id=hoit
				// 	id : hoit
			
				String msg = "성공";
				
				// 서버 -> 클라이언트(RESPONSE)
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String startLine = "HTTP/1.1 200 OK\r\n";
				String headers = "Cache-Control: no-cache\r\n"
									+ "Content-Type: text/html; charset=UTF-8\r\n"
									+ "Content-Length: " + msg.getBytes().length +"\r\n\r\n";
				
				String body = msg;
				
				String data = startLine + headers + body;
				OutputStream out = client.getOutputStream();
				out.write(data.getBytes());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
