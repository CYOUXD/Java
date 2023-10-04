package day23.network;//6

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastEx1 {
//멀티캐스트 - 그룹 채팅 기능을 만들 때 사용하고 포트 번호를 모두 같게 해야 그룹 통신이 가능	
	public static void main(String[] args) {
		//멀티캐스트 서버
		
		InetAddress multicastGroup = null;
		String multicastAttr = "230.0.0.1"; //통신용X
		
		
		try {
			//서버(수신측)
			//멀티 캐스트 주소를 받아옴
			multicastGroup = InetAddress.getByName(multicastAttr);		
			MulticastSocket socket = new MulticastSocket(9000);// 수신
			socket.joinGroup(multicastGroup); //멀티 캐스트 그룹 가입 설정			
			//leaveGroup()을 사용하여 멀티 캐스트 그룹 해제
			
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
