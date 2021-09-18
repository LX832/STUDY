package com.LX832.javastudy.day06;

public class OperationCodeExam01 {
	public void relation01(int data1, int data2 ) {
		//관계 연산자는 이항연산자이다.
		// > >= < <= ==같다 !=같지않다 결과는 논리값이다
		// > <=의 부정 : 효과적인 방법을 찾는다.(비교 판단문 즉 if~else)
		System.out.println(data1>data2);
		System.out.println(!(data1<=data2));
		
		if(data1 > data2) {
			System.out.println(data1 +"이"+ data2 + "보다 큰 수 입니다.");
		}else if(data1<data2){
			System.out.println(data2 +"이"+ data1 + "보다 큰 수 입니다.");
		}else {
			System.out.println(data1 +"과"+ data2 + "은 같습니다.");

		}
		
	}
	
	public void logical01(boolean data1, boolean data2) {
		//기본적인 논리연산자 and( && ),or(||),not(!)
		//이항의 첫번째 항목에 따라서 이후의 연산은 생략될 수 있다.
		//data1이 false이면 &&연산은 이후의 연산을 하지 않는다.
		// => 어떤 항목을 먼저 기술하는가에 따라서 속도에 영향을 미칠 수 있다.
		System.out.println(data1 && data2 && data2);
		System.out.println(data1 || data2 || data1);
		boolean x = data1 || data2;
		System.out.println("연산 결과 : " + x);
		//not(논리 부정) 연산자는 논리 연산자 중에서 유일한 단황연산자이다.
		System.out.println(!data1);
		
		
		//비트 and, 비트 or연산자도 데이터의 타입에 따라서 논리적인 연산을 수행한다.
		//비트 not( ~) 연산자의 경우는 논리적인 연산을 수행하지 않는다.
		//비트 not
		System.out.println(" 3 & 7 =" + ( 3 & 7 ));
		System.out.println(" true & false =" + (true&false));
		System.out.println("3의 비트 not결과 :" + ~3);
		
		
	}
	
	public void bitOpcode() {
		//비트연산은 가장 속도가 빠르다 컴퓨터는 내부적으로 모든 자료를 binary로 저장된다.
		//비트연산은 바이너리로 저장된 자료를 해석하거나 변환작업 없이 곧바로 연산이 진행되기 때문이다.
		//비트 논리 연산(&,| , ~, ^(x-or)과 쉬프트 연산으로 크게 구분할 수 있다.
		System.out.println(3 << 2); // left shift연산자 ( << )
		//숫자 3을 왼쪽으로 2칸 이동시키세요
		System.out.println( (65 <<2)   ); 
		System.out.println( (65 >>1)   );
		System.out.println( (-64 >>1)  );
		System.out.println( (-64 >>>1) );
		//부호비트 => 0= 양수 1= 음수
		System.out.println("=============");
		System.out.println(100* 16);
		System.out.println(100<<4);
		System.out.println(120*-1);
		System.out.println(~120+1);
		
		System.out.println(7 & 4);
		System.out.println(8 & 4);
		
		
	}
	public void multiAssign() {
//		int k = 20; // = 대입연산자 우측의 연산 결과를 좌측에 대입한다.
	//	k += 15; //== k = k + 15동일한 구문 , 복합대입연산자가 속도가 빠른 것으로 알려져 있다.
//		/k += 15+36+24;
//		System.out.println(k);
//		System.out.println(2+3*24/12);
		int i = 100;
		i++; //단독으로 사용 다른 연산문과 함꼐 사용하지 말 것
		int k = ++i; // k = ++i;
		
		System.out.println("k = " + k ); //100
		System.out.println("i = " + i ); //101
		//조건식 ? 참일 때 수행하 문장 : 조건식이 거짓일 때 수행할 문장;
		int data1 = 300;
		int data2 = 500;
		String result = data1 > data2 ? "data1에 들어가있는 자료가 더 큰 수입니다.":"data2에 들어가있는 자료가 더 큰 수입니다.";
		System.out.println(result);
		//result = data1 > data2? aaa():bbb();
		System.out.println(data1 > data2? data1 - data2 : data2 -data1);
		int resultNum;
		if (data1 > data2) {
			resultNum = data1 - data2;
		}else {
			resultNum = data2 - data1;
		}
		System.out.println(resultNum);
	}

}