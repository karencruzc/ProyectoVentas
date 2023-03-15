package cibertec.karen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracin;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmAyuda;
	private JMenuItem mntmConsultarCocina;
	private JMenuItem mntmConfigurarDescuento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMain frame = new FrmMain();
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
	public FrmMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		contentPane.add(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarCocina = new JMenuItem("Consultar cocina");
		mntmConsultarCocina.addActionListener(this);
		mnMantenimiento.add(mntmConsultarCocina);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		mntmConfigurarDescuento = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuento.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarDescuento);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAyuda = new JMenuItem("Acerca de Tienda");
		mntmAyuda.addActionListener(this);
		mnAyuda.add(mntmAyuda);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmConsultarCocina) {
			actionPerformedMntmConsultarCocina(e);
		}
		if (e.getSource() == mntmConfigurarDescuento) {
			actionPerformedMntmConfigurarDescuento(e);
		}
		if (e.getSource() == mntmAyuda) {
			actionPerformedMntmAyuda(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
	}
	
	protected void actionPerformedMntmSalir(ActionEvent e) {
		System.exit(0);
	}
	
	FrmTiendaAutores frmTiendaAutores;	
	protected void actionPerformedMntmAyuda(ActionEvent e) {
		if(frmTiendaAutores==null){
			frmTiendaAutores = new FrmTiendaAutores();
			frmTiendaAutores.setVisible(true);
		}else if (this.getAccessibleContext()!=null){
			frmTiendaAutores = new FrmTiendaAutores();
			frmTiendaAutores.setVisible(true);
		}
	}
	
	FrmDescuento frmDescuento;		
	protected void actionPerformedMntmConfigurarDescuento(ActionEvent e) {
		if(frmDescuento==null) {
			frmDescuento = new FrmDescuento();
			frmDescuento.setVisible(true);
		}else if (this.getAccessibleContext()!=null){
			frmDescuento = new FrmDescuento();
			frmDescuento.setVisible(true);
		}
	}
	
	FrmConsultar frmConsultar;
	protected void actionPerformedMntmConsultarCocina(ActionEvent e) {
		if(frmConsultar== null) {
			frmConsultar = new FrmConsultar();
			frmConsultar.setVisible(true);
		}else if(this.getAccessibleContext()!=null) {
			frmConsultar = new FrmConsultar();
			frmConsultar.setVisible(true);		
		}
	}
}
