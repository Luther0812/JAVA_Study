/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_08;

/**
 * @author up
 *
 */
public class TestTV_004 {
	public static void main(String[] args){
		TV_003 tv1 = new TV_003();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		TV_003 tv2 = new TV_003();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		
		System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
		System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
	}

}
