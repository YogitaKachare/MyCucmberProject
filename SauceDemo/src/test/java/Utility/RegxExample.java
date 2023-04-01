package Utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxExample {
	public static void main(String[] args) {
        String s = "bookname=cooking&bookid=123456&bookprice=123.45";
        Pattern p = Pattern.compile("(?<=bookprice=)\\d.+");
        Matcher m = p.matcher(s);
        if (m.find()) {
            System.out.println(m.group());
        }
    }
}
