package app;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		createFrame();
	}


	
	
	//create new clock frame
	private void createFrame() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add time thread to the view
		Time time = new Time();
		time.start();
		
		//init contentPane
		Container contentPane = frame.getContentPane();
		
		//init startButton with actionlistener
		JButton startButton = new JButton();
		startButton.addActionListener(e -> {
			time.start(); 
		});
		
		
		
		
		//init stopButton with actionListener
		JButton stopButton = new JButton();
		startButton.addActionListener(e -> {
			time.yield(); 
		});
		
		
		
		
	}

}
