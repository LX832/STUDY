package com.LX832.javastudy.day30;



import java.util.Scanner;

/* Exception(예외처리)
 *  -개념: 프로그램이 실행되면서 돌발상황이 발생하는데, 이것을 개발자가 대비하여 미리 준비해 놓는 것.  
 *        1)API 통하여 제공(미리 만들어진것): br.readLine(); throws 
 *          try {
 *          
 *          }catch(     ){
 *          
 *          }          
 *          
 *        2)개발자가 코딩중에 미리(예측하여) 만들어서 제공하는 형태 :  가장 어려운 형태 => 시스템 안정화에 기여
 *        try {
 *          
 *          }catch(     ){
 *          
 *          } 
 *          
 *          이 코드를 사용하지 않습니다. 필요 없습니다.
 *        
 *        3)프로그램 실행중에 오류가 발생하는 경우에 대처하여 제공하는 형태
 *        
 *  - 사용자의 잘못된 조작       
 *  - 개발자의 잘못된 코딩(개발) : 개발자의 사고(생각)
 *  
 *  - 컴파일 바인딩 타임(컴파일러 오류: 번역(소스 => 컴퓨터가 알 수 있는 코드로 변화: 바이트 코드(기계어)))
 *  - 실행 타임 : 정상적으로 출력되면 착오가 발생하여 그냥 놔두면 나중에 문제가 커집니다.
 *    실행시 결과에 대하여 한번더 합리적 의심(?)을 해봐야 됩니다.
 *    수작업 체크가 필요합니다.
 *  
 *  <종류>
 *  - 논리적인 오류 : 개발자의 사고(생각)가 잘못된 경우, 가장 치명적 
 *  - 문법적인 오류 : 자바 문법이 잘못된 경우(오타 발생) : 웹 분야에서 .... 종종 발생....onlcick() 
 *  - 기계적인 오류: 이클립스 오류(버그)존재, 하드웨어 오류(오동작)
 *  - 예외적인 오류: 개발자가 코딩중에 미리(예측하여) 만들어서 제공하는 형태 :  가장 어려운 형태 => 시스템 안정화에 기여
 *  - 환경적인 오류: 레지스트리 오류(포맷, 복구)
 *   
 *   try {
 *   
 *      // 프로그램이 실행되면서 문제가 발생할 여지가 있는 부분을 코딩.
 *   
 *   }catch(Exception e) {
 *   
 *     // 발생한 문제 예외처리 부분.
 *   
 *   }finally{
 *      
 *      // 파일, 데이터 베이스 연동을 할때 사용한 자원을 반납 : 객체명.close().
 *      // 일반적으로 생략 가능합니다.
 *   
 *   }
 *   
 *   B a = new A();
 *   a.print();
 *   
 *   
 */

// NullPointerException Example

public class trySample1 {

	public static void main(String[] args) {		
		String data = null;
		
		try {		
			
			Scanner sc = new Scanner(System.in);
			System.out.println("문자열 데이터 입력");
			 data = sc.next();
			
			 //       ........
			 
			// data = null;
			
			System.out.println(data.toString());//			
			
			//    .......
			
			
			
		}catch(NullPointerException e) {
			String msg = "데이터가 존재하지 않습니다. 데이터를 입력해 주세요.";
			System.out.println(msg); 
		}
		
	}

}
