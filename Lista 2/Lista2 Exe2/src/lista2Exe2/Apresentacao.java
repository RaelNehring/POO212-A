package lista2Exe2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class Apresentacao {

	private JFrame frame;
	private JTextField tf_frase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
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
	public Apresentacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite a frase: ");
		lblNewLabel.setBounds(10, 10, 96, 24);
		frame.getContentPane().add(lblNewLabel);
		
		tf_frase = new JTextField();
		tf_frase.setBounds(106, 13, 301, 19);
		frame.getContentPane().add(tf_frase);
		tf_frase.setColumns(10);
		
		JTextArea ta_areaTexto = new JTextArea();
		ta_areaTexto.setEditable(false);
		ta_areaTexto.setBounds(106, 110, 301, 129);
		frame.getContentPane().add(ta_areaTexto);
		
		JButton btn_separar = new JButton("Separar");
		btn_separar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				Frase novaFrase = new Frase();
				novaFrase.setFrase(tf_frase.getText());
				String[] fraseDividida = novaFrase.dividirFrase();
				String palavra;
				for (int i = 0; i < fraseDividida.length; i++) {
					palavra = fraseDividida[i];
					ta_areaTexto.append(palavra + " - " + palavra.length() + "\n");;
				}
			}
		});
		
		btn_separar.setBounds(106, 42, 85, 21);
		frame.getContentPane().add(btn_separar);
	}
}
