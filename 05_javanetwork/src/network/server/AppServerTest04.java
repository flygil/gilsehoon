package network.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServerTest04 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
		
			System.out.println("클라이언트 요청대기");
			Socket client = server.accept();
			InputStream in = client.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			//접속한 클라이언트에게 메세지 전송하기
			OutputStream out = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
				while(true) {
					
					String msg = dis.readUTF();
					if (msg.equals("quit")) break;
					
					dos.writeUTF(msg);
				}
			System.out.println("클라이언트종료");	
		} catch (Exception e) {
			// TODO: handle exception
		} 
	}
}
