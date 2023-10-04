package day22.network;//1

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		//InetAddress 클래스
		
		//checked Exception		
		try {
			//getByName 메서드로 InetAddress 객체 생성 - 직접 객체를 생성할 수 없어서 메서드로 정보를 받아온다.
			InetAddress ip = InetAddress.getByName("www.google.co.kr");
//			InetAddress ip = InetAddress.getByName("www.naver.com");
			System.out.println("hostname : "+ip.getHostName());
			System.out.println("ip : "+ip.getHostAddress()); // 구글의 호스트 주소, 프록시 서버의 주소
			
			//getAllByName() 메서드 InetAddress 객체 배열 생성
			InetAddress[] ips = InetAddress.getAllByName("www.naver.com"); //관련된 주소 정보가 여러개면 여러개를 받아옴
			for(InetAddress i : ips) {
				System.out.println("ip 주소 : "+i);
			}
			
			//ip 주소값을 byte[] 배열로 리턴
			byte[] ipAddr = ip.getAddress();	//ip 주소값만 빼냄
			//byte 자료형의 표현 범위 -128(1000 0000) ~ 127(0111 1111)
			for(byte b : ipAddr) {
				System.out.print(((b<0)? b+256:b)+".");
			}
			System.out.println();
			
			//getLocalHost() 메서드 InetAddress 객체 생성 호출
			InetAddress local = InetAddress.getLocalHost(); //로컬 호스트의 주소를 알아옴
			System.out.println("내 컴퓨터 IP : "+local);
			
			//getByAddress() 메서드로 InetAddress 객체 생성 호출
			InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress()); //아이피 주소만 추려내 줌
			System.out.println(ips[0].getHostName()+"주소 : "+ip2);
			
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
