package network.server;

import java.net.Socket;

public class AppClientTest01 {
	public static void main(String[] args) {
		try{
		Socket s = new Socket("192.168.0.3", 10001);
		System.out.println("접속성공");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
