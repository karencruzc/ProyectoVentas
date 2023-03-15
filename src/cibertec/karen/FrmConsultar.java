package cibertec.karen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmConsultar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblModelo;
	private JComboBox cboModelo;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JLabel lblAncho;
	private JTextField txtAncho;
	private JLabel lblAlto;
	private JTextField txtAlto;
	private JLabel lblFondo;
	private JTextField txtFondo;
	private JLabel lblQuemadores;
	private JTextField txtQuemadores;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmConsultar frame = new FrmConsultar();
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
	public FrmConsultar() {
		setTitle("Consultar cocina");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 87, 14);
		contentPane.add(lblModelo);
		
		cboModelo = new JComboBox();
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
		cboModelo.setBounds(107, 7, 143, 22);
		contentPane.add(cboModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 39, 87, 14);
		contentPane.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setEnabled(false);
		txtPrecio.setBounds(107, 36, 143, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 65, 87, 14);
		contentPane.add(lblAncho);
		
		txtAncho = new JTextField();
		txtAncho.setEnabled(false);
		txtAncho.setColumns(10);
		txtAncho.setBounds(107, 62, 143, 20);
		contentPane.add(txtAncho);
		
		lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(10, 93, 87, 14);
		contentPane.add(lblAlto);
		
		txtAlto = new JTextField();
		txtAlto.setEnabled(false);
		txtAlto.setColumns(10);
		txtAlto.setBounds(107, 90, 143, 20);
		contentPane.add(txtAlto);
		
		lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(10, 121, 87, 14);
		contentPane.add(lblFondo);
		
		txtFondo = new JTextField();
		txtFondo.setEnabled(false);
		txtFondo.setColumns(10);
		txtFondo.setBounds(107, 118, 143, 20);
		contentPane.add(txtFondo);
		
		lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setBounds(10, 149, 87, 14);
		contentPane.add(lblQuemadores);
		
		txtQuemadores = new JTextField();
		txtQuemadores.setEnabled(false);
		txtQuemadores.setColumns(10);
		txtQuemadores.setBounds(107, 146, 143, 20);
		contentPane.add(txtQuemadores);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(362, 7, 89, 23);
		contentPane.add(btnCerrar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		this.dispose();
	}
}
