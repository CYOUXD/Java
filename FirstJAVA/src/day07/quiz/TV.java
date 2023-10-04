package day07.quiz;

public class TV {
	/*
	 * TV 클래스의 멤버변수(각 TV의 상태를 나타내는 변수)
	 * - 채널(channer)
	 * - 이전 채널(prevChannel)
	 * - 볼륨(volume)
	 * - 전원(isPowerOn)		변수에 is라고 쓰면 boolean타입이다.
	 * 
	 * 각 인스턴스(각 객체)마다 다룰 수 있는 값을 클래스의 변수(멤버변수)로 사용한다.
	 * 
	 * TV 클래스의 상수(final)		상수:고정값
	 * - 최대 볼륨(MAX_VOLUME)
	 * - 최소 볼륨(MIN_VOUME)
	 * - 최대 채널(MAX_CHANNEL)
	 * - 최소 채널(MIN_CHANNEL)
	 */
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 300;
	final int MIN_CHANNEL = 1;
	
	/*
	 * 기본 생성자 : 채널7, 볼륨 20을 생성
	 * 
	 * TV 기능
	 * - isPowerOn 값이 true면 false, false면 true로 변경
	 * 
	 * # 다음의 모든 기능은 isPowerOn이 true일 때만 올바르게 동작함.
	 * - volume의 값을 1 증가시킴, 최대 볼륨 100		(volumeUp)
	 * - volume의 값을 1 감소시킴, 최소 볼륨 0		(volumeDown)
	 * - channel의 값을 1증가시킴, 최대채널 300		(channelUp)
	 * - channel의 값을 1감소시킴, 최소채널 1 		(channelDown)
	 * - 채널 번호를 매개변수로 전달받으면 채널을 이동함 	(moveChannel)
	 * - 이전 채널로 돌아감 						(prevChannel)
	 */
	int channel;
	int prevChannel;
	int volume;
	boolean isPowerOn;
	
	public TV() {	//기본생성자 생성자이므로 클래스와 이름이 완전히 같아야 한다.
		this.channel = 7;
		this.volume = 20;
	}
	
	
	
	//티비 켜기
//	public void isPowerOn() {
//		isPowerOn = !isPowerOn;
//		if(isPowerOn == true) {
//			System.out.println("TV가 켜졌습니다.");
//		}else {
//			System.out.println("TV가 꺼져 있습니다.");
//		}
//	}
	
	//선생님 ver
	void isPowerOnOff() {
		isPowerOn = !isPowerOn;
	}
	
	//볼륨 1증가 최대100
//	public void volumeUp() {
//		if(volume>=MAX_VOLUME) {
//			System.out.println("볼륨을 더 키울 수 없습니다.");
//		}else {
//			volume++;
//			System.out.println("볼륨을 키웠습니다. 볼륨 : "+volume);
//		}
//	}
	
	//선생님 ver
	void volumeUp() {
		// if문에 boolean 타입을 확용하여 코드 간결하게 사용
		if(!isPowerOn) {		//기본값이 false이므로 !를 붙여준다
			System.out.println("전원이 꺼져있습니다");
			return;		//리턴을 만나면 메서드를 종료! 반환 타입이 없으므로 그냥 종료한다	이 리턴을 없애려면 하단에 if 밖에 있는 volume++를 else로 묶어주면 된다.
		}else if(volume==MAX_VOLUME) {
			System.out.println("현재 볼륨이 최대 입니다.");
			return;
		}
		
		volume++;
		System.out.println("현재 볼륨은 "+volume+"입니다.");
	}
	
	//볼륨 1감소 최소0
//	public void volumeDown() {
//		if(volume<=MIN_VOLUME) {
//			System.out.println("볼륨을 더 줄일 수 없습니다.");
//		}else {
//			volume--;
//			System.out.println("볼륨을 줄였습니다. 볼륨 : "+volume);
//		}
//	}
	
	//선생님 ver
	void volumeDown() {
		if(!isPowerOn) {		
			System.out.println("전원이 꺼져있습니다");
			return;		
		}else if(volume==MIN_VOLUME) {
			System.out.println("현재 볼륨이 최대 입니다.");
			return;
		}
		
		volume--;
		System.out.println("현재 볼륨은 "+volume+"입니다.");
	}
	
	//채널의 값을 1 증가 최대 300
//	public void channelUp() {
//		if(channel>=MAX_CHANNEL) {
//			System.out.println("다음 채널이 없습니다.");
//		}else {
//			prevChannel = channel;
//			channel++;
//			System.out.println("채널을 올렸습니다. 채널 : "+channel);
//		}
//	}
	
	//선생님 ver
	void channelUp() {
		if(!isPowerOn) {		
			System.out.println("전원이 꺼져있습니다");
			return;		
		}
		
		//이전 채널 저장
		prevChannel = channel;
		
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;	// 300번 채널에서 올라가면 1번 채널이 나오기 때문			
		}else {
			channel++;			
		}
		
		System.out.println(channel+"CH");
	}
	
	//채널의 값을 1 감소 최소 1
//	public void channelDown() {
//		if(channel<=MIN_CHANNEL) {
//			System.out.println("이전 채널이 없습니다.");
//		}else {
//			prevChannel = channel;
//			channel--;
//			System.out.println("채널을 내렸습니다. 채널 : "+channel);
//		}
//	}
	
	//선생님 ver
	void channelDown() {
		if(!isPowerOn) {		
			System.out.println("전원이 꺼져있습니다");
			return;		
		}
		
		//이전 채널 저장
		prevChannel = channel;
		
		if(channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;	// 1번 채널에서 내려가면 300번 채널이 나오기 때문			
		}else {
			channel--;			
		}
		
		System.out.println(channel+"CH");
	}
	
	//채널 번호 입력으로 채널 이동
//	public void moveChannel(int chNum) {
//		if(chNum<MIN_CHANNEL || chNum>MAX_CHANNEL) {
//			System.out.println("해당하는 채널이 없습니다.");
//		}else {
//			prevChannel = channel;
//			channel = chNum;
//			System.out.println(channel+"번 채널로 이동합니다.");			
//		}
//	}
	
	//선생님 ver
	boolean moveChannel(int ch) {	//채널이동을 했는지 확인하기 위해 boolean으로 지정	반환한 boolean값은 이 메서드를 호출한 곳에 반환
		if(!isPowerOn) {		
			System.out.println("전원이 꺼져있습니다");
			return false;		
		}
		if(ch>=MIN_CHANNEL && ch<=MAX_CHANNEL) {
			prevChannel = channel;
			channel = ch;
			System.out.println(ch + "CH");
			return true;	//채널이동 성공
		}else {
			System.out.println("이상한 채널을 입력하셨습니다.");
			return false;	//채널이동 실패
		}
	}
	
	
	//이전 채널로 돌아가기
//	public void prevChannel() {
//		if(prevChannerl>0) {
//			int stop = prevChannel;
//			System.out.println("이전 채널인 "+prevChannel+"번 채널로 이동합니다.");			
//			prevChannel=channel;
//			channel = stop;
//		}else {
//			System.out.println("이전 채널이 없습니다.");
//		}		
//	}
	
	//선생님 ver
	void prevChannel() {
		//channel = prevChannel;
		//prevChannel = channel
		if(!isPowerOn) {		
			System.out.println("전원이 꺼져있습니다");
			return;		
		}else if(prevChannel==0) {
			System.out.println("이전 채널 없음");
			return;
		}
		int temp = channel;
		channel = prevChannel;
		prevChannel = temp;
		
		getTvInfo();
	}
	
	void getTvInfo() {
		System.out.println("전원 : "+isPowerOn);
		System.out.println("채널 : "+channel);
		System.out.println("볼륨 : "+volume);
		System.out.println("저장된 이전채널 : "+prevChannel);
	}
	
//	public static void main(String[] arg) {
//		TV tv = new TV();
//		tv.isPowerOn();		
//		tv.isPowerOn();	
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.volumeDown();
//		tv.volumeDown();
//		tv.volumeUp();
//		tv.channelUp();
//		tv.moveChannel(300);
//		tv.prevChannel();
//		tv.prevChannel();
//		tv.prevChannel();
//	}
}
