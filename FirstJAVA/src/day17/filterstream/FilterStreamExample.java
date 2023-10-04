package day17.filterstream;//1

import java.io.*;	//하나씩 임포트하지 않아도 됨. 전체 불러와서 사용

public class FilterStreamExample {

	public static void main(String[] args) {
		FileReader input = null;
		FileWriter output = null;
		BufferedReader bufInput = null;
		BufferedWriter bufOutput = null;	//bufOutput.close()될 때 까지 파일이 생성되지 않는다.
		
		try {
			String inFile = "E:\\Develop\\Java\\FirstJAVA\\file\\OutputStream.txt";
			String outFile = "E:\\Develop\\Java\\FirstJAVA\\file\\OutputStream_out.txt";
			
			//필터 스트림은 대상이 노드 스트림을 대상으로 한다
			//노드 스트림
			input = new FileReader(inFile);
			output = new FileWriter(outFile);
			//필터 스트림 : 노드 스트림보다 강화된 기능 제공
			bufInput = new BufferedReader(input);
			bufOutput = new BufferedWriter(output);
			
			String line;
			line = bufInput.readLine();	//readLine() : 문자열에서 \n을 만날 때까지 입력. 입력 받을 것이 없으면 null반환
			System.out.println(line);
			while(line != null) {	
				bufOutput.write(line, 0, line.length());	//line 복사
				bufOutput.newLine();//줄바꿈 \n을 입력한 것과 같다
				line = bufInput.readLine();	
			}
			System.out.println(inFile + ">>" + outFile);	//inFile에 해당하는 내용을 outFile에 복사한다
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bufInput != null)	//bufInput이 null이 아니라면 bufInput을 닫는다. + 예외 처리
				try {bufInput.close();} catch (Exception e) {e.printStackTrace();}
			if(bufOutput != null)	//bufOutput이 null이 아니라면 bufOutput을 닫는다. + 예외 처리
				try {bufOutput.close();} catch (Exception e) {e.printStackTrace();}
			
		}
	}

}
