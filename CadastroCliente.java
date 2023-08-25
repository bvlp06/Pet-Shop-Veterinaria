package PetShopEveterinaria;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField NomeComptxt;
	private JTextField CPFtxt;
	private JTextField idadetxt;
	private JTextField Teltxt;
	private JTextField Endtxt;
	private JTextField Emailtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente frame = new CadastroCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroCliente() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		NomeComptxt = new JTextField();
		NomeComptxt.setBounds(91, 11, 333, 20);
		contentPane.add(NomeComptxt);
		NomeComptxt.setColumns(10);
		
		JLabel lblNomeCompleto = new JLabel("Nome Completo:");
		lblNomeCompleto.setBounds(10, 11, 86, 20);
		contentPane.add(lblNomeCompleto);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 37, 23, 14);
		contentPane.add(lblCpf);
		
		CPFtxt = new JTextField();
		CPFtxt.setBounds(36, 34, 98, 20);
		contentPane.add(CPFtxt);
		CPFtxt.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(138, 37, 46, 14);
		contentPane.add(lblIdade);
		
		idadetxt = new JTextField();
		idadetxt.setBounds(171, 34, 46, 20);
		contentPane.add(idadetxt);
		idadetxt.setColumns(10);
		
		JLabel lblTelcel = new JLabel("Tel/Cel:");
		lblTelcel.setBounds(221, 37, 46, 14);
		contentPane.add(lblTelcel);
		
		Teltxt = new JTextField();
		Teltxt.setBounds(261, 34, 163, 20);
		contentPane.add(Teltxt);
		Teltxt.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(10, 61, 58, 14);
		contentPane.add(lblEndereo);
		
		Endtxt = new JTextField();
		Endtxt.setBounds(63, 58, 361, 20);
		contentPane.add(Endtxt);
		Endtxt.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 85, 46, 14);
		contentPane.add(lblEmail);
		
		Emailtxt = new JTextField();
		Emailtxt.setBounds(45, 82, 222, 20);
		contentPane.add(Emailtxt);
		Emailtxt.setColumns(10);
		
		JButton SalvarCliente = new JButton("Cadastrar Cliente");
		SalvarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = NomeComptxt.getText() ;
				int idade = idadetxt.getCaretPosition();
				String CPF = CPFtxt.getText() ;
				String endereço = Endtxt.getText();
				String telefone = Teltxt.getText();
				String email = Emailtxt.getText();
		Cliente novoCliente = new Cliente ( nome , idade , CPF, endereço, telefone, email );
			}
		});
		SalvarCliente.setBounds(36, 110, 172, 23);
		contentPane.add(SalvarCliente);
		
		JButton CancelarCadastro = new JButton("Cancelar");
		CancelarCadastro.setBounds(261, 110, 89, 23);
		contentPane.add(CancelarCadastro);
		
		
		
	}
}
