package InterviewPrgrams;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Rakuten F2F interview.


public class SelnReltd {

	public static void main(String[] args) {
		String s = "RaviG2024.^*&)";

		String letters = "[a-zA-Z]+";
		String digits = "\\d+";
		String spl_char = "\\W+";

		Pattern p = Pattern.compile(letters); // 
		Matcher matcher = p.matcher(s);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}

		p = Pattern.compile(digits);
		matcher = p.matcher(s);
		while(matcher.find())
		{
			System.out.println(matcher.group());
		}
		p = Pattern.compile(spl_char);
		matcher = p.matcher(s);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
      

	}


}
