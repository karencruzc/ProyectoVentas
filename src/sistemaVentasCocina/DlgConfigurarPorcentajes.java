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

public class DlgConfigurarPorcentajes extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txt1a5Unidades;
	private JLabel lblPorcentaje;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel lbl6a10Unidades;
	private JTextField txt6a10Unidades;
	private JLabel lblPorcentaje_1;
	private JLabel lbl11a15Unidades;
	private JTextField txt11a15Unidades;
	private JLabel lblPorcentaje_2;
	private JLabel lblMasDe15Unid;
	private JTextField txtMasDe15Unid;
	private JLabel lblPorcentaje_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgConfigurarPorcentajes dialog = new DlgConfigurarPorcentajes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgConfigurarPorcentajes() {
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 509, 174);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lbl1a5Unidades = new JLabel("1 a 5 unidades");
			lbl1a5Unidades.setBounds(10, 21, 137, 14);
			contentPanel.add(lbl1a5Unidades);
		}
		
		txt1a5Unidades = new JTextField();
		txt1a5Unidades.setBounds(142, 18, 111, 20);
		contentPanel.add(txt1a5Unidades);
		txt1a5Unidades.setColumns(10);
		
		lblPorcentaje = new JLabel("%");
		lblPorcentaje.setBounds(263, 21, 46, 14);
		contentPanel.add(lblPorcentaje);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(394, 17, 89, 23);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(394, 46, 89, 23);
		contentPanel.add(btnCancelar);
		
		lbl6a10Unidades = new JLabel("6 a 10 unidades");
		lbl6a10Unidades.setBounds(10, 49, 137, 14);
		contentPanel.add(lbl6a10Unidades);
		
		txt6a10Unidades = new JTextField();
		txt6a10Unidades.setColumns(10);
		txt6a10Unidades.setBounds(142, 46, 111, 20);
		contentPanel.add(txt6a10Unidades);
		
		lblPorcentaje_1 = new JLabel("%");
		lblPorcentaje_1.setBounds(263, 49, 46, 14);
		contentPanel.add(lblPorcentaje_1);
		
		lbl11a15Unidades = new JLabel("11 a 15 unidades");
		lbl11a15Unidades.setBounds(10, 77, 137, 14);
		contentPanel.add(lbl11a15Unidades);
		
		txt11a15Unidades = new JTextField();
		txt11a15Unidades.setColumns(10);
		txt11a15Unidades.setBounds(142, 74, 111, 20);
		contentPanel.add(txt11a15Unidades);
		
		lblPorcentaje_2 = new JLabel("%");
		lblPorcentaje_2.setBounds(263, 77, 46, 14);
		contentPanel.add(lblPorcentaje_2);
		
		lblMasDe15Unid = new JLabel("M\u00E1s de 15 unidades");
		lblMasDe15Unid.setBounds(10, 105, 137, 14);
		contentPanel.add(lblMasDe15Unid);
		
		txtMasDe15Unid = new JTextField();
		txtMasDe15Unid.setColumns(10);
		txtMasDe15Unid.setBounds(142, 102, 111, 20);
		contentPanel.add(txtMasDe15Unid);
		
		lblPorcentaje_3 = new JLabel("%");
		lblPorcentaje_3.setBounds(263, 105, 46, 14);
		contentPanel.add(lblPorcentaje_3);
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
