package View;
import java.awt.Color;
//ghgj
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import app.Timer;

public class View extends JFrame {

	
	private static final long serialVersionUID = 1L;

	private JPanel contentpane;
	public static JLabel time = new JLabel();
	public static boolean clockStop = false;

	/**
	 * Create the application.
	 */
	public View(Rectangle bounds, Font font, Color bgColor, Color ftColor) {
		setTitle("Trinat Clock");
		System.out.println("GUI running");
		setBounds(bounds);
		setTitle("TrinatClock");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				try {
					app.props.storeOptions(getBounds(), getContentPane().getBackground(), getContentPane().getForeground(), 
							getContentPane().getFont().getSize());
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.exit(0);
			}
		});
		// setLocationRelativeTo(null);
		contentpane = new JPanel();
		contentpane.setBounds(10, 11, 375, 239);
		contentpane.setForeground(ftColor);
		contentpane.setBackground(bgColor);
		contentpane.setFont(font);

		setContentPane(contentpane);
		GridBagLayout gbl_contentpane = new GridBagLayout();
		gbl_contentpane.columnWidths = new int[] { 151, 66, 0, 69, 1, 0 };
		gbl_contentpane.rowHeights = new int[] { 25, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentpane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentpane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentpane.setLayout(gbl_contentpane);
		contentpane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		// init startButton with actionlistener
		JButton startButton = new JButton();
		startButton.setVerticalAlignment(SwingConstants.BOTTOM);
		startButton.setHorizontalAlignment(SwingConstants.LEFT);
		startButton.setText("start");
		startButton.setForeground(ftColor);
		startButton.setEnabled(false);
		startButton.addActionListener(e -> {
			startButton.setEnabled(false);
			try {
				new Timer().start();
			}

			catch (Exception f) {
				f.printStackTrace();
			}
			;

		});
		time.setFont(font);
		time.setForeground(ftColor);
		GridBagConstraints gbc_time = new GridBagConstraints();
		gbc_time.gridwidth = 4;
		gbc_time.gridheight = 3;
		gbc_time.insets = new Insets(0, 0, 5, 5);
		gbc_time.anchor = GridBagConstraints.WEST;
		gbc_time.gridx = 1;
		gbc_time.gridy = 4;
		contentpane.add(time, gbc_time);
		GridBagConstraints gbc_startButton = new GridBagConstraints();
		gbc_startButton.anchor = GridBagConstraints.NORTHWEST;
		gbc_startButton.insets = new Insets(0, 0, 0, 5);
		gbc_startButton.gridx = 1;
		gbc_startButton.gridy = 8;
		contentpane.add(startButton, gbc_startButton);

		// init stopButton with actionListener
		JButton stopButton = new JButton();
		stopButton.setVerticalAlignment(SwingConstants.BOTTOM);
		stopButton.setText("stop");
		stopButton.setForeground(ftColor);
		stopButton.setHorizontalAlignment(SwingConstants.RIGHT);
		stopButton.addActionListener(e -> {
			clockStop = true;
			startButton.setEnabled(true);
		});
		GridBagConstraints gbc_stopButton = new GridBagConstraints();
		gbc_stopButton.anchor = GridBagConstraints.NORTHWEST;
		gbc_stopButton.insets = new Insets(0, 0, 0, 5);
		gbc_stopButton.gridx = 3;
		gbc_stopButton.gridy = 8;
		contentpane.add(stopButton, gbc_stopButton);
		setVisible(true);
	}

	public static void aktualisieren(String date) {
		time.setText(date);
	}

}
