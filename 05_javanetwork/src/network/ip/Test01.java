package network.ip;

import java.net.InetAddress;

public class Test01 {
	public static void main(String[] args) {
		try {
			//현재 실행중인 컴퓨터의 주소 정보를 조회
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local.getHostName());
			System.out.println(local.getHostAddress());
			
			//특정 사이트의 아이피 주소 조회
			InetAddress bit = InetAddress.getByName("www.bitjobedu.co.kr");
			System.out.println(bit.getHostName());
			System.out.println(bit.getHostAddress());
			
			//특정사이트의 모든 아이피 주소 조회
			InetAddress[] naverIp = InetAddress.getAllByName("www.naver.com");
			for(InetAddress naver : naverIp) {
				System.out.print(naver.getHostName() + ", ");
				System.out.println(bit.getHostAddress());
			}
		} catch (Exception e) {
			System.out.println("존재하지 않는 도메인 주소가 입력되었습니다.");
			e.printStackTrace();
			
		}
	}
}
