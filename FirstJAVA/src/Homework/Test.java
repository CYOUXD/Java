package Homework;

class Data{
	int x;
}

public class Test {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x ="+d.x);
		
		change(d.x);
		System.out.println("Ater change(d.x)");
		System.out.println("main() : x = "+d.x);
		
	}
	
	static void change(int x) {//위의 x와 저장소가 다르다. 위의 x값을 복제해서 다른 곳에 담아서 처리한 후 메서드가 끝나면 사라진다.
		x =1000;
		System.out.println("change() : x = "+x);
	}

}