package jul17th;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		String pattern = "yyyy-MM-dd HH:mm:ss";
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		Date d=new Date();
		
		String date=simpleDateFormat.format(d);
		
		date=date.replace(":", "-");
		
		System.out.println(date);

	}

}
