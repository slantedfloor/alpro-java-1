package pekan8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class KuisAlpro2 {

	private JFrame frame;
	private JTextField textFieldNama;
	private JTextField textFieldUmur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KuisAlpro2 window = new KuisAlpro2();
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
	public KuisAlpro2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(209, 220, 233));
		frame.getContentPane().setBackground(new Color(232, 237, 244));
		frame.setBounds(100, 100, 463, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNama = new JLabel("Nama");
		lblNama.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNama.setBounds(62, 62, 46, 14);
		frame.getContentPane().add(lblNama);
		
		JLabel lblUmur = new JLabel("Umur");
		lblUmur.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUmur.setBounds(62, 87, 46, 14);
		frame.getContentPane().add(lblUmur);
		
		JLabel lblSIM = new JLabel("SIM C");
		lblSIM.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSIM.setBounds(62, 112, 46, 14);
		frame.getContentPane().add(lblSIM);
		
		JTextArea TextAreaHasil = new JTextArea("");
		TextAreaHasil.setBackground(new Color(232, 237, 244));
		TextAreaHasil.setForeground(new Color(209, 220, 233));
		TextAreaHasil.setBounds(61, 192, 335, 93);
		TextAreaHasil.setLineWrap(true);
		TextAreaHasil.setWrapStyleWord(true);
		TextAreaHasil.setEditable(false);
		frame.getContentPane().add(TextAreaHasil);
		
		textFieldNama = new JTextField();
		textFieldNama.setBounds(141, 59, 191, 20);
		frame.getContentPane().add(textFieldNama);
		textFieldNama.setColumns(10);
		
		textFieldUmur = new JTextField();
		textFieldUmur.setBounds(141, 84, 191, 20);
		frame.getContentPane().add(textFieldUmur);
		textFieldUmur.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"PIlih", "Ada", "Tidak Ada"}));
		comboBox.setBounds(141, 108, 191, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNama.setText("");
				textFieldUmur.setText("");
				TextAreaHasil.setText("");
				comboBox.setSelectedIndex(0);
			}
		});
		btnReset.setBounds(243, 158, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnProses = new JButton("Proses");
		btnProses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nama = textFieldNama.getText();
				int umur = Integer.parseInt(textFieldUmur.getText());
				boolean adaSIM = comboBox.getSelectedItem() != null;
				if (umur < 18 && !adaSIM) {
					TextAreaHasil.setText(nama +", " + "Anda belum cukup umur untuk mengendarai motor");
				} else if (umur >= 18 && !adaSIM) {
					TextAreaHasil.setText(nama +", " + "Anda tidak diperkenankan mengendarai motor karena tidak mempunyai SIM");
				} else if (umur < 18 && adaSIM) {
					TextAreaHasil.setText(nama +", " + "Anda belum cukup umur untuk mendapatkan SIM sehingga tidak diperkenankan mengendarai motor");
				} else if (umur >= 18 && adaSIM) {
					TextAreaHasil.setText(nama +", " + "Anda sudah boleh mengendarai motor");
				}
			}
	
		}); {
		btnProses.setBounds(105, 158, 89, 23);
		frame.getContentPane().add(btnProses);	
	
	}
}
}
