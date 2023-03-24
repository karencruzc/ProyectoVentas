package pe.firstkitchen;

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
		setBackground(new Color(0, 0, 0));
		setTitle("Acerca de Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTienda = new JLabel("FIRST KITCHEN S.A.");
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTienda.setBackground(new Color(0, 0, 255));
		lblTienda.setBounds(127, 26, 324, 40);
		contentPane.add(lblTienda);
		
		separator = new JSeparator();
		separator.setBounds(54, 78, 414, 2);
		contentPane.add(separator);
		
		lblNewLabel = new JLabel("Cruz Carpio, Karen");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblNewLabel.setBounds(159, 91, 171, 27);
		contentPane.add(lblNewLabel);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(215, 266, 103, 40);
		contentPane.add(btnCerrar);
		
		lblGonzalesLeyvaJhonatan = new JLabel("Gonzales Leyva, Jhonatan");
		lblGonzalesLeyvaJhonatan.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblGonzalesLeyvaJhonatan.setBounds(159, 116, 246, 23);
		contentPane.add(lblGonzalesLeyvaJhonatan);
		
		lblLopezSanchezRicardo = new JLabel("Lopez Sanchez, Ricardo");
		lblLopezSanchezRicardo.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblLopezSanchezRicardo.setBounds(159, 141, 206, 23);
		contentPane.add(lblLopezSanchezRicardo);
		
		lblPeregrinoCubaDiego = new JLabel("Peregrino Cuba, Diego");
		lblPeregrinoCubaDiego.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblPeregrinoCubaDiego.setBounds(159, 164, 192, 23);
		contentPane.add(lblPeregrinoCubaDiego);
		
		lblTrujilloAstoMartn = new JLabel("Trujillo Asto, Mart\u00EDn");
		lblTrujilloAstoMartn.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblTrujilloAstoMartn.setBounds(159, 189, 171, 25);
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
