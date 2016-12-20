package app;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import View.View;

public class Timer extends Thread {

	LocalDateTime now;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy hh:mm:ss");

	@Override
	public void run() {
		System.out.println("Timer running");
		while (true) {
			now = LocalDateTime.now();
			ZoneId currentZone = ZoneId.systemDefault();
			
			ZonedDateTime zonedDateTime = ZonedDateTime.of(now, currentZone); 

			View.aktualisieren(formatter.format(zonedDateTime));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
