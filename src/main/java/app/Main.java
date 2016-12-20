package app;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					props.properties();
					new Timer().start();
					

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
