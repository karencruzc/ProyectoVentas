package cibertec.karen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmTiendaAutores extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblTienda;
	private JSeparator separator;
	private JLabel lblNewLabel;
	private JButton btnCerrar;
	private JLabel lblGonzalesLeyvaJhonatan;
	private JLabel lblLopezSanchezRicardo;
	private JLabel lblPeregrinoCubaDiego;
	private JLabel lblTrujilloAstoMartn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTiendaAutores frame = new FrmTiendaAutores();
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
	public FrmTiendaAutores() {
		setTitle("Acerca de Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTienda = new JLabel("FIRST KITCHEN S.A.");
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTienda.setBackground(new Color(0, 0, 255));
		lblTienda.setBounds(89, 27, 324, 40);
		contentPane.add(lblTienda);
		
		separator = new JSeparator();
		separator.setBounds(10, 78, 414, 2);
		contentPane.add(separator);
		
		lblNewLabel = new JLabel("Cruz Carpio, Karen");
		lblNewLabel.setBounds(133, 91, 171, 14);
		contentPane.add(lblNewLabel);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(170, 194, 89, 23);
		contentPane.add(btnCerrar);
		
		lblGonzalesLeyvaJhonatan = new JLabel("gonzales Leyva, Jhonatan");
		lblGonzalesLeyvaJhonatan.setBounds(133, 104, 171, 14);
		contentPane.add(lblGonzalesLeyvaJhonatan);
		
		lblLopezSanchezRicardo = new JLabel("Lopez Sanchez, Ricardo");
		lblLopezSanchezRicardo.setBounds(133, 116, 171, 14);
		contentPane.add(lblLopezSanchezRicardo);
		
		lblPeregrinoCubaDiego = new JLabel("Peregrino Cuba, Diego");
		lblPeregrinoCubaDiego.setBounds(133, 129, 171, 14);
		contentPane.add(lblPeregrinoCubaDiego);
		
		lblTrujilloAstoMartn = new JLabel("Trujillo Asto, Mart\u00EDn");
		lblTrujilloAstoMartn.setBounds(133, 141, 171, 14);
		contentPane.add(lblTrujilloAstoMartn);
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
