package day07.quiz;

public class TVTest {

	public static void main(String[] arg) {
//		TV tv = new TV();
//		
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
//		tv.prevChannel();
		
		//선생님 ver
		TV tv1 = new TV();
		
		tv1.getTvInfo();
		tv1.isPowerOnOff();
		tv1.channelUp();
		tv1.moveChannel(20);
		tv1.moveChannel(999);
		tv1.channelDown();

		tv1.prevChannel();
		tv1.prevChannel();
		
		tv1.getTvInfo();
	}

}
