package sistemaVentasCocina;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgConfigurarObsequios extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txt1Unidad;
	private JTextField txt2a5Unidades;
	private JTextField txt6AMasUnidades;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgConfigurarObsequios dialog = new DlgConfigurarObsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgConfigurarObsequios() {
		setTitle("Configurar obsequios");
		setBounds(100, 100, 422, 133);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lbl1Unidad = new JLabel("1 unidad");
			lbl1Unidad.setBounds(10, 11, 97, 14);
			contentPanel.add(lbl1Unidad);
		}
		{
			txt1Unidad = new JTextField();
			txt1Unidad.setBounds(143, 8, 86, 20);
			contentPanel.add(txt1Unidad);
			txt1Unidad.setColumns(10);
		}
		{
			JLabel lbl2A5Unidades = new JLabel("2 a 5 unidades");
			lbl2A5Unidades.setBounds(10, 39, 97, 14);
			contentPanel.add(lbl2A5Unidades);
		}
		{
			txt2a5Unidades = new JTextField();
			txt2a5Unidades.setColumns(10);
			txt2a5Unidades.setBounds(143, 36, 86, 20);
			contentPanel.add(txt2a5Unidades);
		}
		{
			JLabel lbl6AMasUnidades = new JLabel("6 a m\u00E1s unidades");
			lbl6AMasUnidades.setBounds(10, 67, 123, 14);
			contentPanel.add(lbl6AMasUnidades);
		}
		{
			txt6AMasUnidades = new JTextField();
			txt6AMasUnidades.setColumns(10);
			txt6AMasUnidades.setBounds(143, 64, 86, 20);
			contentPanel.add(txt6AMasUnidades);
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(302, 11, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(302, 39, 89, 23);
			contentPanel.add(btnCancelar);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
