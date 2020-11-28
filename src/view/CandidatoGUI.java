package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;


public class CandidatoGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCpf;
	private JLabel lblNome;
	private JLabel lblCpf;
	private JLabel lblCargo;
	private JButton btnEnviar;
	private JButton btnLimpar;
	private ButtonGroup bg;
	private JRadioButton rdbtn1;
	private JRadioButton rdbtn2;
	private JRadioButton rdbtn3;
	
	public CandidatoGUI() {
		Handler ouvinte = new Handler();
		setTitle("CONCURSO - INSCRIÇÃO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInscricaoDeCandidato = new JLabel("INSCRICAO DE CANDIDATO");
		lblInscricaoDeCandidato.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInscricaoDeCandidato.setBounds(52, 16, 315, 21);
		contentPane.add(lblInscricaoDeCandidato);

		lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNome.setBounds(52, 58, 70, 21);
		contentPane.add(lblNome);
	
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(52, 95, 315, 30);
		contentPane.add(textNome);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCpf.setBounds(52, 141, 70, 21);
		contentPane.add(lblCpf);		
		
		textCpf = new JTextField();
		textCpf.setBounds(52, 178, 315, 30);
		contentPane.add(textCpf);
		textCpf.setColumns(10);			
		
		lblCargo = new JLabel("CARGO");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCargo.setBounds(52, 224, 115, 21);
		contentPane.add(lblCargo);
		
		bg = new ButtonGroup();    
		
		rdbtn1 = new JRadioButton("Professor Ensino Fundamental", true);
		rdbtn1.setBounds(52, 257, 315, 29);
		contentPane.add(rdbtn1);
		bg.add(rdbtn1);
		rdbtn1.addActionListener(ouvinte);
		
		rdbtn2 = new JRadioButton("Professor Ensino M\u00E9dio");
		rdbtn2.setBounds(52, 284, 322, 29);
		contentPane.add(rdbtn2);
		bg.add(rdbtn2);
		rdbtn2.addActionListener(ouvinte);
		
		rdbtn3 = new JRadioButton("Professor Ensino Superior");
		rdbtn3.setBounds(52, 311, 315, 29);
		contentPane.add(rdbtn3);
		bg.add(rdbtn3);
		rdbtn3.addActionListener(ouvinte);
			
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setBounds(311, 365, 104, 36);
		contentPane.add(btnEnviar);
		btnEnviar.addActionListener(ouvinte);
		
		btnLimpar = new JButton("LIMPAR");					
		btnLimpar.setBounds(192, 365, 104, 36);
		contentPane.add(btnLimpar);
		btnLimpar.addActionListener(ouvinte);
		
		setVisible(true);
	}

		public void limpar() {
			textNome.setText("");
			textCpf.setText("");			
		 	rdbtn1.setSelected(true);		}
		
		public class Handler implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnLimpar) {
					limpar();
				}
				else {
					if(e.getSource()==btnEnviar) {
						
						String nome = textNome.getText();						
						String cpf = textCpf.getText();
						String cargo = null;
						
						if(rdbtn1.isSelected()) {
							cargo = rdbtn1.getText();
						}else if(rdbtn2.isSelected()) {
							cargo = rdbtn2.getText();
						}else if(rdbtn3.isSelected()) {
							cargo = rdbtn3.getText();
						}
						
						if((nome.equals(""))||(cpf.equals(""))) {
							JOptionPane.showMessageDialog(null, "Favor preencher todos os campos!", "ATENÇÃO!!", 2, null);
						}
						else {
								JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!", "SUCESSO!!", 1, null);
								limpar();

						}
					}
				}
				
			}
			
		}
}
