package View;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;

import app.Timer;
import app.props;

import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Config_View {

	public JFrame frmTrinatClockConfiguration;
	private JButton btnBackgroundColor;
	private JButton btnTextColor;
	private JButton btnSpeichern;
	private JLabel lblHhe;
	private JTextField textField_hoehe;
	private JLabel lblBreite;
	private JTextField textField_breite;
	private JLabel lblXkoordinate;
	private JTextField textField_x_Cord;
	private JLabel lblYkoordinate;
	private JTextField textField_y_Cord;
	private JLabel lblSchriftgrsse;
	private JTextField textField_size;
	private Color background;
	private Color text;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Config_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTrinatClockConfiguration = new JFrame();
		frmTrinatClockConfiguration.setTitle("Trinat Clock Configuration");
		frmTrinatClockConfiguration.setBounds(100, 100, 443, 500);
		frmTrinatClockConfiguration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0, 0, 0, 6};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmTrinatClockConfiguration.getContentPane().setLayout(gridBagLayout);
		
		lblHhe = new JLabel("Höhe");
		GridBagConstraints gbc_lblHhe = new GridBagConstraints();
		gbc_lblHhe.anchor = GridBagConstraints.EAST;
		gbc_lblHhe.insets = new Insets(0, 0, 5, 5);
		gbc_lblHhe.gridx = 1;
		gbc_lblHhe.gridy = 1;
		frmTrinatClockConfiguration.getContentPane().add(lblHhe, gbc_lblHhe);
		
		textField_hoehe = new JTextField();
		GridBagConstraints gbc_textField_hoehe = new GridBagConstraints();
		gbc_textField_hoehe.anchor = GridBagConstraints.WEST;
		gbc_textField_hoehe.insets = new Insets(0, 0, 5, 0);
		gbc_textField_hoehe.gridx = 2;
		gbc_textField_hoehe.gridy = 1;
		frmTrinatClockConfiguration.getContentPane().add(textField_hoehe, gbc_textField_hoehe);
		textField_hoehe.setColumns(10);
		
		lblBreite = new JLabel("Breite");
		GridBagConstraints gbc_lblBreite = new GridBagConstraints();
		gbc_lblBreite.anchor = GridBagConstraints.EAST;
		gbc_lblBreite.insets = new Insets(0, 0, 5, 5);
		gbc_lblBreite.gridx = 1;
		gbc_lblBreite.gridy = 3;
		frmTrinatClockConfiguration.getContentPane().add(lblBreite, gbc_lblBreite);
		
		textField_breite = new JTextField();
		GridBagConstraints gbc_textField_breite = new GridBagConstraints();
		gbc_textField_breite.anchor = GridBagConstraints.WEST;
		gbc_textField_breite.insets = new Insets(0, 0, 5, 0);
		gbc_textField_breite.gridx = 2;
		gbc_textField_breite.gridy = 3;
		frmTrinatClockConfiguration.getContentPane().add(textField_breite, gbc_textField_breite);
		textField_breite.setColumns(10);
		
		lblXkoordinate = new JLabel("X-Koordinate");
		GridBagConstraints gbc_lblXkoordinate = new GridBagConstraints();
		gbc_lblXkoordinate.anchor = GridBagConstraints.EAST;
		gbc_lblXkoordinate.insets = new Insets(0, 0, 5, 5);
		gbc_lblXkoordinate.gridx = 1;
		gbc_lblXkoordinate.gridy = 5;
		frmTrinatClockConfiguration.getContentPane().add(lblXkoordinate, gbc_lblXkoordinate);
		
		textField_x_Cord = new JTextField();
		GridBagConstraints gbc_textField_x_Cord = new GridBagConstraints();
		gbc_textField_x_Cord.anchor = GridBagConstraints.WEST;
		gbc_textField_x_Cord.insets = new Insets(0, 0, 5, 0);
		gbc_textField_x_Cord.gridx = 2;
		gbc_textField_x_Cord.gridy = 5;
		frmTrinatClockConfiguration.getContentPane().add(textField_x_Cord, gbc_textField_x_Cord);
		textField_x_Cord.setColumns(10);
		
		lblYkoordinate = new JLabel("Y-Koordinate");
		GridBagConstraints gbc_lblYkoordinate = new GridBagConstraints();
		gbc_lblYkoordinate.anchor = GridBagConstraints.EAST;
		gbc_lblYkoordinate.insets = new Insets(0, 0, 5, 5);
		gbc_lblYkoordinate.gridx = 1;
		gbc_lblYkoordinate.gridy = 7;
		frmTrinatClockConfiguration.getContentPane().add(lblYkoordinate, gbc_lblYkoordinate);
		
		textField_y_Cord = new JTextField();
		GridBagConstraints gbc_textField_y_Cord = new GridBagConstraints();
		gbc_textField_y_Cord.anchor = GridBagConstraints.WEST;
		gbc_textField_y_Cord.insets = new Insets(0, 0, 5, 0);
		gbc_textField_y_Cord.gridx = 2;
		gbc_textField_y_Cord.gridy = 7;
		frmTrinatClockConfiguration.getContentPane().add(textField_y_Cord, gbc_textField_y_Cord);
		textField_y_Cord.setColumns(10);
		
		btnSpeichern = new JButton("Speichern");
		btnSpeichern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hoehe = Integer.parseInt(textField_hoehe.getText());
				int breite = Integer.parseInt(textField_breite.getText());
				int x_Cord = Integer.parseInt(textField_x_Cord.getText());
				int y_Cord = Integer.parseInt(textField_y_Cord.getText());
				int size = Integer.parseInt(textField_size.getText());
				Rectangle r = new Rectangle(x_Cord, y_Cord, breite, hoehe); 
				try {
					props.storeOptions(r,background,text,size);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
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
		});
		
		btnTextColor = new JButton("Text Color");
		btnTextColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = JColorChooser.showDialog(new JColorChooser(), "ColorChooser",Color.WHITE);
			}
		});
		
	
		
		btnBackgroundColor = new JButton("Background Color");
		btnBackgroundColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				background = JColorChooser.showDialog(new JColorChooser(), "ColorChooser",Color.WHITE);
			}
		});
		
		lblSchriftgrsse = new JLabel("Schriftgrösse");
		GridBagConstraints gbc_lblSchriftgrsse = new GridBagConstraints();
		gbc_lblSchriftgrsse.anchor = GridBagConstraints.EAST;
		gbc_lblSchriftgrsse.insets = new Insets(0, 0, 5, 5);
		gbc_lblSchriftgrsse.gridx = 1;
		gbc_lblSchriftgrsse.gridy = 9;
		frmTrinatClockConfiguration.getContentPane().add(lblSchriftgrsse, gbc_lblSchriftgrsse);
		
		textField_size = new JTextField();
		GridBagConstraints gbc_textField_size = new GridBagConstraints();
		gbc_textField_size.anchor = GridBagConstraints.WEST;
		gbc_textField_size.insets = new Insets(0, 0, 5, 0);
		gbc_textField_size.gridx = 2;
		gbc_textField_size.gridy = 9;
		frmTrinatClockConfiguration.getContentPane().add(textField_size, gbc_textField_size);
		textField_size.setColumns(10);
		GridBagConstraints gbc_btnBackgroundColor = new GridBagConstraints();
		gbc_btnBackgroundColor.anchor = GridBagConstraints.WEST;
		gbc_btnBackgroundColor.insets = new Insets(0, 0, 5, 5);
		gbc_btnBackgroundColor.gridx = 1;
		gbc_btnBackgroundColor.gridy = 11;
		frmTrinatClockConfiguration.getContentPane().add(btnBackgroundColor, gbc_btnBackgroundColor);
		GridBagConstraints gbc_btnTextColor = new GridBagConstraints();
		gbc_btnTextColor.anchor = GridBagConstraints.WEST;
		gbc_btnTextColor.insets = new Insets(0, 0, 5, 5);
		gbc_btnTextColor.gridx = 1;
		gbc_btnTextColor.gridy = 12;
		frmTrinatClockConfiguration.getContentPane().add(btnTextColor, gbc_btnTextColor);
		GridBagConstraints gbc_btnSpeichern = new GridBagConstraints();
		gbc_btnSpeichern.gridx = 2;
		gbc_btnSpeichern.gridy = 13;
		frmTrinatClockConfiguration.getContentPane().add(btnSpeichern, gbc_btnSpeichern);
	}

}
