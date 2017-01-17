package network.server;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class AppServerTest03 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			String[] msgs = {"양원주아픔", "배근영바보", "길세훈짱조아"};
			Random r = new Random();
 			while(true) {
				System.out.println("클라이언트 요청대기");
				Socket client = server.accept();
				//접속한 클라이언트에게 메세지 전송하기
				OutputStream out = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				String sendMsg =  msgs[r.nextInt(3)];
				dos.writeUTF(sendMsg);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
