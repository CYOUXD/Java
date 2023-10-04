package day20.stream;//11

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class DirectoryToStream {

	public static void main(String[] args) {
		// list() 메서드를 이용하여 스트림 생성하기
		try {
			System.out.println("list() 메서드를 이용하여 스트림 생성하기");
			//src 디렉터리로 Path 객체 생성
			Path path = Paths.get("src"); //실행 위치에서 src 디렉터리를 찾음. 모든 프로젝트는 최상위에서 실행됨 = FirstJAVA 그래서 src는 FirstJAVA내부의 src를 의미한다.
			//프로젝트내의 실행하는 모든 기본 위치는 최상위 폴더이다.(상대경로 시작 지점)
			//따로 경로를 정하지 않으면 모든 상대 경로의 시작 위치는 최상위 폴더
			//src 경로의 모든 디렉터리와 파일 Stream 객체로 생성
			Stream<Path> sr1 = Files.list(path);
			sr1.forEach(p -> System.out.println(p.getFileName())); 
			
			System.out.println("find() 메서드를 이용해서 스트림 생성하기");
			//src 디렉터리를 시작으로 특정 단계까지 디렉터리 깊이로 탐색
			Stream<Path> sr2 = Files.find(path, 10, (p, BasicFileAttributes) -> {	//path부터 시작해서 10의 깊이 만큼 탐색.
				//path 내부의 10의 깊이 만큼 있는 것들을 p에 담아서 여러번 반복한다.
				//(p, BasicFileAttributes) : (파일, 파일에 대한 속성값)을 받아서
				File file = p.toFile();//p는 파일 객체가 아니기 때문에 파일인지 디렉터리인지 확인 할 수 없으니 File 객체로 바꾼 다음 확인한다.
				//toFile?????? //toFile : 앞의 경로를 파일로 객체로 변환
				//디렉터리가 아니고, 파일 이름에 Stream이 포함된 파일명
				return !file.isDirectory() && file.getName().contains("Stream"); //디렉터리가 아니고 파일 이름에 Stream이 들어가는 파일이 있는지 없는지 boolean 타입 반환
			});
			
			sr2.forEach(p -> System.out.println(p.getFileName()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
