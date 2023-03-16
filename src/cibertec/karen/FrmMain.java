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
		
		mntmModificarCocina = new JMenuItem("Modificar cocina");
		mntmModificarCocina.addActionListener(this);
		mnMantenimiento.add(mntmModificarCocina);
		
		mntmListarCocinas = new JMenuItem("Listar cocinas");
		mntmListarCocinas.addActionListener(this);
		mnMantenimiento.add(mntmListarCocinas);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		
		mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		mntmConfigurarDescuento = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuento.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarDescuento);
		
		mntmConfigurarObsequios = new JMenuItem("Configurar obsequios");
		mntmConfigurarObsequios.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarObsequios);
		
		mntmCantidadOptima = new JMenuItem("Configurar cantidad \u00F3ptima");
		mntmCantidadOptima.addActionListener(this);
		mnConfiguracin.add(mntmCantidadOptima);
		
		mntmCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		mntmCuotaDiaria.addActionListener(this);
		mnConfiguracin.add(mntmCuotaDiaria);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAyuda = new JMenuItem("Acerca de Tienda");
		mntmAyuda.addActionListener(this);
		mnAyuda.add(mntmAyuda);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmCuotaDiaria) {
			actionPerformedMntmCuotaDiaria(e);
		}
		if (e.getSource() == mntmCantidadOptima) {
			actionPerformedMntmCantidadOptima(e);
		}
		if (e.getSource() == mntmConfigurarObsequios) {
			actionPerformedMntmConfigurarObsequios(e);
		}
		if (e.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmListarCocinas) {
			actionPerformedMntmListarCocinas(e);
		}
		if (e.getSource() == mntmModificarCocina) {
			actionPerformedMntmModificarCocina(e);
		}
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
	private JMenuItem mntmModificarCocina;
	protected void actionPerformedMntmConsultarCocina(ActionEvent e) {
		if(frmConsultar== null) {
			frmConsultar = new FrmConsultar();
			frmConsultar.setVisible(true);
		}else if(this.getAccessibleContext()!=null) {
			frmConsultar = new FrmConsultar();
			frmConsultar.setVisible(true);		
		}
	}
	FrmModificar frmModificar;
	private JMenuItem mntmListarCocinas;
	protected void actionPerformedMntmModificarCocina(ActionEvent e) {
		if(frmModificar== null) {
			frmModificar = new FrmModificar();
			frmModificar.setVisible(true);
		}else if(this.getAccessibleContext()!=null) {
			frmModificar = new FrmModificar();
			frmModificar.setVisible(true);
		}
	}
	FrmListado frmListado;
	protected void actionPerformedMntmListarCocinas(ActionEvent e) {
		if(frmListado == null) {
			frmListado = new FrmListado();
			frmListado.setVisible(true);			
		}else if(this.getAccessibleContext()!=null) {
			frmListado = new FrmListado();
			frmListado.setVisible(true);		
		}
	}
	FrmVender frmVender;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	protected void actionPerformedMntmVender(ActionEvent e) {
		if(frmVender == null) {
			frmVender = new FrmVender();
			frmVender.setVisible(true);
		}else if(this.getAccessibleContext()!=null) {
			frmVender = new FrmVender();
			frmVender.setVisible(true);
		}
	}
	FrmReportes frmReportes;
	private JMenuItem mntmConfigurarObsequios;
	protected void actionPerformedMntmGenerarReportes(ActionEvent e) {
		if(frmReportes ==null) {
			frmReportes = new FrmReportes();
			frmReportes.setVisible(true);
		}else if(this.getAccessibleContext()!=null) {
			frmReportes = new FrmReportes();
			frmReportes.setVisible(true);
		}
	}
	FrmObsequios frmObsequios;
	private JMenuItem mntmCantidadOptima;
	protected void actionPerformedMntmConfigurarObsequios(ActionEvent e) {
		if(frmObsequios == null) {
			frmObsequios = new FrmObsequios();
			frmObsequios.setVisible(true);
		}else if(this.getAccessibleContext()!=null) {
			frmObsequios = new FrmObsequios();
			frmObsequios.setVisible(true);
		}
	}
	FrmCantidadOptima frmCantidadOptima;
	private JMenuItem mntmCuotaDiaria;
	protected void actionPerformedMntmCantidadOptima(ActionEvent e) {
		if(frmCantidadOptima == null) {
			frmCantidadOptima = new FrmCantidadOptima();
			frmCantidadOptima.setVisible(true);
		}else if(this.getAccessibleContext()!=null) {
			frmCantidadOptima = new FrmCantidadOptima();
			frmCantidadOptima.setVisible(true);
		}
	}
	FrmCuotaDiaria frmCuotaDiaria;
	protected void actionPerformedMntmCuotaDiaria(ActionEvent e) {
		if(frmCuotaDiaria == null) {
			frmCuotaDiaria = new FrmCuotaDiaria();
			frmCuotaDiaria.setVisible(true);
		}else if(this.getAccessibleContext()!=null) {
			frmCuotaDiaria = new FrmCuotaDiaria();
			frmCuotaDiaria.setVisible(true);
		}
	}
}
