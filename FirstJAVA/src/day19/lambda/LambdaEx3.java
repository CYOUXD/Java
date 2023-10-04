package day19.lambda;//4

public class LambdaEx3 {

	public static void main(String[] args) {
		LambdaInterface3 li3 = (String name) -> {
			System.out.println("제 이름은 "+name+"입니다.");
		};
		
		LambdaInterface3 li32 = name -> {//소괄호를 생략하려면 String은 지워야 함
			System.out.println("제 이름은 "+name+"입니다.");
		};
		li3.print("홍길동");
		li32.print("이순신");
	}

}
@FunctionalInterface
interface LambdaInterface3{
	void print(String name);
//	void print();
}