package app;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.ZoneId;
import java.util.Date;

public class Time extends Thread {

	public static void main(String[] args) {
		new Time().start();
	}
	
	@Override
	public void run() {
		Clock clock = Clock.system(ZoneId.systemDefault());
		//System.out.println(clock);
		while(true) {
			//System.out.println(clock.instant());
			long timeMS = System.currentTimeMillis();
			System.out.println(timeMS);
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			Date resultdate = new Date(timeMS);
			String dateString = sdf.format(resultdate);
			System.out.println(dateString);
		try {
			Thread.sleep(997);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}

	

}
