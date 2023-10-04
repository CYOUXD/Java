package day09.polymorphism;

public class ObjectCollectionExample {

	public static void main(String[] args) {
		// Objdect 객체 배열 선언
		Object[] objArr = new Object[5];
		
		objArr[0] = new Person("홍길동", 30);
		objArr[1] = new Student("홍학생", 30, "20230001", "JAVA");
		objArr[2] = new Integer(100);
		objArr[3] = new String("홍길동");
		objArr[4] = new java.util.Date();

		for (int i=0; i<objArr.length; i++) {
			System.out.println(objArr[i]);		//print하면 .toString()이 실행
		}
	}

}
