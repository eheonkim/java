
public class Ex02_Assignment
{
	public static void main(String[] args)
	{
		
		// 10은 4바이트이지만 shot으로 선언되었으므로 2바이트로 자동 
		// 형변환 됨.
		short num = 10;
		
		/*
		복합대입연산자
			: 산술연산자와 대입연산자를 연결해놓은 형태로
			좌우측의 값을 연산하여 좌측의 변수에 대입하는 
			구조를 가진다. 
			문법의 구조상 항상 현재의 타입을 유지하는 특성을
			가지고있다. 
			강제형 변환하지 않아도 처리해줌. 이렇게 사용함.
			빠른 속도를 필요할 때 사용함. 하지만 우리는 쓸일이 없음.
		 */
		num += 77L;    // 형변환 없이 연산이 수행된다.
		System.out.println(num);
		/*
		num값을 long형으로 자동 형변환 후에 num과 77L을 더하게 된다. 
		그리고 계산 결과를 short 타입으로 형변환해야 대입할 수 있다.
		 */
		num = (short)(num + 77L);  // 3번의 형 변환 필요
		System.out.println(num);
		
		int n = 5;
		/*
		정수와 실수를 연산하면 실수의 결과가 나오므로 n에 
		대입할 수 없어 에러가 발생한다. 
		 */
//		n = n * 2.7;
		/*
		위 구문을 정상적으로 처리하기 위해서는 아래와 같이
		강제형변환 해야 한다. 
		 */
		n = (int)(n * 2.7); 
		/*
		복합대입연산자를 사용하면 문법의 구조상 변수의 기존
		자료형을 그대로 유지하는 특성이 있다. 
		따라서 연산의 결과는 정수가 된다. 
		만약 (int)2.7 이후에 계산한다면 2를 곱하게 되므로 2.7을
		곱했을때와 다른 결과가 나올 수 있다. 그래서 생각 해야함.
		 */
		n *= 2.7;
		System.out.println("n의 결과값:"+ n);
	}
}
