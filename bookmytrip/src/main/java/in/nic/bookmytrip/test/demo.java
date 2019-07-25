/**
 * 
 */
package in.nic.bookmytrip.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Shiva
 * Created On 24-Jul-2019
 *
 */
public class demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String time = "22:30:00";
		System.out.println(DateTimeFormatter.ofPattern("hh:mm a").format(LocalTime.parse(time)));

	}

}
