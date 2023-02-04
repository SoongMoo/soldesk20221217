package database;

import java.util.Scanner;

public class DataBaseEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 등록 | 2. 전체 보기 | 3. 상세보기 | 4. 수정 | 5. 삭제 | 6. 끝");
			System.out.println("원하는 번호를 입력해 주세요.");
			int num = sc.nextInt(); sc.nextLine();
			switch(num) {
			case 1: 
				System.out.println("번호를 입력해 주세요 .");
				String num1 = sc.nextLine();
				System.out.println("제목을 입력해주세요 : ");
				String subject = sc.nextLine();
				System.out.println("내용을 입력해주세요 : ");
				String content = sc.nextLine();
				DAO dao = new DAO();
				dao.boardInsert(num1, subject,content);
				break;
			case 2: 
				dao = new DAO();
				dao.boardSelectAll();
				break;
			case 3: 
				System.out.println("상세 정보를 보고 싶은 번호를 입력하세요.");
				num1 = sc.nextLine();
				dao = new DAO();
				dao.selectNum(num1);
				break;
			case 4: 
				System.out.println("수정하고 싶은 번호를 입력하세요..");
				num1 = sc.nextLine();
				System.out.println("제목을 수정 하려면 1 | 내용을 수정하려면 2 | 모두 수정하려면 3 | 종료 4");
				int i = sc.nextInt();sc.nextLine();
				switch(i) {
				case 1 : 
					dao = new DAO();
					System.out.println("제목을 입력해 주세요. ");
					subject = sc.nextLine();
					dao.subjectUpdate(num1, subject);
					break;
				case 2 : 
					dao = new DAO();
					System.out.println("내용을 입력해 주세요. ");
					content = sc.nextLine();
					dao.contentUpdate(num1, content);
					break;
				case 3 : 
					dao = new DAO();
					System.out.println("제목을 입력해 주세요. ");
					subject = sc.nextLine();
					System.out.println("내용을 입력해 주세요. ");
					content = sc.nextLine();
					dao.boardUpdate(num1,subject, content);
					break;
				default : break;
				}
				break;
			case 5: 
				System.out.println("삭제할 번호를 입력하세요.");
				num1 = sc.nextLine();
				dao = new DAO();
				dao.deleteNum(num1);
				break;
			case 6: 
				System.out.println("프로그램이 종료됩니다.");
				System.exit(0); break;
			}
		}
	}
}
