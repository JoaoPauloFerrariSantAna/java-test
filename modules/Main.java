import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
	public static String formatDate(Date date) {
		String format = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format);


		return sdf.format(date);
	}

	public static void main(String[] args) {
		Date date = new Date(); 
		String formatedDate = formatDate(date);
		Car car = new Car("Gol", formatedDate, 4, 4);
	}
}
