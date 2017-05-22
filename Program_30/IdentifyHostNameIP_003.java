/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_30;

/**
 * @author up
 *
 */
import java.net.*;

public class IdentifyHostNameIP_003 {
	public static void main(String[] args){
		for(int i = 0; i < args.length; i++){
			try{
				InetAddress address = InetAddress.getByName(args[i]);
				System.out.print("Host name: " + address.getHostName() + "");
				System.out.println("IP address: " + address.getHostAddress());
			}catch(UnknownHostException ex){
				System.out.println("UnKnown host or IP address " + args[i]);
			}
		}
	}

}
