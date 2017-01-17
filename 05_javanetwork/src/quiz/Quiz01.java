package quiz;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) throws UnknownHostException {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("도메인주소를 입력하세요 :");
			String addr = sc.nextLine();
			if(addr.equals("quit")){System.out.println("종료합니다."); break;}
			if(addr.startsWith("www")) {
				try {
					System.out.println("--------------------------------");
					InetAddress[] searchDomain = InetAddress.getAllByName(addr);
					for(InetAddress search : searchDomain) {
						System.out.println(search.getHostAddress());
					}
					System.out.println("--------------------------------");
				} catch (Exception e) {
					System.out.println("존재하지 않는 도메인 주소가 입력되었습니다.");
					System.out.println("--------------------------------");
					//e.printStackTrace();
				}
			} else {
				System.out.println("도메인 주소는 www로 시작해야 합니다.");
			}
		}
	}
}
