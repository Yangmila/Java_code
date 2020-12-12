package experiment33;
import java.text.*;
import java.util.*;

public class Text {
	public static String textCreate() {
		String text ="D";
		Date date=new Date();
		DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
	      text+= df.format(date);
	      text+=System.getProperty("user.name");
		return text;
	}
	public static void main(String [] args) {
		System.out.println(textCreate());
	}
}
