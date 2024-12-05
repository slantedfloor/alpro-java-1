package pekan3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frame.setBounds(100, 100, 450, 335);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNama = new JLabel("Nama");
		lblNama.setBounds(62, 62, 46, 14);
		frame.getContentPane().add(lblNama);
		
		JLabel lblUmur = new JLabel("Umur");
		lblUmur.setBounds(62, 87, 46, 14);
		frame.getContentPane().add(lblUmur);
		
		JLabel lblSIM = new JLabel("SIM C");
		lblSIM.setBounds(62, 112, 46, 14);
		frame.getContentPane().add(lblSIM);
		
		JLabel lblHasil = new JLabel("New label");
		lblHasil.setBounds(62, 204, 307, 50);
		frame.getContentPane().add(lblHasil);
		
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
		btnReset.setBounds(243, 158, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnProses = new JButton("Proses");
		btnProses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nama = textFieldNama.getText();
				int umur = Integer.parseInt(textFieldUmur.getText());
				boolean adaSIM = comboBox.getSelectedItem() != null;
				if (umur < 18) {
					lblHasil.setText(nama + "Belum cukup umur untuk mengendarai");
				} else if (umur > 18 && !adaSIM) {
					lblHasil.setText(nama + "Tidak diperkenankan mengendarai karena tidak ada SIM");
				} else if (umur > 18 && adaSIM) {
					lblHasil.setText(nama + "Anda Sudah boleh mengendarai motor");
				}
			}
		});
		btnProses.setBounds(105, 158, 89, 23);
		frame.getContentPane().add(btnProses);
		
		
	}
}
