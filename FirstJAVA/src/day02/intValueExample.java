package day02;

public class intValueExample {

	public static void main(String[] args) {
		// 기본 데이터 타입
		/* (타입)   	유형		크기												초기값
		 * 정수형    	byte	1byte(8bit)		-128 ~ 127(256)					0
		 * 			short	2byte(16bit)	-2^15 ~ 2^15-1					0
		 * 									(-32,768 ~ 32,767)
		 * 			int		4byte(32bit)	-2^31 ~ 2^31-1					0
		 * 									(-2,147,484,648
		 * 									~ 2,147,484,647)
		 * 			long	8byte(64bit)	-2^63 ~ 2^63-1					0
		 * 									(-9,223,372,032,854,775,808
		 * 									~9,223,372,032,854,775,807)
		 * 
		 * 실수형		float	4byte			-1.451e-45f ~ 3.402e+38f		0.0F
		 * 									(소수점 7자리까지 정확)
		 * 			double	8byte			-4.940e-324 ~ 1.797e+308		0.0D
		 * 									(소수점 15자리까지 정확)
		 * 
		 * 논리형		boolean	1bit			true or false					false
		 * 
		 * 문자형		char	2byte			\u0000 ~ \uffff					'\u0000'
		 * 									(0000 0000 0000 0000 ~ 1111 1111 1111 1111)
		 * 			string	variable										null
		 * 
		 * 참조형
		 */
		int decimalValue = 7;			//7
		int binValue = 0b1000_0101;		//133
		int octValue = 077;				//63
		int hexaValue = 0xFEFE;			//65278
		
		System.out.println("10진수 7은 : " + decimalValue);
		System.out.println("2진수 10000101은 : "+binValue);
		System.out.println("8진수 77은 : "+octValue);
		System.out.println("16진수 FEFE는 : "+hexaValue);

	}

}
