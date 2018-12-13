import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class TelaEmpregado extends JFrame implements ActionListener{
	private JLabel lblNumRegistro, lblNomeEmpregado, lblRgEmpregado, lblCpfEmpregado, lblDataAdmisao,lblCargoEmpregado;
	private JTextField txtNumRegistro, txtNomeEmpregado, txtRgEmpregado,txtCpfEmpregado,txtDataAdmisao,txtCargoEmpregado;
	private JButton btnInsere, btnLimpa, btnSai;
	private JPanel pnlOeste, pnlLeste, pnlSul;
	private Connection conn;
	
	public TelaEmpregado(Connection conn) {
		super ("empregadosCadastro ");
		
		this.conn = conn;
		
		lblNumRegistro = new JLabel("Numero de Registro");
		lblNomeEmpregado= new JLabel("Nome do Empregado");
		lblRgEmpregado= new JLabel("Rg do Empregado");
		lblCpfEmpregado = new JLabel("Cpf do Empregado");
		lblDataAdmisao = new JLabel("Data de Admisao do Empregado");
		lblCargoEmpregado = new JLabel("Data de Admisao do Empregado");
		
		
		txtNumRegistro = new JTextField(8);
		txtNomeEmpregado= new JTextField(15);
		txtRgEmpregado = new JTextField(10);
		txtCpfEmpregado = new JTextField(10);
		txtDataAdmisao = new JTextField(8);
		txtDataAdmisao = new JTextField(8);
		txtCargoEmpregado = new JTextField(8);
	
		
		btnInsere = new JButton("Inserir");
		btnLimpa = new JButton("Limpar");
		btnSai = new JButton("Sair");
		
		
		
		pnlOeste = new JPanel();
		pnlOeste.setLayout(new GridLayout(3, 1));
		pnlOeste.add(lblNumRegistro);
		pnlOeste.add(lblNomeEmpregado);
		pnlOeste.add(lblRgEmpregado);
		pnlOeste.add(lblCpfEmpregado);
		pnlOeste.add(lblDataAdmisao);
		pnlOeste.add(lblCargoEmpregado);
		
		pnlLeste = new JPanel();
		pnlLeste.setLayout(new GridLayout(3, 1));
		pnlLeste.add(txtNumRegistro);
		pnlLeste.add(txtNomeEmpregado);
		pnlLeste.add(txtRgEmpregado);
		pnlLeste.add(txtCpfEmpregado);
		pnlLeste.add(txtDataAdmisao);
		pnlLeste.add(txtCargoEmpregado);
		
		pnlSul = new JPanel();
		pnlSul.setLayout(new FlowLayout());
		pnlSul.add(btnInsere);
		pnlSul.add(btnLimpa);
		pnlSul.add(btnSai);
		
		
		
		
		Container caixa = getContentPane();
		caixa.setLayout(new BorderLayout());
		
		caixa.add(pnlOeste, BorderLayout.WEST);
		caixa.add(pnlLeste, BorderLayout.EAST);
		caixa.add(pnlSul, BorderLayout.SOUTH);
		
		btnInsere.addActionListener(this);
		btnLimpa.addActionListener(this);
		btnSai.addActionListener(this);
		
		setSize(450, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLimpa) {
			
		txtNumRegistro.setText ("");
		txtNomeEmpregado.setText("");
		txtRgEmpregado.setText ("");
		txtCpfEmpregado.setText ("");
		txtDataAdmisao.setText("");
		txtDataAdmisao.setText ("");
		txtCargoEmpregado.setText ("");
			
		}
		else if (e.getSource() == btnSai) {
			System.exit(0);
		}
		else {
			Empregado empregado = new Empregado();
			String sNumRegistro = txtNumRegistro.getText();
			String sNomeEmpregado = txtNomeEmpregado.getText();
			String sRgEmpregado = txtRgEmpregado.getText();
			String sCpfEmpregado = txtCpfEmpregado.getText();
			String sDataAdmisao = txtDataAdmisao.getText();
			String sCargoEmpregado= txtCargoEmpregado.getText();
			if (sNumRegistro.length() > 0 && sNomeEmpregado.length() > 0 &&
			   sRgEmpregado.length() >0 && sCpfEmpregado.length() > 0 && 
			   sDataAdmisao.length() > 0 && sCargoEmpregado.length() > 0 ) {
				empregado.setIdEmpregado(Integer.parseInt(sNumRegistro));
				empregado.setNome(sNomeEmpregado);
				empregado.setRg(sRgEmpregado);
				empregado.setCpf(sCpfEmpregado);
				empregado.setDtAdmissao(sDataAdmisao);
				empregado.setCargo(sCargoEmpregado);
				empregado.incluir(conn);
			}
			else {
				JOptionPane.showMessageDialog(this, "Preencha todos os campos");
				}
			} 
		}
	}
