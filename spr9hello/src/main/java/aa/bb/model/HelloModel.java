package aa.bb.model;

import java.util.Calendar;
import org.springframework.stereotype.Component;

//@Component("helloModel")
@Component
public class HelloModel {
	public String getGreeting() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if (hour >= 6 && hour <= 10) {
			return "좋은 아침";
		} else if (hour >= 12 && hour <= 15) {
			return "점심은...";
		} else {
			return "안녕";
		}
	}
}