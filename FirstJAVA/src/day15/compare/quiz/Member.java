package day15.compare.quiz;
					//멤버 번호 비교용
public class Member implements Comparable<Member> {
	String name;
	int num;
	
	public Member() {}

	public Member(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	
	//멤버 이름 비교용
	@Override
	public String toString() {
		return "이름 :"+this.name+", 멤버 번호 : "+this.num;
	}
	
	//멤버 번호 비교용
	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return this.num - o.num;
	}
}
