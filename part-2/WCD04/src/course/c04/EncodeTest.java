package course.c04;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodeTest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		//test space
		String encoded1 = URLEncoder.encode(" ", "UTF8");
		System.out.println(encoded1);
		System.out.println(URLDecoder.decode(encoded1, "UTF8"));
		System.out.println("--------------------------------------------");
		//test +
		String encoded2 = URLEncoder.encode("+", "UTF8");
		System.out.println(encoded2);
		System.out.println(URLDecoder.decode(encoded2, "UTF8"));
		System.out.println("--------------------------------------------");
		//test <
		String encoded3 = URLEncoder.encode("<", "UTF8");
		System.out.println(encoded3);
		System.out.println(URLDecoder.decode(encoded3, "UTF8"));
		System.out.println("--------------------------------------------");
		//test 中文測試
		String encoded4 = URLEncoder.encode("中文測試", "UTF8");
		System.out.println(encoded4);
		System.out.println(URLDecoder.decode(encoded4, "UTF8"));		
		//
		
	}
}
