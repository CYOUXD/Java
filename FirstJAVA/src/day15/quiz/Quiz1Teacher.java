package day15.quiz;

import java.util.HashMap;

public class Quiz1Teacher {

	public static void main(String[] args) {
		String[] first_pa = {"leo", "kiki", "eden"};
		String[] second_pa = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] third_pa = {"mislav", "stanko", "mislav", "ana"};
		String[] first_com = {"kiki", "eden"};
		String[] second_com = {"marina", "josipa", "nikola", "filipa"};
		String[] third_com = {"stanko", "mislav", "ana"};
		
		System.out.println("첫번째 사례 : " + solution(first_pa, first_com));	//leo
		System.out.println("두번째 사례 : " + solution(second_pa, second_com));	//vinko
		System.out.println("세번째 사례 : " + solution(third_pa, third_com));	//mislav
		
		
	}
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		HashMap<String, Integer> hm = new HashMap<>();
		for (String player : participant) hm.put(player, hm.getOrDefault(player, 0)+1);	//동명이인이 있다면 해당 사람은 동명이인의 수만큼 숫자가 올라가고 그중에 단 한명만 완주를 못했다면 1이 남게 된다.
		System.out.println("참가자 처리 결과 : "+hm);
		for (String player : completion) hm.put(player, hm.get(player)-1);	//완주한 사람의 value값을 0으로 만듦. 동명이인 중에 완주를 못한 사람이 있다면 아무리 많아도 한명을 빼지 못하니까 1이 된다.
		System.out.println("완주자 처리 결과 : "+hm);
//		System.out.println(hm);
		
		for(String key : hm.keySet()) {
			if(hm.get(key) !=0) {
				answer = key;
				
			}
		}
		
		return answer;
	}

}
