package sistemaVentasCocina;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class DlgVender extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JComboBox cboModelo;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JLabel lblCantidad;
	private JTextField txtCantidad;
	private JButton btnVender;
	private JButton btnCerrar;
	private JTextArea txtS;
	private JScrollPane scp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgVender dialog = new DlgVender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgVender() {
		setTitle("Vender");
		setBounds(100, 100, 553, 358);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(10, 11, 66, 14);
			contentPanel.add(lblModelo);
		}
		
		cboModelo = new JComboBox();
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dak"}));
		cboModelo.setBounds(107, 7, 172, 22);
		contentPanel.add(cboModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 46, 66, 14);
		contentPanel.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(107, 40, 172, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 74, 66, 14);
		contentPanel.add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(107, 68, 172, 20);
		contentPanel.add(txtCantidad);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(438, 7, 89, 23);
		contentPanel.add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(438, 37, 89, 23);
		contentPanel.add(btnCerrar);
		
		scp = new JScrollPane();
		scp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scp.setBounds(10, 110, 517, 198);
		contentPanel.add(scp);
		
		txtS = new JTextArea();
		scp.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
	}
	
	
	String nombreModelo(int modelo){
		
		switch (modelo) {
		case 0: 
			return FrmPrincipal.modelo0;			
		case 1: 
			return FrmPrincipal.modelo1;			
		case 2: 
			return FrmPrincipal.modelo2;		
		case 3: 
			return FrmPrincipal.modelo3;		
		default: 
			return FrmPrincipal.modelo4;				
		}
		
	}
	
	double importeCompra(int modelo, int cantidad) {
		
		switch (modelo) {
		case 0: 
			return FrmPrincipal.precio0 * cantidad;
		case 1: 
			return FrmPrincipal.precio1 * cantidad;
		case 2: 
			return FrmPrincipal.precio2 * cantidad;
		case 3: 
			return FrmPrincipal.precio3 * cantidad;
		default:
			return FrmPrincipal.precio4 * cantidad;
		}
		
	}
	
	
	
	
	protected void actionPerformedBtnVender(ActionEvent e) {
		int cantidad, modelo;
		double precio=0, importeCompra=0.0, importeDscto=0.0, importePagar;
		String obs, nombre;
		
		//entrada de datos
		modelo = cboModelo.getSelectedIndex();//indice del combo indica qué cocina es... 
		cantidad = Integer.parseInt(txtCantidad.getText());//
		
		//calculo de datos
		nombre = nombreModelo(modelo);
		
		importeCompra = importeCompra(modelo, cantidad);
		
		if(cantidad>=1 && cantidad <= 5) {
			importeDscto = importeCompra * 0.075;
		}else if (cantidad >=6 && cantidad <=10) {
			importeDscto = importeCompra * 0.10;
		}else if(cantidad >=11 && cantidad <=15) {
			importeDscto = importeCompra * 0.125;
		}else {
			importeDscto = importeCompra * 0.15;
		}
		
		//Obsequios
		if(cantidad == 1)
			obs = "Cafetera";
		if(cantidad >=2 && cantidad <=5)
			obs = "Licuadora";
		if(cantidad>5)
			obs = "Extractor";		
		
		//Calculo de importe a Pagar		
		importePagar = importeCompra - importeDscto;
		
		
		
		/*
		importeTotal = 13167.38;
		porcentajeCuota = 0.2633;		
		JOptionPane.showMessageDialog(this, "Venta Nro. 5" + "\n"+"Importe total general acumulado: S/." + importeTotal + 
				"\n" + "Porcentaje de la cuota diaria: " + porcentajeCuota*100 + "%", "Avance de ventas", JOptionPane.INFORMATION_MESSAGE);
		*/
	}
	
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
