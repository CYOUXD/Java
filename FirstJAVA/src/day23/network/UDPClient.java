package day23.network;//4-2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
//UDP - 송신, 수신
//UDP client - 데이터를 보내는 쪽(송신), UDP server - 데이터를 받는 쪽(수신) 나눠서 작성한 것. 보통은 클래스로 나눠서 같이 만들어짐
	public static void main(String[] args) {
		//UDP Client
		try {
			//키보드 입력
			BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in)); //데이터 입력 받기
			
			//서버 아이피(127.0.0.1 -> 로컬 호스트(localhost)
//			InetAddress serverIp =  InetAddress.getByName("127.0.0.1"); //주소 알아오기 (유니캐스트 주소)
//			InetAddress serverIp =  InetAddress.getByName("localhost"); //이렇게 써도 됨
			
//			InetAddress serverIp =  InetAddress.getByName("255.255.255.255"); //브로드 캐스트 주소 - 이걸로 설정하면 브로드 캐스트 서버로 데이터를 보낼 수 있음
			InetAddress serverIp =  InetAddress.getByName("230.0.0.1"); //멀티캐스트 주소
			
			while(true) {
				//한 줄 읽기
				String data = sysin.readLine(); //입력한 데이터 저장
				DatagramSocket dataSocket = new DatagramSocket();
				//문자열을 바이트 배열에 저장
				//바이트 단위로 처리해야 함
				byte[] msg1 = data.getBytes();	//getBytes() : 문자열을 바이트 형태로 변경
				
				//서버로 전송(데이터, 데이터 길이, 서버IP, 포트 번호)
				DatagramPacket outPacket = new DatagramPacket(msg1, msg1.length, serverIp, 9000); 
				// DatagramPacket(메세지, 메세지 길이, 전송할 서버, 전송할 포트 번호)
				dataSocket.send(outPacket); //send() : 데이터를 보냄
				//소켓 닫기
				dataSocket.close();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
