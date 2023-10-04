package day09.quiz;

public class ShopQuiz {

	public static void main(String[] args) {
		// Test
		Buyer b1 = new Buyer();
		b1.cash = 500000;
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Vaccine(69000, "V3"));
		b1.addToCart(new Vaccine(69000, "V3"));
		b1.addToCart(new Vaccine(69000, "V3"));
		b1.addToCart(new Vaccine(69000, "V3"));
		
		b1.buyAll();
		System.out.println("======================카트 정보========================");
		b1.viewCart();
		System.out.println("======================트렁크 정보========================");
		b1.viewTrunk();
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.buyAll();
		
		b1.receipt();
		
		for(int i=0; i<b1.t_index; i++) {
			Product p = b1.trunk[i];
			
			if(p instanceof Vaccine) {	//p가 Vaccine이라면 
				Vaccine v = (Vaccine)p;	//(Vaccine)으로 캐스팅을 하면 Vaccine에 있는 메서드를 쓸 수 있다.
				v.checkComputer();
			}else if(p instanceof Coffee) {
				Coffee c = (Coffee)p;
				c.drink();
			}else {
				
			}
		}
	}

}

class Buyer {
	/*
	 * Buyer의 인스턴스 변수(상태)
	 * 	필요한 만큼 사용하세요.
	 * 
	 */
	int cash;
	
	//트렁크 관련 변수
	final int MAX_TRUNK_SIZE = 20;
	Product[] trunk = new Product[MAX_TRUNK_SIZE];	
	//*****Product[] = Product 모양의 배열이 들어갈 거라는 뜻 String[]이 문자열이 들어갈 예정인 배열인 것처럼 아래에 있는 Product class들이 들어갈 배열이라는 뜻
	int t_index = 0;
	
	//카트 관련 변수
	final int INIT_CART_SIZE = 3;
	Product[] cart = new Product[INIT_CART_SIZE];
	int c_index = 0;
	
	/*
	 * Buyer의 기능(method)
	 * 1. 메서드명 : buy
	 * 	   기능 : 지정한 물건(Product)를 구입한다.
	 * 		바이어의 돈(cash)에서 물건의 가격을 빼고, 
	 * 		내 트렁크(trunk)에 담는다
	 * 		만약 가진 돈이 부족하다면 구매할 수 없다.
	 * 		리턴타입 : 없음
	 * 		매개변수 : Product p
	 * 
	 */
	
	//1
	void buy(Product p) {	// int p 처럼 Produce 클래스 모양인 p의 값을 매개변수로 받는다는 의미
		//구매 못하는 상황
		if(cash < p.getPrice()) {
			System.out.println("가진 돈이 너무 적습니다.");
			return;	
			//구매를 막기 위해 함수를 종료해야한다. 종료하지 않으면 아래의 함수가 실행된다. 
			//구매 못할 때 다음 함수가 아예 실행되지 않아야 하기 때문에 각각 return을 넣어서 조건이 맞으면 바로 함수를 종료한다.
		}else if(t_index == MAX_TRUNK_SIZE) {
			System.out.println("트렁크가 가득 찼습니다.");
			return;
		}
		
		//구매하고 트렁크에 담기  p에는 이름과 가격이 들어 있다.
		cash -= p.getPrice();
		trunk[t_index++] = p; 
		
	}
	
	/*
	 * 2. 메서드 명 : buyAll
	 * 		기능 : 장바구니(cart)에 지정된 모든 물건을 구매(buy)
	 * 		리턴타입 : 없음
	 * 		매개변수 : 없음, Product[] cart
	 */
	
	//2
	void buyAll() {
		//2-5구매하려는 물건이 트렁크 빈 공간보다 많을 때(사전 검증)
		if(c_index - getNullCount() + t_index > MAX_TRUNK_SIZE) {  
			//getNullCount() : 카트의 빈 공간을 구하는 메서드
			//c_index - getNullCount() : 카트 전체 공간에서 비어있는 카트 공간을 뺀다. = 카트에 담긴 물건 개수
			System.out.println("구매하려는 물건이 너무 많습니다.");
			return; //종료
		}
		
		//2-1카트 전부 구매
		for(int i=0; i<c_index; i++) { //카트 길이만큼 구매
			if(cart[i] != null) {	//카트가 비어있지 않을 때 구매
				buy(cart[i]);
			}
		}
		//2-3구매 후 카트 초기화
		clearCart();
	}
	
	//2-2 - 카트 비우기
	private void clearCart() {
		cart = new Product[INIT_CART_SIZE];	//카트를 새로 만들면 빈 카트가 생김
		c_index = 0;
	}
	
	//2-4
	int getNullCount() {
		int count = 0;	//빈 카트 공간 개수 저장할 변수
		for(int i=0; i<c_index; i++) { //c_index 대신 cart.length로 해도 됨
			if(cart[i] == null)	//전체 카트 공간에서 비어있는 카트의 공간의 개수를 센다
				count++;
		}
		return count;
	}
	
	//5-1구매한 물건 목록 보여주기(trunk에 있음)
	private void viewList(Product[] pArr, int index) {
		//구매 물건 = 트렁크에 들어 있는 물건 보여주기
		for(int i=0; i<index; i++) {
			Product p = pArr[i];	//진화된 for문 사용가능
			//Product 안의 모든 데이터로 만든 배열의 각 값을 p에 넣어서 p안에 있는 메서드를 사용할 수 있게 하기 위해 Product p = pArr[i]를 담아서 출력하는 것
			System.out.printf(i+1+". 상품명[%s], 가격[%d]\n",p.getName(), p.getPrice());
		}
	}
	
	//5-2 트렁크 보기
	public void viewTrunk() {
		viewList(trunk, t_index);
		
	}
	//5-3 카트보기
	public void viewCart() {
		viewList(cart, c_index);
		
	}
	
	
	/*
	 * 3. 메서드 명 : addToCart
	 * 		기능 : 지정한 물건을 장바구니(cart)에 담는다
	 * 			만약에 장바구니에 담을 공간이 부족하면
	 * 			장바구니 배열의 크기를 2배로 늘린 다음에 담는다.
	 * 		리턴타입 : 없음
	 * 		매개변수 : Product p
	 */
	void addToCart(Product p) {
		//3-1카트의 빈 공간이 있으면 거기에 물건 넣기
		for(int i=0; i<c_index; i++) {
			if(cart[i]==null) {	//카트에 빈 공간이 있다면
				cart[i] = p;
				System.out.println("비어있는 곳 "+i+"에 넣었습니다.");
				return;	//중간에 빈칸이 있으면 집어 넣고 종료 되기 때문에 맨 아래에 있는 물건 담는 식은 실행되지 않는다.
			}
		}
		//3-2카트에 빈 공간이 없을 경우
		if(c_index == cart.length) {
			Product[] newCart = new Product[cart.length *2];	//공간이 2배인 카트를 새로 만든다
			//기존 카트 배열 카피 arraycopy();
			System.arraycopy(cart, 0, newCart, 0, cart.length);
			//카트 변수 안에 새로 만든 카트를 넣어주기
			cart = newCart;	//주소 값을 변경, 얕은 카피
		}
		
		//3-3 카트에 물건 담기
		cart[c_index++] = p; //맨 마지막에 담긴 물건의 다음 배열에 새 물건 담기
	}
	
	/*
	 * 4. 메서드 명 : cancel
	 * 		기능 : 지정한 물건을 장바구니에서 뺀다.
	 *			뺀 곳에는 다시 물건을 담을 수 있어야 한다.
	 *		리턴타임 : 없음
	 *		매개변수 : int cart_index 			
	 */
	//4
	void cancel(int cart_index) {  //cart_index : c_index가 아님. 내가 지정한 물건의 카트 번호니까 0부터 시작하지 않음. ex) 1번 물건, 2번 물건...
		cart[cart_index-1] = null;
	}
	
	/*
	 * 5. 메서드명 : receipt
	 * 		기능 : 바이어가 구매한 물건의 목록과 사용 금액, 남은 금액을 출력한다.
	 * 		리턴타입, 매개변수 : 없음
	 */
	
	//5-4
	//사용 금액과 남은 금액 출력(cash에 있음)
	void receipt() {
		//구매한 물건 목록 보여주기(trunk에 있음)
		viewTrunk();
		//사용 금액과 남은 금액 출력(cash에 있음)
		System.out.println("사용 금액 : "+getTotalPrice(trunk, t_index));
		System.out.println("남은 금액 : "+cash);
	}
	
	//5-5
	int getTotalPrice(Product[] pArr, int index) {
		int price = 0;
		for(int i=0; i<index; i++) {
			price += pArr[i].getPrice();
		}
		return price;
	}
}

/*
 * Product 클래스를 상속받아서 상품을 3개 이상 만들어 보세요
 * (단, Product 클래스를 변경하면 안됨!)
 */

class Product{	//부모 클래스로 사용할 예정
	String name;
	private int price;	//private : 내 클래스 내부에서만 사용함
	
	public Product(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
}

//-----------------------------------------------------------

//1. 자식 상품 3개 만들기
//class Coffee extends Product{
//	String name;
//	
//	Coffee(int price, String name) {
//		super(price);
//		this.name = name;
//	}	
//}
//
//class Fruit extends Product{
//	String name;
//	
//	Fruit(int price, String name) {
//		super(price);
//		this.name = name;
//	}	
//}
//
//class Pen extends Product{
//	String name;
//	
//	Pen(int price, String name) {
//		super(price);
//		this.name = name;
//	}	
//}


//--------------------------선생님 ver---------------------------------

class Coffee extends Product{
	//상속받은 클래스는 생성자에서 반드시 부모 생성자를 호출 
	//호출하지 않으면 기본타입으로 생략되어 있다 - 클래스 만들 때 웬만하면 기본 생성자는 만들자(오류 줄이기)
	
	//아무것도 적지 않은 생성자에는 super()가 생략되어 있다.
	
	//Product라는 부모 클래스에는 기본 생성자가 없기 때문에 
	//super(int price) 타입의 생성자를 반드시 호출해야 합니다.
	
//	String name;
	
	Coffee(int price, String name) {
		super(price);
		this.name = name;		
		//부모가 만든 변수(name)는 자식에서 가져와서 쓸 수 있다. 여기의 this는 부모에게서 가져온 name(=자식이 가지게 된 name)에 매개변수로 받은 name을 넣는다는 뜻
	}
	
	void drink() {
		System.out.println("'"+name+"' 커피를 끓여 마셨습니다.'");
	}
}

class SmartPhone extends Product{
	public SmartPhone(int price, String name) {
		super(price);
		this.name = name;
	}
}

class Vaccine extends Product{
	public Vaccine(int price, String name) {
		super(price);
		this.name = name;
	}
	
	void checkComputer() {
		System.out.println(name+"이 컴퓨터를 검사합니다.");
	}
}


//----------------------------문제-------------------------------
//public static void main(String[] args) {
//	// Test
//	Buyer b1 = new Buyer();
//	b1.cash = 500000;
////	b1.addToCart(new Coffee(10000, "이디야 원두"));
////	b1.addToCart(new Coffee(15000, "커피빈 원두"));
////	b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//	
//
//}
//
//}
//
//class Buyer {
///*
// * Buyer의 인스턴스 변수(상태)
// * 	필요한 만큼 사용하세요.
// * 
// */
//int cash;
//
////트렁크 관련 변수
//final int MAX_TRUNK_SIZE = 20;
//Product[] trunk = new Product[MAX_TRUNK_SIZE];
//int t_index = 0;
//
////카트 관련 변수
//final int INIT_CART_SIZE = 3;
//Product[] cart = new Product[INIT_CART_SIZE];
//int c_index = 0;
//
///*
// * Buyer의 기능(method)
// * 1. 메서드명 : buy
// * 	   기능 : 지정한 물건(Product)를 구입한다.
// * 		바이어의 돈(cash)에서 물건의 가격을 빼고, 
// * 		내 트렁크(trunk)에 담는다
// * 		만약 가진 돈이 부족하다면 구매할 수 없다.
// * 		리턴타입 : 없음
// * 		매개변수 : Product p
// * 
// */
//
//
///*
// * 2. 메서드 명 : buyAll
// * 		기능 : 장바구니(cart)에 지정된 모든 물건을 구매(buy)
// * 		리턴타입 : 없음
// * 		매개변수 : 없음, Product[] cart
// */
//
///*
// * 3. 메서드 명 : addToCart
// * 		기능 : 지정한 물건을 장바구니(cart)에 담는다
// * 			만약에 장바구니에 담을 공간이 부족하면
// * 			장바구니 배열의 크기를 2배로 늘린 다음에 담는다.
// * 		리턴타입 : 없음
// * 		매개변수 : Product p
// */
//
///*
// * 4. 메서드 명 : cancel
// * 		기능 : 지정한 물건을 장바구니에서 뺀다.
// *			뺀 곳에는 다시 물건을 담을 수 있어야 한다.
// *		리턴타임 : 없음
// *		매개변수 : int cart_index 			
// */
//
///*
// * 5. 메서드명 : receipt
// * 		기능 : 바이어가 구매한 물건의 목록과 사용금액, 남은 금액을 출력한다.
// * 		리턴타입, 매개변수 : 없음
// */
//}
//
///*
//* Product 클래스를 상속받아서 상품을 3개 이상 만들어 보세요
//* (단, Product 클래스를 변경하면 안됨!)
//*/
//
//class Product{	//부모 클래스로 사용할 예정
//String name;
//private int price;	//private : 내 클래스 내부에서만 사용함
//
//public Product(int price) {
//	this.price = price;
//}
//
//public String getName() {
//	return name;
//}
//
//public int getPrice() {
//	return price;
//}
//
//}




