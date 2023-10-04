package day15.compare; //1 //3
					//3
public class Dog implements Comparable<Dog> {
	String dogId;
	String dogName;
	int weight;
	
	//동등 비교 : equals, hashcode를 재정의해서 비교
	//크기 비교 : Comparable, comparator를 사용해서 비교
	
	//3
	//Comparable 인터페이스의 추상 메서드
	//몸무게 비교 후 정렬
	@Override
	public int compareTo(Dog o) {
		//return 0; 이라고만 쓰면 compareTo로 비교 했는데 똑같다고 생각해서 중복값이 들어가지 못하게한다. 그래서 하나만 들어감
		return this.weight - o.weight;
	}
	
	public Dog(String dogId, String dogName, int weight) {
		super();
		this.dogId = dogId;
		this.dogName = dogName;
		this.weight = weight;
	}
	
	@Override
	public String toString() {		
		return "Dog [dogId="+dogId+", dogName="+dogName+"]"+this.hashCode();
	}

	//getter setter
	public String getDogId() {
		return dogId;
	}

	public void setDogId(String dogId) {
		this.dogId = dogId;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//같은지 아닌지 비교하기 위해서 equals를 재정의
	//객체간의 비교를 하기 위해서는 반드시 hashCode()와 equals()를 둘 다 재정의해야 함.
	//object의 equals는 객체값만 비교하고 value 값을 비교하지 않는다. 객체 안의 값을 비교하려면 equals와 hashcode를 재정의해서 사용해야 한다.
	//기본 타입을 비교 할 때는 재정의하지 않아도 되고 일반 객체를 비교할 때는 반드시 재정의하여 사용해야 한다.
	@Override
	public boolean equals(Object obj) {
		//틀리다로 비교하는게 조건의 갯수가 더 적음
		//모든 false 조건을 통과하면 true
		if(this == obj) return true;	//생성된 객체 그 자체를 비교하는 상황 = 주소값까지 같다 true
		if(obj == null) return false;	//obj의 객체가 생성되지 않은 상황
		if(getClass() != obj.getClass()) return false;	//생성 클래스 비교
		
		//내부 멤버에 대한 비교
		//dogId
		Dog other = (Dog)obj;
		if(dogId == null) {
			if(other.dogId != null) {
				return false;
			}
		}else if(!dogId.equals(other.dogId)) {
			return false;
		}
		
		//dogName
		if(dogName == null) {
			if(other.dogName != null) {
				return false;
			}
		}else if(!dogName.equals(other.dogName)) {
			return false;
		}
		
		//weight
		if(weight != other.weight) return false;
		
		return true; //위의 false인 경우에 해당되지 않으면 true;		
	}

	@Override
	public int hashCode() {	//해쉬값을 비교했을 때 같다면 두 값은 같다
		final int prime = 31;	//큰 값을 만들기 위한 값
		int result = 1;
		//해쉬 코드는 문자열을 계산 할 수 없으므로 문자열에 대한 해쉬코드를 받아온다. 
		//해쉬 코드가 낮은 확률로 똑같을 수 있기 때문에 equals도 같이 써서 비교해줘야 한다.
		result = prime * result + ((dogId == null) ? 0 : dogId.hashCode());
		result = prime * result + ((dogName == null) ? 0 : dogName.hashCode()); //dogName.hashCode() : 문자열 자체의 해시코드를 가져옴
		result = prime * result + weight;
		
		return result;
	}
	
	
}
