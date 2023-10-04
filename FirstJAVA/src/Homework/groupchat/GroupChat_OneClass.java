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

public class GroupChat_OneClass {
//멀티캐스트로 채팅 프로그램 만들기 - 상대방 구분 값(클라이언트 주소), 메세지 표시방법을 고려하기
	public static void main(String[] args) {
		
		Thread client = new Thread(() -> {
			try {
				BufferedReader br = null;
				String uid = null;
				InetAddress serverIp = null;
				
				serverIp =  InetAddress.getByName("230.0.0.1");
				System.out.println("아이디를 입력하세요");
				br = new BufferedReader(new InputStreamReader(System.in));
				uid = br.readLine();
				System.out.println(uid+"님 접속");
				System.out.println("그룹 채팅을 시작합니다.");
			
				
				//키보드 입력
				BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
				serverIp =  InetAddress.getByName("230.0.0.1");
			
				
				while(true) {
					String data = sysin.readLine();
					DatagramSocket dataSocket = new DatagramSocket();
					
					byte[] msg1 = data.getBytes();
					
															
					//아이디보내기
					String idMessage = "id: " + uid;
					String msgMessage = "msg: " + data;
//					System.out.println("idMessage"+idMessage);
				
					DatagramPacket outPacket = new DatagramPacket(idMessage.getBytes(), idMessage.getBytes().length, serverIp, 9000);
					dataSocket.send(outPacket);
					DatagramPacket outPacket2 = new DatagramPacket(msgMessage.getBytes(), msgMessage.getBytes().length, serverIp, 9000);
					dataSocket.send(outPacket2);
					dataSocket.close();
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		});
		
		
		Thread server = new Thread(() -> {
			InetAddress multicastGroup = null;
			String multicastAttr = "230.0.0.1";
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
			
		});
		
		client.start();
		server.start();
		
	}
	
	
}


