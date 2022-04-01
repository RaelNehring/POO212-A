import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField tf_nome;
	private JTextField tf_cpf;
	private JTextField tf_uf;
	private JTextField tf_renda;
	private JTextField tfvalorconsulta;
	private Contribuinte[] listaContribuintes = new Contribuinte[100];
	private int indice = 0;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome do contribuinte:");
		lblNewLabel.setBounds(10, 10, 135, 13);
		frame.getContentPane().add(lblNewLabel);

		tf_nome = new JTextField();
		tf_nome.setBounds(152, 7, 176, 19);
		frame.getContentPane().add(tf_nome);
		tf_nome.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(10, 33, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);

		tf_cpf = new JTextField();
		tf_cpf.setBounds(152, 30, 96, 19);
		frame.getContentPane().add(tf_cpf);
		tf_cpf.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("UF:");
		lblNewLabel_2.setBounds(10, 56, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);

		tf_uf = new JTextField();
		tf_uf.setBounds(152, 53, 51, 19);
		frame.getContentPane().add(tf_uf);
		tf_uf.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Renda anual:");
		lblNewLabel_3.setBounds(10, 79, 74, 13);
		frame.getContentPane().add(lblNewLabel_3);

		tf_renda = new JTextField();
		tf_renda.setBounds(152, 76, 96, 19);
		frame.getContentPane().add(tf_renda);
		tf_renda.setColumns(10);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contribuinte c = new Contribuinte(tf_nome.getText(), tf_cpf.getText(), tf_uf.getText(),Double.parseDouble(tf_renda.getText()));

				double imposto = c.calcularImposto();

				JOptionPane.showMessageDialog(frame, "Imposto a pagar = " + imposto);
				listaContribuintes[indice] = c;
				indice++;
			}
		});
		btnNewButton.setBounds(341, 79, 85, 21);
		frame.getContentPane().add(btnNewButton);
		JLabel lblNewLabel_4 = new JLabel("Valor a consultar R$");
		lblNewLabel_4.setBounds(10, 169, 135, 19);
		frame.getContentPane().add(lblNewLabel_4);
		tfvalorconsulta = new JTextField();
		tfvalorconsulta.setBounds(152, 169, 96, 19);
		frame.getContentPane().add(tfvalorconsulta);
		tfvalorconsulta.setColumns(10);
		JButton btn_consultar = new JButton("Consultar");
		btn_consultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valorConsulta = Double.parseDouble(tfvalorconsulta.getText());
				Contribuinte c;
				for (int i = 0; i < indice; i++) {
					c = listaContribuintes[i];
					if (c.calcularImposto() > valorConsulta) {
						String msg = "Contribuinte: " + c.getNome()
										+ "\nCPF: " + c.getCpf()
										+ "\nRenda: R$ " + c.getRendaAnual()
										+ "\nImposto: R$ " + c.calcularImposto();
						JOptionPane.showMessageDialog(null, msg);
					}
				}
			}
		});
		btn_consultar.setBounds(10, 232, 96, 21);
		frame.getContentPane().add(btn_consultar);
	}
}