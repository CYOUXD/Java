package day15.quiz;

import java.util.PriorityQueue;

public class Quiz2_Teacher {

	public static void main(String[] args) {
		
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		System.out.println("음식을 최소 몇 번 섞었을 때 원하는 맵기가 될까?"+solution(scoville, K));
				
	}

	
	public static int solution(int[] scoville, int K) {
		int answer = 0;		//시도 횟수
		
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		
		//scoville 값을 저장 : 음식이 매운 순서
		for(Integer i : scoville) {
			que.add(i);
//			que.add(new Integer(i));   //위와 같다.
		}
		
		while(true) {
			answer++;
			int result = que.poll() +(que.poll()*2);		//첫번째꺼 빼기 + (두번째꺼 빼기*2);  첫번째거 빠진 후 첫번째 꺼를 빼니까 두번째 꺼가 나옴
			//빼서 확인 후 버림. 그래야 그 다음 값을 체크한다.
			que.add(result);
			
			//정해진 맵기 K값을 넘어서는 섞은 음식인 경우
			//기본적으로 내가 원하는 스코빌 지수가 아닐때 이 솔루션이 실행되기 때문에 처음부터 이 if가 실행 될 일이 없다.
			if(que.peek() >= K)
				return answer;
			
			//K이상으로 만들 수 없는 경우 반환 값은 -1
			if(que.size()==1)	//더이상 섞을 음식이 없는 경우
				return -1;
		}	
	}

}
