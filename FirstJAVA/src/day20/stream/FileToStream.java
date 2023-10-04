package day20.stream;//10

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToStream {
//파일 읽어들이기
	public static void main(String[] args) {
		
		try {
			//Path.get() 메서드 사용
			Path path = Paths.get("src/day20/stream/StrToStream.java"); //Paths = 클래스
			Stream<String> stream = Files.lines(path, Charset.defaultCharset()); //Charset = 문자 인코딩 타입. defaultCharset = 시스템에서 정한 기본 문자 인코딩 타입 = utf-8
//			Stream<String> stream = Files.lines(path, Charset.forName("utf-8")); 
			stream.forEach(s -> System.out.println(s));
			stream.close(); //객체 생성되고 사용한 후 안 쓸거면 닫아줘야 한다. 안닫으면 프로그램 종료후 사라지기 때문에 메모리를 그때까지 사용하기 때문에 미리 닫아준다. 지금까지는 finally에서 작성
			System.out.println();
			
			//BufferedReader의 lines() 메서드 이용(반환 타입 : Strean<String>) 이용
			File file = path.toFile();	//path 객체 를 file 객체로 변환
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.lines().forEach(s -> System.out.println(s));//lines() = Stream<String> 그래서 forEach메서드를 사용할 수 있음
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}

	}

}
