package day13.api.java_util;//10

import java.util.Calendar;

public class CalendarExample {

	 // Calendar 클래스 : 날짜 및 시간을 쉽게 다룰 수 있는 클래스
	
	public static void main(String[] args) {
		//Calendar는 생성자를 사용할 수 없고, getInstance() 메서드를 이용하여 인스턴스를 생성
		//인스턴스를 생성한 시점의 시간 정보를 생성!
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		//Calendar의 get() 메서드와 Calendar 상수를 이용하여 원하는 정보 얻기
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int hod = cal.get(Calendar.HOUR_OF_DAY);	//하루의 시간
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int millisec = cal.get(Calendar.MILLISECOND);
		
		System.out.printf("%d년 %d월 %d일 - %02d:%d:%d.%d\n", year, month, date, hour, min,sec, millisec);	// 02 = 자릿수 지정. 한자리 수 일 때 빈자리는 0으로 채워준다.
		System.out.printf("%d년 %d월 %d일 - %d:%d:%d.%d\n", year, month, date, hour, min,sec, millisec);
		System.out.println("하루 24시간일 때 몇 시 : "+hod);
		
		printDayOfSeries(cal);
		
		//원하는 필드 변경 .set()
		cal.set(Calendar.DATE,6); //날짜를 6일로 바꿈
		printDayOfSeries(cal);
		
		cal.set(Calendar.DATE,8); 
		printDayOfSeries(cal);
		
		//원하는 필드 더하기 .add()
		//다음 달 혹은 다음 해, 내일 계산도 알아서 처리
		cal.add(Calendar.DATE,7);	//add - 오늘 날짜에 7을 더한다. = 7일 후
		printDayOfSeries(cal);
		
		cal.add(Calendar.DATE,-20);	//add - 오늘 날자에 -20을 더한다. = 20일 전
		printDayOfSeries(cal);
	}
	
	static void printDayOfSeries(Calendar cal) {
		//dayOfYear : 해당 연도의 날짜
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		
		//dayOfMonth : 해당 월의 날짜
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		
		//dayOfWeek : 요일
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		//dayOfWeek : 요일(1 : 일요일 ~ 7 : 토요일)
		System.out.println(Calendar.MONDAY);
		System.out.println(Calendar.TUESDAY);
		System.out.println(Calendar.WEDNESDAY);
		System.out.println(Calendar.THURSDAY);
		System.out.println(Calendar.FRIDAY);
		System.out.println(Calendar.SATURDAY);
		System.out.println(Calendar.SUNDAY);
		
		//dayOfWeekInMonth : 해당 요일이 몇번째 요일인지 체크(ex : 세번째 토요일)
		int dayOfweekInMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println("---------------------------------------------");
		System.out.printf("dayOfYear : %d\n"
					+ "dayOfMonth : %d\n"
					+ "dayOfWeek : %d\n"
					+ "dayOfWeekInMonth : %d\n",
					dayOfYear, dayOfMonth, dayOfWeek, dayOfweekInMonth);
		
		
	}

}
