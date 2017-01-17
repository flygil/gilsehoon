package quiz;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import boardVO.BoardVO;
import db.MyAppSqlConfig;

public class Quiz02 {
	public static void main(String[] args) {
		try{
			
			ServerSocket server = new ServerSocket(20000);
			while(true) {
				Socket client = server.accept();
				System.out.println("클라이언트연결됨");
				
				InputStream in = client.getInputStream();
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr);
				String msg = "";
				String startLine = br.readLine();
				
				String[] sArr = startLine.split(" ");
				String[] uriArr = sArr[1].split("\\?"); 
				
				if (uriArr[0].equals("/list")) {
					SqlSession sqlMapper = MyAppSqlConfig.getSqlSessionInstance();
					List<BoardVO> list = sqlMapper.selectList("getBoardInfo1");
					for (int i = 0; i < list.size(); i++) {
						BoardVO vo = list.get(i);
						msg += "<br>" + String.format("%d\t%s\t%s\t%s\n",
											vo.getNo(), vo.getTitle(), vo.getWriter(), new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegDate())) + "</br>";
					
					}
				} else if (uriArr[0].equals("/delete")) {
					
				}
				String resStartLine = "HTTP/1.1 200 OK\r\n";
				String headers = "Cache-Control: no-cache\r\n"
						+ "Content-Type: text/html; charset=UTF-8\r\n"
						+ "Content-Length: " + msg.getBytes().length +"\r\n\r\n";
				
				String body = msg;
				
				String data = resStartLine + headers + body;
				OutputStream out = client.getOutputStream();
				out.write(data.getBytes());
				System.out.println(msg);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
