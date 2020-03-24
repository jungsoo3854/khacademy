package member.model.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	
	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}
	
	public void insertMember() {
		
		for(int i = 0; i<m.length; i++) {
			
			System.out.println("아이디 : ");
			String userId = sc.next();
			System.out.println("패스워드 : ");
			String userPwd = sc.next();
			System.out.println("이름 : ");
			String userName = sc.next();
			System.out.println("나이 : ");
			int age = sc.nextInt();
			System.out.println("성별 : ");
			char gender = sc.next().charAt(0);
			System.out.println("이메일 : ");
			String email = sc.next();
			
			m[i] = new Member(userId, userPwd, userName, age, gender, email);
				++ctn;
			}System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다.");
		}
		
	public void searchId() {
		
			System.out.println("검색할 아이디를 입력하세요 : ");
			String userId = sc.next();
			int count = 0;
			
			for(int i = 0; i<m.length; i++) {
				if(m[i].equals(userId)) {
					printOne(m[i]); break;
				}
			}
			
			if(count == 0) {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			}
	}
	
	public void searchName() {
		
		System.out.println("검색할 이름을 입력하세요 : ");
		String userName = sc.next();
		int count = 0;
			
		for(int i = 0; i<m.length; i++) {
				if(m[i].equals(userName)) {
					printOne(m[i]); break;
			}
		}
			if(count == 0) {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
		}
	}
	
	public void searchEmail() {
		
			System.out.println("검색할 이메일을 입력하세요 : ");
			String email = sc.next();
			int count = 0;
			
			for(int i = 0; i<m.length; i++) {
					if(m[i].equals(email)) {
						printOne(m[i]); break;
				}
			}
				if(count == 0) {
					System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			}
	}
	
	public void updatePwd() {
		do {
			
			System.out.println("수정할 회원의 아이디를 입력하세요 : ");
			String userId = sc.next();
			
			for(int i = 0; i<m.length; i++) {
				if(m[i].equals(userId)) {
					System.out.println("바꿀 비밀번호를 입력하세요 : ");
					int rePwd = sc.nextInt();
					userPwd.setUserPwd(rePwd);
					System.out.println("패스워드 수정이 완료되었습니다."); return;
				} else {
					System.out.println("수정할 회원이 존재하지 않습니다."); return;
				}
			}
			
		} while(true);
	}
	
	public void updateName()
	
	public void updateEmail()
	
	public void deleteOne() {
		do {
			System.out.println("탈퇴할 회원의 아이디를 입력하세요 : ");
			String userId = sc.next();
			
			for(int i = 0; i<m.length; i++) {
				if(m[i].equals(userId)) {
					m[i] = m[i+1];
					stn--;
				} else {
					System.out.println("삭제할 회원 정보가 존재하지 않습니다." );
				}
			}
		}while(true);
	}
	
	public void deleteAll() {
			for(int i = 0; i<m.length; i++) {
				System.out.println(m[i]);
			}
	}
	
	public void printAllMember() {
		
		do {
			for(int i = 0; i<=stn; i++) {
				System.out.println(m[i].);
			}
		}
	}
	
	public void printOne(Member m) {
		System.out.println("아이디 : " + m.getUserId());
		System.out.println("비밀번호 : " + m.getUserPwd());
		System.out.println("이름 : " + m.getUserName());
		System.out.println("나이 : " + m.getAge());
		System.out.println("성별 : " + m.getGender());
		System.out.println("이메일 : " + m.getEmail());
	}

}
