package sistemaVentasCocina;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SpringLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class DlgAcerca extends JDialog implements ActionListener {
	private JLabel lblTitulo;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton btnCerrar;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgAcerca dialog = new DlgAcerca();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgAcerca() {
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 418, 333);
		getContentPane().setLayout(null);
		
		lblTitulo = new JLabel("FIRST KITCHEN");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitulo.setBounds(109, 28, 175, 38);
		getContentPane().add(lblTitulo);
		
		lblNewLabel_1 = new JLabel("Cruz Carpio, Karen Mar\u00EDa");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(59, 92, 266, 22);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Gonzales Leyva, Jhonatan Paolo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(59, 114, 266, 22);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Lopez Sanchez, Ricardo Gabriel");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(59, 136, 266, 22);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Peregrino Cuba, Diego Paul");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(59, 158, 266, 22);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Torres Chipana, Edisson Antonio");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(59, 180, 266, 22);
		getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Trujillo Asto, Mart\u00EDn Eduardo");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(59, 203, 266, 22);
		getContentPane().add(lblNewLabel_6);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCerrar.setBounds(150, 247, 96, 30);
		getContentPane().add(btnCerrar);
		
		separator = new JSeparator();
		separator.setBounds(29, 79, 342, 2);
		getContentPane().add(separator);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
