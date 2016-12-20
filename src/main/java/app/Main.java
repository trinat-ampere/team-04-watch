package app;

import java.awt.EventQueue;

import View.Config_View;
public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Config_View window = new Config_View();
					window.frmTrinatClockConfiguration.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}