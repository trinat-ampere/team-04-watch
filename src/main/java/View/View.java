package View;
//GUI Klasse
import java.awt.BorderLayout;
import java.awt.ComponentOrientation;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.Timer;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;


public class View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	/**
	 * 
	 */
	private JPanel contentpane ;
	public static JLabel time = new JLabel();
	public static boolean clockStop = false;
	
	

	

	/**
	 * Create the application.
	 */
	public View(Rectangle bounds) {
		setTitle("Trinat Clock");
		System.out.println("GUI running");
		setBounds(bounds);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				try {
					app.props.storeOptions(getBounds());
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.exit(0);
			}
		});
	//	setLocationRelativeTo(null);
		contentpane =  new JPanel();
		contentpane.setBounds(10, 11, 375, 239);
		time.setFont(new Font("Tahoma", Font.BOLD, 36));

		
		setContentPane(contentpane);
		
		FlowLayout layout = new FlowLayout();
		contentpane.setLayout(layout);
	//init startButton with actionlistener
		JButton startButton = new JButton();
		startButton.setVerticalAlignment(SwingConstants.BOTTOM);
		startButton.setHorizontalAlignment(SwingConstants.LEFT);
		startButton.setText("start");
		startButton.addActionListener(e -> {
			try{
				new Timer().start();
			}
			catch(Exception f){
				f.printStackTrace();
			};
		});
		
		
		
		
		
	//init stopButton with actionListener
		JButton stopButton = new JButton();
		stopButton.setVerticalAlignment(SwingConstants.BOTTOM);
		stopButton.setText("stop");
		stopButton.setHorizontalAlignment(SwingConstants.RIGHT);
		stopButton.addActionListener(e -> {
			clockStop = true;
			
		});
		contentpane.add(stopButton);
		contentpane.add(startButton);
		contentpane.add(time);
		contentpane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setVisible(true);
	}
	
	public static void aktualisieren(String date) {
		time.setText(date);
	}


	
}
