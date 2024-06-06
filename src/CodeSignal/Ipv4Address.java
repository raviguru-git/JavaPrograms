package CodeSignal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ipv4Address {

	public static void main(String[] args) {
		
		boolean res = iPCheck("172.16.7.1");
		System.out.println(res);
		
	}
	

	public static boolean iPCheck(String ip)
	{
		//String ZeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
		                   //"(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
		String regex = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$";
		
		//String ZeroTo255 ="25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9]";
		
		//String regex	= ZeroTo255+"\\."+ZeroTo255+"\\."+ZeroTo255+"\\."+ZeroTo255;  
		//System.out.println(regex);
		
		//Compile the regex:
		Pattern p = Pattern.compile(regex);
		if(ip == null) return false;
		 Matcher m = p.matcher(ip);
		 // returns boolean value if its matching here.
		 return m.matches();
		
	}
	
	
}
