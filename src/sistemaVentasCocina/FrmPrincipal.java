package sistemaVentasCocina;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenu mnMantenimiento;
	private JMenuItem mntmConsultarCocina;
	private JMenuItem mntmModificarCocina;
	private JMenuItem mntmListarCocina;
	private JMenu mnVentas;
	private JMenu mnConfiguraci�n;
	private JMenu mnAyuda;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmAcerca;

	//variables globales
	// Datos m�nimos de la primera cocina
	public static String modelo0 = "Mabe EMP6120PG0";
	public static double precio0 = 949.0;
	
	public static double fondo0 = 58.6;
	public static double ancho0 = 60.0;
	public static double alto0 = 91.0;
	public static int quemadores0 = 4;
	// Datos m�nimos de la segunda cocina
	public static String modelo1 = "Indurama Parma";
	public static double precio1 = 1089.0;
	public static double ancho1 = 80.0;
	public static double alto1 = 94.0;
	public static double fondo1 = 67.5;
	public static int quemadores1 = 6;
	// Datos m�nimos de la tercera cocina
	public static String modelo2 = "Sole COSOL027";
	public static double precio2 = 850.0;
	public static double ancho2 = 60.0;
	public static double alto2 = 90.0;
	public static double fondo2 = 50.0;
	public static int quemadores2 = 4;
	// Datos m�nimos de la cuarta cocina
	public static String modelo3 = "Coldex CX602";
	public static double precio3 = 629.0;
	public static double ancho3 = 61.6;
	public static double alto3 = 95.0;
	public static double fondo3 = 51.5;
	public static int quemadores3 = 5;
	// Datos m�nimos de la quinta cocina
	public static String modelo4 = "Reco Dakota";
	public static double precio4 = 849.0;
	public static double ancho4 = 75.4;
	public static double alto4 = 94.5;
	public static double fondo4 = 66.0;
	public static int quemadores4 = 5;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequios
	public static String obsequio1 = "Cafetera";
	public static String obsequio2 = "Licuadora";
	public static String obsequio3 = "Extractor";
	// Cantidad �ptima de unidades vendidas
	public static int cantidadOptima = 30;
	// Cuota diaria
	public static double cuotaDiaria = 75000;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmConfigurarCantidad;
	private JMenuItem mntmConfigurarCuota;
	
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
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
	public FrmPrincipal() {
		setTitle("First Kitchen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 436);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarCocina = new JMenuItem("Consultar Cocina");
		mntmConsultarCocina.addActionListener(this);
		mnMantenimiento.add(mntmConsultarCocina);
		
		mntmModificarCocina = new JMenuItem("Modificar Cocina");
		mntmModificarCocina.addActionListener(this);
		mnMantenimiento.add(mntmModificarCocina);
		
		mntmListarCocina = new JMenuItem("Listar Cocina");
		mntmListarCocina.addActionListener(this);
		mnMantenimiento.add(mntmListarCocina);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		
		mnConfiguraci�n = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguraci�n);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfiguraci�n.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequios = new JMenuItem("Configurar obsequios");
		mntmConfigurarObsequios.addActionListener(this);
		mnConfiguraci�n.add(mntmConfigurarObsequios);
		
		mntmConfigurarCantidad = new JMenuItem("Configurar cantidad \u00F3ptima");
		mntmConfigurarCantidad.addActionListener(this);
		mnConfiguraci�n.add(mntmConfigurarCantidad);
		
		mntmConfigurarCuota = new JMenuItem("Configurar cuota diaria");
		mntmConfigurarCuota.addActionListener(this);
		mnConfiguraci�n.add(mntmConfigurarCuota);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcerca = new JMenuItem("Acerca de Tienda");
		mntmAcerca.addActionListener(this);
		mnAyuda.add(mntmAcerca);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmConfigurarCuota) {
			actionPerformedMntmConfigurarCuota(e);
		}
		if (e.getSource() == mntmConfigurarCantidad) {
			actionPerformedMntmConfigurarCantidad(e);
		}
		if (e.getSource() == mntmConfigurarObsequios) {
			actionPerformedMntmConfigurarObsequios(e);
		}
		if (e.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(e);
		}
		if (e.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
		if (e.getSource() == mntmAcerca) {
			actionPerformedMntmAcerca(e);
		}
		if (e.getSource() == mntmListarCocina) {
			actionPerformedMntmListarCocina(e);
		}
		if (e.getSource() == mntmModificarCocina) {
			actionPerformedMntmModificarCocina(e);
		}
		if (e.getSource() == mntmConsultarCocina) {
			actionPerformedMntmConsultarCocina(e);
		}
	}
	protected void actionPerformedMntmConsultarCocina(ActionEvent e) {
		//Instanciar --> Crear un objeto de una determinada clase "DlgConsultarCocina"
		DlgConsultarCocina con = new DlgConsultarCocina();
		
		//Visible
		con.setVisible(true);
		
		//ubicacion
		con.setLocationRelativeTo(this);
				
	}
	protected void actionPerformedMntmModificarCocina(ActionEvent e) {
	   //Instanciar
		DlgModificarCocina mod = new DlgModificarCocina();
		
		//visible
		mod.setVisible(true);
		
		//ubicaci�n}
		mod.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmListarCocina(ActionEvent e) {
		
		//Instanciar
		DlgListarCocina list = new DlgListarCocina();
				
		//visible
		list.setVisible(true);
				
		//ubicaci�n}
		list.setLocationRelativeTo(this);
		
		
	}
	protected void actionPerformedMntmAcerca(ActionEvent e) {
		//Instanciar
		DlgAcerca acerca = new DlgAcerca();
				
		//visible
		acerca.setVisible(true);
				
		//ubicaci�n}
		acerca.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmSalir(ActionEvent e) {
		//cerrar la aplicaci�n --> todo el programa
		System.exit(0);
		
	}
	protected void actionPerformedMntmVender(ActionEvent e) {
		//Instanciar
		DlgVender vender = new DlgVender();
						
		//visible
		vender.setVisible(true);
						
		//ubicaci�n}
		vender.setLocationRelativeTo(this);
		
		
		
	}
	protected void actionPerformedMntmGenerarReportes(ActionEvent e) {
		//Instanciar
		DlgGenerarReportes generar = new DlgGenerarReportes();
						
		//visible
		generar.setVisible(true);
						
		//ubicaci�n}
		generar.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmConfigurarDescuentos(ActionEvent e) {
		//Instanciar
		DlgConfigurarPorcentajes porcentajes = new DlgConfigurarPorcentajes();
								
		//visible
		porcentajes.setVisible(true);
								
		//ubicaci�n}
		porcentajes.setLocationRelativeTo(this);	
	}
	protected void actionPerformedMntmConfigurarObsequios(ActionEvent e) {
		//Instanciar
		DlgConfigurarObsequios obs = new DlgConfigurarObsequios();
								
		//visible
		obs.setVisible(true);
								
		//ubicaci�n}
		obs.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmConfigurarCantidad(ActionEvent e) {
		//Instanciar
		DlgConfigurarCantidad cant = new DlgConfigurarCantidad();
								
		//visible
		cant.setVisible(true);
								
		//ubicaci�n}
		cant.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmConfigurarCuota(ActionEvent e) {
		//Instanciar
		DlgConfigurarCuotaDiaria cuota = new DlgConfigurarCuotaDiaria();
								
		//visible
		cuota.setVisible(true);
								
		//ubicaci�n}
		cuota.setLocationRelativeTo(this);
	}
}
