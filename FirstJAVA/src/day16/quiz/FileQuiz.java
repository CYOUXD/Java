package day16.quiz;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class FileQuiz {

	public static void main(String[] args) {
//		File f = new File("D:\\filetest4\\서시.txt");
//		
//		System.out.println("서시는 디렉터리 인가요? : "+f.isDirectory());
//		System.out.println("서시는 파일 인가요? : "+f.isFile());
//		
//		File makeD = new File("D:\\filetest5\\testFile\\temp");
//		if(!makeD.exists()) {
//			System.out.println("디렉터리가 없습니다. 새로 만듭니다.");
//			makeD.mkdirs();
//		}else {
//			System.out.println("디렉터리가 이미 있습니다.");
//		}
//		
//		//최종적으로 이동이 완성 될 경로를 미리 만들어 놓고 그 경로로 이동하게 한다.
//		File change = new File("D:\\filetest5\\testFile\\temp\\서시.txt");
//		f.renameTo(change);
		
		
		
		//선생님 ver
		File file = new File("D:\\filetest4\\서시.txt");
		File dir = new File("D:\\filetest5\\testFile\\temp");
		File dstFile = null;
		
		System.out.println("서시.txt는 파일인가요? "+file.isFile());
		System.out.println("dir이 존재하나요? "+dir.exists());
		if(dir.exists()) {
			dstFile = new File(dir.getPath()+"\\"+file.getName());
			file.renameTo(dstFile);
		}else {
			System.out.println("디렉터리가 존재하지 않습니다.");
			dir.mkdirs();
			System.out.println("디렉터리를 생성합니다.");
			dstFile = new File(dir.getPath()+file.getName());	//만든 디렉터리로 서시 파일 이동
			file.renameTo(dstFile);
		}
//		System.out.println(dstFile);
		
		//서시 파일 내용 출력
		Reader rFile = null;
		try {
			rFile = new FileReader(dstFile);
			while(true) {
				int data = rFile.read();
				System.out.print((char)data);
				if (data == -1)
					break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rFile.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
