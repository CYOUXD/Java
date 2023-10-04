package Homework.groupchat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.util.Arrays;

public class GroupChat {
//멀티캐스트로 채팅 프로그램 만들기 - 상대방 구분 값(클라이언트 주소), 메세지 표시방법을 고려하기
	public static void main(String[] args) {
		ChatClient b = new ChatClient();
		ChatServer a = new ChatServer();
		b.start();			
		a.start();
	}
}

//Server
class ChatServer extends Thread {
	InetAddress multicastGroup = null;
	String multicastAttr = "230.0.0.1";
	
	@Override
	public void run() {
		try {
			multicastGroup = InetAddress.getByName(multicastAttr);		
			MulticastSocket socket = new MulticastSocket(9000);
			socket.joinGroup(multicastGroup); 	
			
			DatagramPacket inPacket;
			byte[] inMsg = null;
			
			while(true) {
				inMsg = new byte[1024];					
				inPacket = new DatagramPacket(inMsg, inMsg.length);		
				
				socket.receive(inPacket); 
				
				String msg = new String(inMsg,0,inPacket.getLength());
				if (msg.startsWith("id: ")) {
					String idContents = msg.substring("id: ".length());
					System.out.print(idContents.stripTrailing()+" : ");
				} else if (msg.startsWith("msg: ")) {
					String msgContents = msg.substring("msg: ".length());
					System.out.println(msgContents.stripTrailing());
				}
				
				InetAddress address = inPacket.getAddress();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


//Client
// 192.168.1xx 여야 통신이 가능함, 다른건 안됨! - 통신할 사람들끼리 같은 192.. 대역대여야 한다.
// 172. ...은 도커가 만든 가상 네트워크이기 때문에 통신 불가
//소켓을 수정해서 192...로 바꿔서 보내야 한다.
//소켓이랑 바인드를 이용해서 수정해보기
class ChatClient extends Thread {
	BufferedReader br = null;
	String uid = null;
	InetAddress serverIp = null;
	
	@Override
	public void run() {
		
		try {
			
			serverIp =  InetAddress.getByName("230.0.0.1");
//				System.out.println("getHostAddress : "+serverIp.getHostAddress());
			System.out.println("아이디를 입력하세요");
			br = new BufferedReader(new InputStreamReader(System.in));
			uid = br.readLine();
			System.out.println(uid+"님 접속");
			System.out.println("그룹 채팅을 시작합니다.");
		
			
			//키보드 입력
			BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
//				InetAddress
			serverIp =  InetAddress.getByName("230.0.0.1");
		
			
			while(true) {
				String data = sysin.readLine();
				DatagramSocket dataSocket = new DatagramSocket();
				
				byte[] msg1 = data.getBytes();
				
														
				//아이디보내기
				String idMessage = "id: " + uid;
				String msgMessage = "msg: " + data;
//				System.out.println("idMessage"+idMessage);
			
				DatagramPacket outPacket = new DatagramPacket(idMessage.getBytes(), idMessage.getBytes().length, serverIp, 9000);
				dataSocket.send(outPacket);
				DatagramPacket outPacket2 = new DatagramPacket(msgMessage.getBytes(), msgMessage.getBytes().length, serverIp, 9000);
				dataSocket.send(outPacket2);
				dataSocket.close();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			

	}
}
