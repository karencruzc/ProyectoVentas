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
	private JSeparator separator_1;
	private JButton btnCerrar;

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
		
		lblTienda = new JLabel("Tienda 1.0");
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTienda.setBackground(new Color(0, 0, 255));
		lblTienda.setBounds(133, 25, 185, 40);
		contentPane.add(lblTienda);
		
		separator = new JSeparator();
		separator.setBounds(10, 78, 414, 2);
		contentPane.add(separator);
		
		lblNewLabel = new JLabel("Karen Cruz Carpio");
		lblNewLabel.setBounds(133, 106, 168, 14);
		contentPane.add(lblNewLabel);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(10, 148, 414, 2);
		contentPane.add(separator_1);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(170, 194, 89, 23);
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
