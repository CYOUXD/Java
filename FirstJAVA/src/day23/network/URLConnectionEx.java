package day23.network;//1

import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx {

	public static void main(String[] args) {
		//URLConection 예제
		
		URL url = null;
		String address = "https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1";
		
		try {
			url = new URL(address); //url 정보 생성
			URLConnection conn = url.openConnection();	//추상 클래스라서 객체 생성을 못함(new URL...으로 생성 불가)
			//프록시 = 보안생성, 대리인, 실제 장비를 숨김, 네트워크 성능 향상
			System.out.println("conn.toString() : "+conn);
			System.out.println("getAllowUserInteraction() : "+conn.getAllowUserInteraction());
			System.out.println("getConnectTimeout() : "+conn.getConnectTimeout());
			
			//Content관련 메서드는 network의 body의 관련 정보를 알아옴
			System.out.println("getContent() : "+conn.getContent());	//HttpInputStream에 서버에서 받은 텍스트 정보가 들어있음
			System.out.println("getContentEncoding() : "+conn.getContentEncoding());	// null : 전달된 url에 인코딩 설정되지 않음. 아스키코드임
			System.out.println("getContentLength() : "+conn.getContentLength()); //body의 response 길이 값
			System.out.println("getcontentType() : "+conn.getContentType());
			System.out.println("getDate() : "+conn.getDate());
			System.out.println("getDefaultUseCaches() : "+conn.getDefaultUseCaches());
			System.out.println("getDoInput() : "+conn.getDoInput());
			System.out.println("getDoOutput() : "+conn.getDoOutput());
			
			System.out.println("getExpiration() : "+conn.getExpiration());
			System.out.println("getHeaderFields() : "+conn.getHeaderFields());
			
			System.out.println("getIfModifiedSince() : "+conn.getIfModifiedSince());
			System.out.println("getLastModified() : "+conn.getLastModified());
			
			System.out.println("getReadTimeout() : "+conn.getReadTimeout());
			System.out.println("getURL() : "+conn.getURL());//URL 클래스 반환
			System.out.println("getUseCashes() : "+conn.getUseCaches());
						
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
