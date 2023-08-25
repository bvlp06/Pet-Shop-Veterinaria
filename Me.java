package PetShopEveterinaria;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Color;

public class Me extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		BancoDeDados bancoDeDados = new BancoDeDados();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Me frame = new Me();
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
	public Me() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botaoCadastrarCliente = new JButton("Cadastrar Cliente");
		botaoCadastrarCliente.setForeground(Color.BLUE);
		botaoCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					CadastroCliente frame = new CadastroCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				//bancoDeDados.AddCliente
			}
		});
		botaoCadastrarCliente.setBounds(29, 92, 117, 23);
		contentPane.add(botaoCadastrarCliente);
		
		JButton botaoCadastrarAnimal = new JButton("Cadastrar Animal");
		botaoCadastrarAnimal.setForeground(new Color(139, 0, 139));
		botaoCadastrarAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoCadastrarAnimal.setBounds(280, 92, 115, 23);
		contentPane.add(botaoCadastrarAnimal);
		
		JButton btnRegistrarAtendimento = new JButton("Registrar Atendimento");
		btnRegistrarAtendimento.setForeground(new Color(34, 139, 34));
		btnRegistrarAtendimento.setBounds(130, 154, 174, 23);
		contentPane.add(btnRegistrarAtendimento);
		
		JButton btnContaDoCliente = new JButton("Conta do Cliente");
		btnContaDoCliente.setForeground(new Color(178, 34, 34));
		btnContaDoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnContaDoCliente.setBounds(130, 206, 174, 23);
		contentPane.add(btnContaDoCliente);
	}

}


