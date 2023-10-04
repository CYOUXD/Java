package day12.exception;//7

import java.io.IOException;
//import java.sql.SQLException;

public class Sub extends Super {
	
	//메서드 재정의 시에
	//부모가 throws 하지 않은 예외에 대해서 처리할 수 없음. 부모의 메서드를 오버라이드 할 때는 예외 정의도 같아야 한다.
	//부모가 예외 정의를 최상위인 Exception으로 하면 재정의 할 때 catch 부분에 아무거나 정의해도 상관없다. 
	@Override
//	public void doIt() throws IOException, SQLException {	//Error : 재정의 시 부모의 예외처리를 넘어서는 예외를 만들 수 없다. 
	public void doIt() throws IOException {	
		System.out.println("Sub.doIt");
		try {
			super.doIt();
		}catch (IOException e) {
//			throw new SQLException(e.getMessage());  //Error : 재정의 시 부모의 예외처리를 넘어서는 예외를 만들 수 없다.
		}
	}	
}
