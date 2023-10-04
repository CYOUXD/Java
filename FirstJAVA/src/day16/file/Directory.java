package day16.file;//6

import java.io.File;

public class Directory {

	public static void main(String[] args) {
		
		// File 객체는 파일에 대한 정보를 담고 있는 객체(경로, 디렉터리, 부모...)
		
		File dir = new File("E:\\Develop\\Java\\FirstJAVA\\file\\filetest");
		System.out.println("현재 경로에 파일이 존재하니?"+dir.exists()); 	//dir.exists() : 존재 여부 확인
		
		if(dir.exists()) {
			System.out.println("디렉터리 확인");
		}else {
			dir.mkdir();	//디렉터리 생성
			System.out.println("디렉터리 생성");
		}
		
		
	}

}
