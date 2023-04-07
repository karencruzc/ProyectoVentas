package sistemaVentasCocina;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgConsultarCocina extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
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
		try {
			DlgConsultarCocina dialog = new DlgConsultarCocina();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	//Constructor
	public DlgConsultarCocina() {
		setTitle("Consultar Cocina");
		setBounds(100, 100, 450, 230);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 78, 14);
		contentPanel.add(lblModelo);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dak"}));
		cboModelo.setBounds(113, 7, 164, 22);
		contentPanel.add(cboModelo);
		
		lblPrecio = new JLabel("Precio (S/.)");
		lblPrecio.setBounds(10, 36, 78, 14);
		contentPanel.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(113, 33, 164, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 64, 78, 14);
		contentPanel.add(lblAncho);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setColumns(10);
		txtAncho.setBounds(113, 61, 164, 20);
		contentPanel.add(txtAncho);
		
		lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(10, 92, 78, 14);
		contentPanel.add(lblAlto);
		
		txtAlto = new JTextField();
		txtAlto.setEditable(false);
		txtAlto.setColumns(10);
		txtAlto.setBounds(113, 89, 164, 20);
		contentPanel.add(txtAlto);
		
		lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(10, 120, 78, 14);
		contentPanel.add(lblFondo);
		
		txtFondo = new JTextField();
		txtFondo.setEditable(false);
		txtFondo.setColumns(10);
		txtFondo.setBounds(113, 117, 164, 20);
		contentPanel.add(txtFondo);
		
		lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setBounds(10, 148, 78, 14);
		contentPanel.add(lblQuemadores);
		
		txtQuemadores = new JTextField();
		txtQuemadores.setEditable(false);
		txtQuemadores.setColumns(10);
		txtQuemadores.setBounds(113, 145, 164, 20);
		contentPanel.add(txtQuemadores);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 7, 89, 23);
		contentPanel.add(btnCerrar);
		
		
		//mostrar datos -cuando la caja de dialogo se haga visible deberan verse los datos de la primera cocina
		txtPrecio.setText(FrmPrincipal.precio0+"");
		txtAncho.setText(FrmPrincipal.ancho0+"");
		txtAlto.setText(FrmPrincipal.alto0+"");
		txtFondo.setText(FrmPrincipal.fondo0+"");
		txtQuemadores.setText(FrmPrincipal.quemadores0+"");
		
			
		
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		//Cerrar Ventanas dependientes
		dispose();
		
	}

	
	protected void actionPerformedCboModelo(ActionEvent e) {
		//Declarar Variables
		
		int modelo;
		//double precio;
		//Entrada de datos
		modelo = cboModelo.getSelectedIndex();
		
		////Mostrar Datos
		
		switch(modelo) {
		case 0: //Mabe
		txtPrecio.setText(FrmPrincipal.precio0+"");
		txtAncho.setText(FrmPrincipal.ancho0+"");
		txtAlto.setText(FrmPrincipal.alto0+"");
		txtFondo.setText(FrmPrincipal.fondo0+"");
		txtQuemadores.setText(FrmPrincipal.quemadores0+"");
		break;
		case 1: //Indurama
		txtPrecio.setText(FrmPrincipal.precio1+"");
		txtAncho.setText(FrmPrincipal.ancho1+"");
		txtAlto.setText(FrmPrincipal.alto1+"");
		txtFondo.setText(FrmPrincipal.fondo1+"");
		txtQuemadores.setText(FrmPrincipal.quemadores1+"");
		break;	
		
		case 2: //Sole
		txtPrecio.setText(FrmPrincipal.precio2+"");
		txtAncho.setText(FrmPrincipal.ancho2+"");
		txtAlto.setText(FrmPrincipal.alto2+"");
		txtFondo.setText(FrmPrincipal.fondo2+"");
		txtQuemadores.setText(FrmPrincipal.quemadores2+"");
		break;	
			
		case 3: //Coldex
		txtPrecio.setText(FrmPrincipal.precio3+"");
		txtAncho.setText(FrmPrincipal.ancho3+"");
		txtAlto.setText(FrmPrincipal.alto3+"");
		txtFondo.setText(FrmPrincipal.fondo3+"");
		txtQuemadores.setText(FrmPrincipal.quemadores3+"");
		break;	
		default: //Reco Dakota
		txtPrecio.setText(FrmPrincipal.precio4+"");
		txtAncho.setText(FrmPrincipal.ancho4+"");
		txtAlto.setText(FrmPrincipal.alto4+"");
		txtFondo.setText(FrmPrincipal.fondo4+"");
		txtQuemadores.setText(FrmPrincipal.quemadores4+"");
		break;	
		
		
		
		}
		
	}
}
