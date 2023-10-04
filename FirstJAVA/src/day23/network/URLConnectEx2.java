package day23.network;//2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLConnectEx2 {

	public static void main(String[] args) {
		// URLConnection 예제
		//페이지에 있는 데이터 읽어오기
		URL url = null;
		String address = "https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1";
		
		BufferedReader br = null;
		String readline = "";
		
		try {
			url = new URL(address);
			br = new BufferedReader(new InputStreamReader(url.openStream()));  //웹상의 데이터는 바이트 단위로 처리한다.
			//openStream : HttpURLConnection내에 있는 HttpInputStream 정보를 가지고 있음
			
			while((readline = br.readLine()) != null) {
				System.out.println(readline);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
