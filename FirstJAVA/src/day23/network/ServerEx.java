package day23.network;//3

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		// 서버
		
		//소켓 생성
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(9999); //포트 번호는 충돌이 나지 않는다면 임의로 사용 가능
			
			//응답이 언제 올 지 모르니까 무한 반복(클라이언트 접속 대기)
			while(true) {
				System.out.println("클라이언트 접속 대기");
				Socket client = server.accept();//accept() :나에게 정보를 요청하는 것의 정보
				System.out.println("스레드 생성");
				HttpThread ht = new HttpThread(client);
				ht.start();
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				server.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}

	}

}


class HttpThread extends Thread {
	//필드
	private Socket client;
	BufferedReader br;	//client 요청 정보
	PrintWriter pw;		//서버측 전송 정보
	
	//생성자
	public HttpThread(Socket client) {
		this.client = client;
		try {
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//파일을 읽고 읽은 값 전송
	@Override
	public void run() {
		BufferedReader fbr = null; //읽은 데이터 처리
		DataOutputStream outToClient = null;	//처리한 데이터 보냄
		try {
			String line = br.readLine();
			//line : GET / HTTP/1.1 -> start line
			System.out.println("HTTP Header : "+line);
			int start = line.indexOf("/")+1; // /부터
			int end = line.lastIndexOf("HTTP")-1; // HTTP 전까지
			String fileName = line.substring(start, end); //substring : 인덱스 값으로 문자열을 자름
			if(fileName.equals("")) {
				fileName = "index.html";
			}
			System.out.println("사용자 요청 파일 : "+fileName);
			fbr = new BufferedReader(new FileReader(fileName));
			String fileLine = null;
			pw.println("HTTP/1.0 200 Document Follow \r\n");
			while((fileLine = fbr.readLine()) != null) {
				pw.println(fileLine);
				pw.flush();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(client != null) client.close();
			} catch (IOException e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
	
}