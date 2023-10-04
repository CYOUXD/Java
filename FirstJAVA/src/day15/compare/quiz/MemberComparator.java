package day15.compare.quiz;

import java.util.Comparator;

public class MemberComparator implements Comparator<Member> {
	@Override
	public int compare(Member o1, Member o2) {
		return o1.name.compareTo(o2.name);
	}
	//comparator로 멤버 번호 비교 할 때
//	public int compare(Member o1, Member o2) {
//		if(o1.num > o2.num) {
//			return 1;
//		}else if(o1.num < o2.num) {
//			return -1;
//		}
//		return 0;
//	}
}
