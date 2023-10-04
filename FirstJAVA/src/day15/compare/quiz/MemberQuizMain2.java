package day15.compare.quiz;

import java.util.TreeSet;

//멤버 번호 비교 Comparable 
public class MemberQuizMain2 {

	public static void main(String[] args) {
		Member m1 = new Member("박지성", 1000);
		Member m2 = new Member("김연아", 1001);
		Member m3 = new Member("싸이", 1002);
		Member m4 = new Member("봉준호", 1003);
		Member m5 = new Member("조현우", 1004);
		Member m6 = new Member("BTS", 1005);
		Member m7 = new Member("박찬호", 1006);
		
		TreeSet<Member> numLi = new TreeSet();
		numLi.add(m1);
		numLi.add(m2);
		numLi.add(m3);
		numLi.add(m4);
		numLi.add(m5);
		numLi.add(m6);
		numLi.add(m7);
		
		for(Member a : numLi) {
			System.out.println(a);
		}

	}
}
