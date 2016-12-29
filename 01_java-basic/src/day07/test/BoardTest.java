package day07.test;

import java.util.Scanner;

public class BoardTest {
	 public static void main(String[] args) {
		BoardVO[] list = new BoardVO[3];
		Scanner sc = new Scanner(System.in);
		int pos = 0;
		int no = 0;
		
			outer:
			while(true) {
				
				System.out.println("------------------------");
				System.out.println("1.전체게시물조회");
				System.out.println("2.글번호 조회");
				System.out.println("3.글등록");
				System.out.println("4.글수정");
				System.out.println("5.글삭제");
				System.out.println("0.종료");
				System.out.println("------------------------");
				System.out.print("메뉴 중 처리할 항목을 선택하세요 :");
				
				int menu = Integer.parseInt(sc.nextLine());
				switch (menu) {
				case  1 : 
					System.out.println("전체 " + pos + "개");
					if (pos == 0) {
						System.out.println("게시물이 존재하지 않습니다.");
						break;
					}
					
					System.out.println("------------------------");
					System.out.println("번호\t글쓴이\t제목");
					System.out.println("------------------------");
					
					for(int i = pos -1; i >= 0; i--) {
						System.out.printf("%d\t%s\t%s\n", list[i].no, list[i].writer,list[i].title);
					}
					break;
				case 2 :
					System.out.print("조회할 글번호를 입력하세요 :");
					int findNo = Integer.parseInt(sc.nextLine());
					boolean search = false;
					for (int i = 0; i < pos; i++) {
						if (findNo != list[i].no) continue;
						
						search = true;
						System.out.println("------------------------");
						System.out.printf("번호 : %d\n", list[i].no);
						System.out.printf("글쓴이 : %s\n", list[i].writer);
						System.out.printf("제목 : %s\n", list[i].title);
						System.out.println("------------------------");
						break;
					}
					if (search == false)
					System.out.println("게시물이 존재하지 않습니다.");
					
					break;
				case 3 :
					if (pos == list.length) {
						BoardVO[] temp = new BoardVO[pos * 2];
						System.arraycopy(list, 0, temp, 0, pos);
						list = temp;
					}
					list[pos] = new BoardVO();
					list[pos].no = ++no;
					System.out.print("제목을 입력하세요 :");
					list[pos].title = sc.nextLine();
					System.out.print("글쓴이를 입력하세요 :");
					list[pos].writer = sc.nextLine();
					System.out.print("내용을 입력하세요 :");
					list[pos].content = sc.nextLine();
					System.out.println("게시물 등록이 완료되었습니다.");
					pos++;
					break;
				case 4 :
					boolean modC = false;
					System.out.print("수정할 글번호를 입력하세요 :");
					int modNo = Integer.parseInt(sc.nextLine());
					System.out.print("변경할 제목을 입력하세요 :");
					String title = sc.nextLine();
					for (int i = 0; i < pos; i++) {
						if (modNo != list[i].no) continue;
						
						modC = true;
						list[i].title = title;
						System.out.println("게시글이 수정되었습니다.");
					}
					if (modC == false) 
						System.out.println("입력된 번호는 존재하지 않습니다.");
					break;
				case 5 :
					int delIndex = -1;
					System.out.print("삭제할 글번호를 입력하세요 :");
					int delNo = Integer.parseInt(sc.nextLine());
					for (int i = 0; i < pos; i++) {
						if (delNo != list[i].no) continue;
						
						delIndex = i;
					}
					if (delIndex == -1) 
						System.out.println("입력하신 번호에 해당하는 게시글이 없습니다.");
					int length = pos - (delIndex + 1);
					if (length > 0)
					System.arraycopy(list, delIndex + 1, list, delIndex, length);
					System.out.println("게시글이 삭제되었습니다.");
					list[--pos] = null;
					break;
				case 0 :
					System.out.println("게시판을 종료합니다.");
					break outer;
				}
			}
	 }	
}
