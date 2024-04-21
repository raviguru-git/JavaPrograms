package CodeSignal;

import java.util.regex.Pattern;

/* 250 - 255 ->   25[0-5]
 * 200 - 249 -->  2[0-4][0-9]
 * 100 - 199 -->  1[0-9] [0-9]
 * 10 - 99 -->   [1-9][0-9]
 * 0 - 9   -->  [0-9]
 * 
 * 172.16.254.1
 * 
 *  */


public class Ipv4AddressCheck {

	public static void main(String[] args) {
		String s1="172.34.5.78";
		// String pattern ="25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9]";
		 String zeroTo255
         = "(\\d{1,2}|(0|1)\\"
           + "d{2}|2[0-4]\\d|25[0-5])";
		 String[] ips =  s1.split("\\."); 
		 
		 Pattern p = Pattern.compile(zeroTo255);
		 if(s1==null)
			// return false;
		 
			 for( String ip : ips) { 
				 if(ip.matches(zeroTo255))
				 System.out.println("true");
			 else {
				 System.out.println("false");
			 }}
	}
	

	
	/*  public static boolean checkip(String s1) { String pattern =
	  "25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9]"; 
	  String[] ips =
	  s1.split("\\."); if(ips.length!=4) return false; 
	  for( String ip : ips) { if
	  (!ip.matches(pattern)) return false; // can't we write like // if
*/	 // (ip.matches(pattern)) return true;
	  
	//  (ip.matches(pattern)) return true; } return true; }
	 


}
	