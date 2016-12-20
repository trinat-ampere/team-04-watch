package View;
//GUI Klasse
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


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
		contentpane.setLayout(new BorderLayout(0, 0));
		time.setFont(new Font("Tahoma", Font.BOLD, 36));

		contentpane.add(time);
		setContentPane(contentpane); 
		setVisible(true);
	}
	
	public static void aktualisieren(String date) {
		time.setText(date);
	}


	
}
