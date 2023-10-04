package day21.stream;//5 - 선생님 파일과 비교후 수정

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamParallel {

	public static void main(String[] args) {
		//병렬 처리 : 경우에 따라 다름. CPU 코어의 영향을 받음
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<100; i++) {
			list.add(i);
		}
		
		long start = System.nanoTime();
		//stream() 순차적 스트림 처리
		Stream<Integer> a1 = list.stream();
		a1.forEach(a -> {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		long end = System.nanoTime();
		System.out.println("순차 스트림 처리 시간 : "+(end-start)+" nano sec");
		
		start = System.nanoTime();
		//parallelStream() 병렬 스트림 처리
		Stream<Integer> a2 = list.parallelStream();
		a2.forEach(a -> {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}
		});
		
		end = System.nanoTime();
		System.out.println("병렬 처리 여부 : "+a2.isParallel());
		System.out.println("병렬 스트림 처리 시간 : "+(end-start)+" nano sec");
		
	}

}
