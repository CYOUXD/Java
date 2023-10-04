package day15.compare.quiz;

import java.util.TreeSet;

//멤버 번호 비교 Comparator 
public class MemberQuizMain {

	public static void main(String[] args) {
		Member m1 = new Member("박지성", 1000);
		Member m2 = new Member("김연아", 1001);
		Member m3 = new Member("싸이", 1002);
		Member m4 = new Member("봉준호", 1003);
		Member m5 = new Member("조현우", 1004);
		Member m6 = new Member("BTS", 1005);
		Member m7 = new Member("박찬호", 1006);
		
		TreeSet<Member> nameLi = new TreeSet(new MemberComparator());
		nameLi.add(m1);
		nameLi.add(m2);
		nameLi.add(m3);
		nameLi.add(m4);
		nameLi.add(m5);
		nameLi.add(m6);
		nameLi.add(m7);
		
		for(Member a : nameLi) {
			System.out.println(a);
		}
	}

}
