package View;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Config_View {

	private JFrame frmTrinatClockConfiguration;
	private JTextField textField;
	private JTextField textField_hoehe;
	private JTextField textField_X_Cord;
	private JTextField textField_Y_Cord;
	private JButton btnBackgroundColor;

	/**
	 * Launch the application.
	 */
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
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmTrinatClockConfiguration.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblHhe = new JLabel("Höhe");
		GridBagConstraints gbc_lblHhe = new GridBagConstraints();
		gbc_lblHhe.anchor = GridBagConstraints.WEST;
		gbc_lblHhe.insets = new Insets(0, 0, 5, 5);
		gbc_lblHhe.gridx = 1;
		gbc_lblHhe.gridy = 1;
		frmTrinatClockConfiguration.getContentPane().add(lblHhe, gbc_lblHhe);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		frmTrinatClockConfiguration.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblBreite = new JLabel("Breite");
		GridBagConstraints gbc_lblBreite = new GridBagConstraints();
		gbc_lblBreite.anchor = GridBagConstraints.WEST;
		gbc_lblBreite.insets = new Insets(0, 0, 5, 5);
		gbc_lblBreite.gridx = 1;
		gbc_lblBreite.gridy = 3;
		frmTrinatClockConfiguration.getContentPane().add(lblBreite, gbc_lblBreite);
		
		textField_hoehe = new JTextField();
		GridBagConstraints gbc_textField_hoehe = new GridBagConstraints();
		gbc_textField_hoehe.anchor = GridBagConstraints.WEST;
		gbc_textField_hoehe.insets = new Insets(0, 0, 5, 0);
		gbc_textField_hoehe.gridx = 2;
		gbc_textField_hoehe.gridy = 3;
		frmTrinatClockConfiguration.getContentPane().add(textField_hoehe, gbc_textField_hoehe);
		textField_hoehe.setColumns(10);
		
		JLabel lblXkoordinate = new JLabel("X-Koordinate");
		GridBagConstraints gbc_lblXkoordinate = new GridBagConstraints();
		gbc_lblXkoordinate.anchor = GridBagConstraints.WEST;
		gbc_lblXkoordinate.insets = new Insets(0, 0, 5, 5);
		gbc_lblXkoordinate.gridx = 1;
		gbc_lblXkoordinate.gridy = 5;
		frmTrinatClockConfiguration.getContentPane().add(lblXkoordinate, gbc_lblXkoordinate);
		
		textField_X_Cord = new JTextField();
		GridBagConstraints gbc_textField_X_Cord = new GridBagConstraints();
		gbc_textField_X_Cord.anchor = GridBagConstraints.WEST;
		gbc_textField_X_Cord.insets = new Insets(0, 0, 5, 0);
		gbc_textField_X_Cord.gridx = 2;
		gbc_textField_X_Cord.gridy = 5;
		frmTrinatClockConfiguration.getContentPane().add(textField_X_Cord, gbc_textField_X_Cord);
		textField_X_Cord.setColumns(10);
		
		JLabel lblYkoordinate = new JLabel("Y-Koordinate");
		GridBagConstraints gbc_lblYkoordinate = new GridBagConstraints();
		gbc_lblYkoordinate.anchor = GridBagConstraints.WEST;
		gbc_lblYkoordinate.insets = new Insets(0, 0, 5, 5);
		gbc_lblYkoordinate.gridx = 1;
		gbc_lblYkoordinate.gridy = 7;
		frmTrinatClockConfiguration.getContentPane().add(lblYkoordinate, gbc_lblYkoordinate);
		
		textField_Y_Cord = new JTextField();
		GridBagConstraints gbc_textField_Y_Cord = new GridBagConstraints();
		gbc_textField_Y_Cord.insets = new Insets(0, 0, 5, 0);
		gbc_textField_Y_Cord.anchor = GridBagConstraints.WEST;
		gbc_textField_Y_Cord.gridx = 2;
		gbc_textField_Y_Cord.gridy = 7;
		frmTrinatClockConfiguration.getContentPane().add(textField_Y_Cord, gbc_textField_Y_Cord);
		textField_Y_Cord.setColumns(10);
		
		btnBackgroundColor = new JButton("Background Color");
		btnBackgroundColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Color background = JColorChooser.showDialog(frmTrinatClockConfiguration.getRootPane().add(background), "ColorChooser",Color.WHITE);
				
			}
		});
		GridBagConstraints gbc_btnBackgroundColor = new GridBagConstraints();
		gbc_btnBackgroundColor.insets = new Insets(0, 0, 0, 5);
		gbc_btnBackgroundColor.gridx = 1;
		gbc_btnBackgroundColor.gridy = 9;
		frmTrinatClockConfiguration.getContentPane().add(btnBackgroundColor, gbc_btnBackgroundColor);
	}

}
