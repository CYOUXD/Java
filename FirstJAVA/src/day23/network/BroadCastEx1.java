package day23.network;//5

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BroadCastEx1 {
	//브로드 캐스트
	//네트워크 내에 있는 모든 장비에게 메시지를 전달하는 통신 방식
	public static void main(String[] args) {
		try {
			//서버
			DatagramSocket socket = new DatagramSocket(9000);// 수신
			socket.setBroadcast(true); // <-UDP에서 이걸 추가해주면 브로드캐스트 사용가능!
			
			DatagramPacket inPacket; //클라이언트에게 송신
			byte[] inMsg = null;
			
			while(true) {
				//데이터를 받기 위한 바이트 배열 생성
				inMsg = new byte[1024]; //최대 1024 크기의 데이터만 주고 받음
				
				//DatagramPacket 객체 생성
				inPacket = new DatagramPacket(inMsg, inMsg.length); //DatagramPacket(보낼 데이터, 보낼 데이터의 길이) - 1024길이 데이터 처리
				
				//패킷 데이터 수신
				socket.receive(inPacket); //receive() : 보낸 데이터를 받음
				//문자열로 저장
				String msg = new String(inMsg, 0, inPacket.getLength()); //보낸 메세지 길이만큼 문자열로 만들어 줌
				System.out.println("클라이언트 메시지 : "+msg);
				
				//클라이언트 아이피
				InetAddress address = inPacket.getAddress();
				//클라이언트 포트
				int port = inPacket.getPort();
				System.out.println("클라이언트 주소 : "+address);
				System.out.println("클라이언트 포트 번호 : "+port);
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
