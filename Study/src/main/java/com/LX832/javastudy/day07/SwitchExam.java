package com.LX832.javastudy.day07;

public class SwitchExam {
	public void switchTest() {
		int num = ((int)Math.random()*6 + 1); //임의의 1~6까지의 숫자를 만들어냄
		
		switch(num) {
		case 1 : //num에 저장된 값이1이라는 케이스에 해당된다면~
			System.out.println("1번이 나왔습니다.");
			break; //가장 가까운 반복문이나, 스위치 케이스문을 빠져나간다.
		case 2 : 
			System.out.println("2번이 나왔습니다.");
			break;
			
		case 3 : 
			System.out.println("3번이 나왔습니다.");
			break;
			
		case 4 : 
			System.out.println("4번이 나왔습니다.");
			break;
			
		case 5 : 
			System.out.println("5번이 나왔습니다.");
			break;
		
		default : //num에 저장된 값이 위의 어떤 케이스에도 해당되지 않는다면
			System.out.println("6번이 나왔습니다~무야호");
			
			
		}
		System.out.println("수고했다.");
		
	}
}
	/*public void switchTest2() {
		 
		scanner scan = new Scanner();
				System.out.println("수공");
	}

}*/
