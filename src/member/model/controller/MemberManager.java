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
			
			System.out.println("���̵� : ");
			String userId = sc.next();
			System.out.println("�н����� : ");
			String userPwd = sc.next();
			System.out.println("�̸� : ");
			String userName = sc.next();
			System.out.println("���� : ");
			int age = sc.nextInt();
			System.out.println("���� : ");
			char gender = sc.next().charAt(0);
			System.out.println("�̸��� : ");
			String email = sc.next();
			
			m[i] = new Member(userId, userPwd, userName, age, gender, email);
				++ctn;
			}System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�.");
		}
		
	public void searchId() {
		
			System.out.println("�˻��� ���̵� �Է��ϼ��� : ");
			String userId = sc.next();
			
			for(int i = 0; i<m.length; i++) {
				if(m[i].equals(userId)) {
					printone(m[i]);
				} else {
					System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�."); return;
				}
			} 
		
	}
	
	public void searchName() {
		
		do {
			System.out.println("�˻��� �̸��� �Է��ϼ��� : ");
			String userName = sc.next();
			
			for(int i = 0; i<m.length; i++) {
				if(m[i].equals(userName)) {
					printone(m[i]);
				} else {
					System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
				} return;
			} 
			
		} while(true);
	}
	
	public void searchEmail() {
		do {
			System.out.println("�˻��� �̸����� �Է��ϼ��� : ");
			String email = sc.next();
			
			for(int i = 0; i<m.length; i++) {
				if(m[i].equals(email)) {
					printone(m[i]);
				} else {
					System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
				} return;
			} 
			
		} while(true);
	}
	
	public void updatePwd() {
		do {
			System.out.println("������ ȸ���� ���̵� �Է��ϼ��� : ");
			String userId = sc.next();
			
			for(int i = 0; i<m.length; i++) {
				if(m[i].equals(userId)) {
					System.out.println("�ٲ� ��й�ȣ�� �Է��ϼ��� : ");
					int rePwd = sc.nextInt();
					userPwd.setUserPwd(rePwd);
					System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�."); return;
				} else {
					System.out.println("������ ȸ���� �������� �ʽ��ϴ�."); return;
				}
			}
			
		} while(true);
	}
	
	public void updateName()
	
	public void updateEmail()
	
	public void deleteOne() {
		do {
			System.out.println("Ż���� ȸ���� ���̵� �Է��ϼ��� : ");
			String userId = sc.next();
			
			for(int i = 0; i<m.length; i++) {
				if(m[i].equals(userId)) {
					m[i] = m[i+1];
					stn--;
				} else {
					System.out.println("������ ȸ�� ������ �������� �ʽ��ϴ�." );
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
		System.out.println("���̵� : " + m.getUserId());
		System.out.println("��й�ȣ : " + m.getUserPwd());
		System.out.println("�̸� : " + m.getUserName());
		System.out.println("���� : " + m.getAge());
		System.out.println("���� : " + m.getGender());
		System.out.println("�̸��� : " + m.getEmail());
	}

}
