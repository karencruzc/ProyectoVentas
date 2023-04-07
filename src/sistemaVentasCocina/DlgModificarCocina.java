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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class DlgModificarCocina extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;
	private JButton btnGrabar;
	//private JComboBox<?> cboModelo;
	private JButton btnCerrar;
	private JComboBox<?> cboModelo_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgModificarCocina dialog = new DlgModificarCocina();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public DlgModificarCocina() {
		setTitle("Modificar Cocina");
		setBounds(100, 100, 450, 219);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(10, 11, 64, 14);
			contentPanel.add(lblModelo);
		}
		{
			cboModelo_1 = new JComboBox();
			cboModelo_1.addActionListener(this);
			cboModelo_1.setModel(new DefaultComboBoxModel(new String[] {"Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
			cboModelo_1.setBounds(112, 7, 137, 22);
			contentPanel.add(cboModelo_1);
		}
		{
			JLabel lblPrecio = new JLabel("Precio (S/)");
			lblPrecio.setBounds(10, 37, 91, 14);
			contentPanel.add(lblPrecio);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(335, 11, 89, 23);
			contentPanel.add(btnCerrar);
		}
		{
			btnGrabar = new JButton("Grabar");
			btnGrabar.addActionListener(this);
			btnGrabar.setBounds(335, 37, 89, 23);
			contentPanel.add(btnGrabar);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setBounds(112, 34, 137, 20);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			JLabel lblAncho = new JLabel("Ancho (cm)");
			lblAncho.setBounds(10, 65, 91, 14);
			contentPanel.add(lblAncho);
		}
		{
			txtAncho = new JTextField();
			txtAncho.setColumns(10);
			txtAncho.setBounds(112, 62, 137, 20);
			contentPanel.add(txtAncho);
		}
		{
			JLabel lblAlto = new JLabel("Alto (cm)");
			lblAlto.setBounds(10, 93, 91, 14);
			contentPanel.add(lblAlto);
		}
		{
			txtAlto = new JTextField();
			txtAlto.setColumns(10);
			txtAlto.setBounds(112, 90, 137, 20);
			contentPanel.add(txtAlto);
		}
		{
			JLabel lblFondo = new JLabel("Fondo (cm)");
			lblFondo.setBounds(10, 121, 91, 14);
			contentPanel.add(lblFondo);
		}
		{
			txtFondo = new JTextField();
			txtFondo.setColumns(10);
			txtFondo.setBounds(112, 118, 137, 20);
			contentPanel.add(txtFondo);
		}
		{
			JLabel lblQuemadores = new JLabel("Quemadores");
			lblQuemadores.setBounds(10, 149, 91, 14);
			contentPanel.add(lblQuemadores);
		}
		{
			txtQuemadores = new JTextField();
			txtQuemadores.setColumns(10);
			txtQuemadores.setBounds(112, 146, 137, 20);
			contentPanel.add(txtQuemadores);
			
			//mostrar datos
			txtPrecio.setText(FrmPrincipal.precio0+"");
			txtAncho.setText(FrmPrincipal.ancho0+"");
			txtAlto.setText(FrmPrincipal.alto0+"");
			txtFondo.setText(FrmPrincipal.fondo0+"");
			txtQuemadores.setText(FrmPrincipal.quemadores0+"");
			
			
			
			
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModelo_1) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
	}
	protected void actionPerformedBtnGrabar(ActionEvent e) {
		//Declaracion de Variable
		int modelo;

		//entrada de datos		
		modelo = cboModelo_1.getSelectedIndex();		 
		 
		 //Guardar datos
		 switch (modelo) {
		 case 0: //Mabe
			 FrmPrincipal.precio0 = Double.parseDouble(txtPrecio.getText());
			 FrmPrincipal.ancho0 = Double.parseDouble(txtAncho.getText());
			 FrmPrincipal.alto0 = Double.parseDouble(txtAlto.getText());
			 FrmPrincipal.fondo0 = Double.parseDouble(txtFondo.getText());
			 FrmPrincipal.quemadores0 = Integer.parseInt(txtQuemadores.getText());
			 break;
			 
		 case 1: //Indurama
			 FrmPrincipal.precio1 = Double.parseDouble(txtPrecio.getText());
			 FrmPrincipal.ancho1 = Double.parseDouble(txtAncho.getText());
			 FrmPrincipal.alto1 = Double.parseDouble(txtAlto.getText());
			 FrmPrincipal.fondo1 = Double.parseDouble(txtFondo.getText());
			 FrmPrincipal.quemadores1 = Integer.parseInt(txtQuemadores.getText());
			 break;
			 
		 case 2: //Sole
			 FrmPrincipal.precio2 = Double.parseDouble(txtPrecio.getText());
			 FrmPrincipal.ancho2 = Double.parseDouble(txtAncho.getText());
			 FrmPrincipal.alto2 = Double.parseDouble(txtAlto.getText());
			 FrmPrincipal.fondo2 = Double.parseDouble(txtFondo.getText());
			 FrmPrincipal.quemadores2 = Integer.parseInt(txtQuemadores.getText());
			 break;
		 case 3:
			 FrmPrincipal.precio3 = Double.parseDouble(txtPrecio.getText());
			 FrmPrincipal.ancho3 = Double.parseDouble(txtAncho.getText());
			 FrmPrincipal.alto3 = Double.parseDouble(txtAlto.getText());
			 FrmPrincipal.fondo3 = Double.parseDouble(txtFondo.getText());
			 FrmPrincipal.quemadores3 = Integer.parseInt(txtQuemadores.getText());
			 break; 
		 default:
			 FrmPrincipal.precio4 = Double.parseDouble(txtPrecio.getText());
			 FrmPrincipal.ancho4 = Double.parseDouble(txtAncho.getText());
			 FrmPrincipal.alto4 = Double.parseDouble(txtAlto.getText());
			 FrmPrincipal.fondo4 = Double.parseDouble(txtFondo.getText());
			 FrmPrincipal.quemadores4 = Integer.parseInt(txtQuemadores.getText());
			 break;
		 
		 }
		 	
	}
	
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		//Cerrar Venanas dependientes "JDialog"
    dispose();
	}
	
	protected void actionPerformedCboModelo(ActionEvent e) {
		
		//Declarar Variables
		
		int modelo;
				//double precio;
		//Entrada de datos
		modelo = cboModelo_1.getSelectedIndex();
				
		//Mostrar Datos
			
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