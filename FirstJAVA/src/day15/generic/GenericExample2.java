package day15.generic;//4

import java.util.ArrayList;

//4

public class GenericExample2 {

	public static void main(String[] args) {
		Wallet<Card, Money> card_wallet = new Wallet<>("파란색");
		Wallet<CreditCard, Money> card_wallet2 = new Wallet<>("하늘색");
		
//		Wallet<String, Integer> card_wallet3 = new Wallet<>("하늘색");
		//위의 것이 안되는 이유는? 정의 시 타입 제한이 걸려 있음.<One extends Card, Two extends Money> 이 타입만 들어 올 수 있음
		
		card_wallet.pouch.add(new CreditCard());
		card_wallet.pouch.add(new CheckCard());
		card_wallet.pouch.add(new BusCard());
//		card_wallet2.pouch.add(new CheckCard());  //안됨
		card_wallet2.pouch.add(new CreditCard());  //됨 CreaditCard와, Money를 상속 받은 클래스만 들어올 수 있음. 그래서 CheckCard는 안됨
		
		card_wallet2.pouch2.add(new Dollar());
		card_wallet2.pouch2.add(new Won());		
		
		ArrayList<Integer> int_list = new ArrayList<>();
		ArrayList<String> str_list = new ArrayList<>();
		ArrayList<Object> apple_list = new ArrayList<>();
		
		str_list.add("제너릭 때문에 문자열만 들어가요!!");
		str_list.add("이유? 이건 문자열 제너릭 컬렉션이니까요!");
		int_list.add(100);
		int_list.add(new Integer(20));
		apple_list.add(new Person<String>("홍길동", 11));
		
		usingArrayListMethod(apple_list);
		usingArrayListMethod(str_list);
		usingArrayListMethod(int_list);
		
		usingArrayListMethod(card_wallet);
		usingArrayListMethod(card_wallet2);
				
	}
	//제너릭이 다른 것 만으로는 메서드 구분이 되어지지 않기 때문에 오버로드 안됨 -> 와일드 카드 사용해서 오버로드 생성
	//타입이 다른 경우는 상관없음
//	static void usingArrayListMethod(ArrayList<Integer> list) {
//		System.out.println(list);
//	}
//	static void usingArrayListMethod(ArrayList<String> list) {
//		System.out.println(list);
//	}
	
	//<?> : 와일드 카드. 제너릭 타입으로 오버로드를 구현하고 싶을 때 사용! 어떤 타입이든 상관없이 해당 내용을 집어 넣고 싶을 때 사용
	//제너릭 타입에 상관 없이 오버로드한 메서드를 쓰고 싶을 때 사용
	//각 제너릭 타입별로 메서드를 지정하고 싶을 때 와일드 카드를 사용해서 제너릭 타입에 상관없이 오버로드 한 다음에 그 안에서 타입을 insteadOf를 사용해서 제너릭을 구분한 다음 각각 원하는 기능을 부여한다.
	static void usingArrayListMethod(ArrayList<?> list) {
		System.out.println(list);
	}
	
	static void usingArrayListMethod(Wallet<? extends Card, ? extends Money> w) {
		System.out.println(w);
	}
}

//제너릭의 extends는 타입의 범위를 제한하는 역할을 한다.

// 1.지갑 클래스 생성
//- One extends Card : 첫번재 타입은 Card를 상속 받는 클래스만 허용!
//- Two extends Money : 두번째 타입은 Money를 상속 받는 클래스만 허용!
class Wallet<One extends Card, Two extends Money> {	//해당클래스에 속한 클래스만 타입으로 올 수 있음
	ArrayList<One> pouch; //One 타입으로 만든 pouch 컬렉션 모양 멤버변수
	ArrayList<Two> pouch2; //Two 타입으로 만든 pouch2 컬렉션 모양 멤버변수
	String color;
	
	public Wallet(String color) {
		pouch = new ArrayList<>();
		pouch2 = new ArrayList<>();
		this.color = color;
	}

	public One get(int index) {
		return pouch.get(index);
	}
	
	@Override
	public String toString() {
		return "지갑의 내용물을 출력합니다";
	}	
}


class Card{}

class CreditCard extends Card{}
class CheckCard extends Card{}
class BusCard extends Card{}

class Money{}

class Won extends Money{}
class Dollar extends Money{}






