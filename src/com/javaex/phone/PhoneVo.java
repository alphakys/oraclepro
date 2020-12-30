package com.javaex.phone;

public class PhoneVo {
		
		//필드
		public String name, hp, company; 
		public int personId ;
		
		//생성자
		PhoneVo (){}
		
		PhoneVo(int personId, String name, String hp, String company){
			this.name = name;
			this.hp = hp;
			this.company = company;
			this.personId = personId;
		}

		public PhoneVo(String name, String hp, String company) {
			
			this.name = name;
			this.hp = hp;
			this.company = company;
		}
		
		
		
}
