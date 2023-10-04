package Homework.quiz07_1;

public class main {

	public static void main(String[] args) {
		ArrayPrint ap = new ArrayPrint();
		String[] sArr = {"감자", "고구마", "당근"};
		int[] iArr = {1, 2, 3, 4, 5};
		char[] cArr = {'가', '나'};
		
		ap.printArray(sArr);
		ap.printArray(iArr);
		ap.printArray(cArr);

	}

}
