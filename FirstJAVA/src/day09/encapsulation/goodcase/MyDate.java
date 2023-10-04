package day09.encapsulation.goodcase;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	//getter : 데이터 전달하는 부분
	public int getDay() {
		return day;
	}
	
	//setter : 입력값 검증하는 부분
	public void setDay(int day) {
//		if(day<32 && day>0) {
//			this.day = day;
//		}else if(day == null) {
//			System.out.println("날짜를 입력해 주세요.");
//		}else {
//			System.out.println("잘못된 입력값 입니다.");
//		}
		
		//선생님 ver
		if((day<1)||(day>31)) {
			System.out.println("잘못된 입력값 입니다.");
			this.day =1;	//오류 시 보여줄 기본 값으로 1로 넣음
		}else {
			this.day = day;
		}
	}
	
	
}
