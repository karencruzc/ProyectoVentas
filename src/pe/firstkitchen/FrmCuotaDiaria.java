package pe.firstkitchen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCuotaDiaria extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblCuota;
	private JTextField txtCuota;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCuotaDiaria frame = new FrmCuotaDiaria();
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
	public FrmCuotaDiaria() {
		setTitle("Configurar cuota diaria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 119);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCuota = new JLabel("Cuota diaria esperada (S/)");
		lblCuota.setBounds(10, 21, 160, 14);
		contentPane.add(lblCuota);
		
		txtCuota = new JTextField();
		txtCuota.setBounds(176, 18, 126, 20);
		contentPane.add(txtCuota);
		txtCuota.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(363, 17, 89, 23);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(363, 43, 89, 23);
		contentPane.add(btnCancelar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		this.dispose();
	}
}
