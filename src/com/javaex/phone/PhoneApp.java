package com.javaex.phone;

import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);

		//메뉴번호
		
		
		//반복문 컨트롤 boolean
		boolean run = true;
		
		
		//Dao 인스턴스 생성
		PhoneDao pd = new PhoneDao();
		
		List<PhoneVo>  pList;
		
		while(run) {
			//시작화면 디스플레이
			
			System.out.println("**************************************");
			System.out.println("*                   전화번호 관리 프로그램              *");
			System.out.println("**************************************");
			System.out.println();
			System.out.println("1.리스트    2.등록    3.수정    4.삭제    5.검색    6.종료");
			System.out.println("--------------------------------------------------------------------");
			System.out.print(">메뉴번호:");
			
			int selection = sc.nextInt();
			sc.nextLine();
			///////////////////////////////////////////////////////////
			
			//구동부
			
			switch(selection) {
			
			case 1 : 	   pList = pd.getPhList();
								
								for(PhoneVo pv : pList) {
								System.out.println(pv.personId + ".    "+ pv.name  + "    " + pv.hp  + "    " + 
																pv.company);
								}
								break;
			
			case 2:			System.out.println("<2. 등록>");
								System.out.print("이름 > ");
								String name = sc.nextLine();
								System.out.print("휴대전화 >");
								String hp = sc.nextLine();
								System.out.print("회사번호 >");
								String company = sc.nextLine();
								
								PhoneVo pv = new PhoneVo(name, hp, company);
								pd.insert(pv);
								
								break;
				
			case 3:			System.out.println("<3.수정>");
								System.out.print("번호 > ");
								int targetId = sc.nextInt();
								sc.nextLine();
								System.out.print("이름 >");
								String updateName = sc.nextLine();
								System.out.print("휴대전화 >");
								String updateHp = sc.nextLine();
								System.out.print("회사번호 >");
								String updateCompany = sc.nextLine();
								
								PhoneVo upPv = new PhoneVo(targetId,updateName, updateHp, updateCompany);
								pd.update(upPv);
								break;
								
			case 4:			System.out.println("<4. 삭제>");
								System.out.print(">번호: ");
								int targetIdDele = sc.nextInt();
								sc.nextLine();
								pd.delete(targetIdDele);
								break;
			
			case 5: 		System.out.println("<5. 검색>");
								System.out.print("검색어 : ");
								String keyword = sc.nextLine();
								
								pList = pd.search(keyword);
								
								for(PhoneVo pvS : pList) {
									System.out.println(pvS.personId + ".    "+ pvS.name  + "    " + pvS.hp  + "    " + 
																	pvS.company);
									}
								break;
								
								
			case 6: 		System.out.println("*********************************************");
								System.out.println("*                                감사합니다                               *");
								System.out.println("*********************************************");
								
								run = false;
								break;
			default: 		System.out.println("[다시 입력해주세요]");				
			
			
			}
			
		}
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
