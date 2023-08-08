package study;

public class study1 {
	public static class StaticTest {
		public void SystemStudy(boolean isErr) {
			if(isErr == true) {
				System.err.println("err입니다!!!!");	
			} else {
				System.out.println("err가 아닙니다!!!!");	
			}
		}
		
		// 부동 소수점 오차 확인
		public double doubleCalc() {
			double num = 0.1;
			for(int i = 0; i < 1000; i++) {
				num += 0.1;
			}
			return num;
		}
		
		// 묵시적 type 변환 예제
		// 작은 타입을 큰 타입으로 대입할 때 자동 변환된다.
		// 큰 타입을 작은 타입으로 대입할 때는 오류를 발생시킨다.
		public void typeTest(byte tempData) {
			try {
				byte byteTemp = 0;
				short shortTemp = 0;
				int intTemp = 0;
				long longTemp = 0;
				
				float floatTemp = 0;
				double doubleTemp = 0;
				
				char charTemp = 'a';
				String stringTemp = "abc";
				
				System.out.println("byteTemp : " + TypeCheck.typeof(byteTemp));
				System.out.println("shortTemp : " + TypeCheck.typeof(shortTemp));
				System.out.println("intTemp : " + TypeCheck.typeof(intTemp));
				System.out.println("longTemp : " + TypeCheck.typeof(longTemp));
				System.out.println("floatTemp : " + TypeCheck.typeof(floatTemp));
				System.out.println("doubleTemp : " + TypeCheck.typeof(doubleTemp));
				System.out.println("charTemp : " + TypeCheck.typeof(charTemp));
				System.out.println("stringTemp : " + TypeCheck.typeof(stringTemp));
			} catch(Exception ex) {
				System.out.println(ex);
			}
		}
	}
	
	public static void main(String[] args) {
		StaticTest static1 = new StaticTest();
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
		
		// double num1 = static1.doubleCalc();
		// static1.SystemStudy(true);
		// System.out.println(num1);
		
		static1.typeTest();
	}
}

