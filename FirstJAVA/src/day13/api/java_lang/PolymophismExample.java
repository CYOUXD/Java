package day13.api.java_lang;//6

public class PolymophismExample {

	public static void main(String[] args) {

		Object[] arrObj = new Object[10];
		
		//WrapperClass가 뭔지 아는게 중요! : wrapper 클래스로 다형성을 이용한 이종 배열을 만들 수 있음.
		//Boxing - autoboxing이 생긴 후로 거의 쓸 일이 없음
		arrObj[0] = new Byte((byte)127);
		arrObj[1] = new Short((short)32767);
		arrObj[2] = new Integer(2147483647);
		arrObj[3] = new Long(2147483648L);
//		arrObj[4] = new Float(2.5F);
		arrObj[4] = 3.5F;	//autoboxing - 1.5이후 부터 추가된 기능
		arrObj[5] = new Double(3.7);
		System.out.println(((Double)arrObj[5]).doubleValue());	//unboxing : 박싱된 값을 사용할 때 언박싱
		arrObj[6] = new Boolean(true);
		arrObj[7] = new Character('j');
		arrObj[8] = new String("Hello World");
		arrObj[9] = new java.util.Date();
		
		for(int i=0; i<arrObj.length; i++) {
			System.out.println(arrObj[i]);
		}
		
		int a = Integer.parseInt("100");	//parse + ㅁㅁㅁ : 문자열 값을 기본 데이터 형으로 변경!!!
		//parse + wrapper class 종류 다 있음
		System.out.println(a);
	}

}
