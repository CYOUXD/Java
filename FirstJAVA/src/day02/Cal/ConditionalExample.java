package day02.Cal;

public class ConditionalExample {

	public static void main(String[] args) {
		// 3항 연산자 : (조건식 ? 연산식1 :연산식2)
		// 조건식이 참이면 연산식1을 실행, 거짓이면 연산식2를 실행
		
		int a = 5 - (int)(Math.random()*10);
		
		//메인 메서드의 값을 넘겼는지 확인 후 a에 대입하는 구간
		if(args.length > 0) {
			a = Integer.parseInt(args[0]); //parstInt : int의 형태로 바꿔준다는 뜻
		}
		//이 코드는 맨 위에서 args 값이 존재 할 때 사용된다. ex)program arguments에서 100이나 -100을 강제로 입력 했을 때 그 값을 args에 저장한 다음 사용한다.
		
		int abs = (a >= 0) ? a : -a; //3항 연산 음수가 나오든 양수가 나오든 절대값으로 만들어 주는 식
		System.out.println(a+"의 절대값은 : "+abs);
	}

}
