package sistemaVentasCocina;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgListarCocina extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnCerrar;
	private JButton btnListar;
	private JTextArea txtS;
	private JScrollPane scp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgListarCocina dialog = new DlgListarCocina();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgListarCocina() {
		setBounds(100, 100, 450, 318);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(126, 248, 89, 23);
		contentPanel.add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(246, 248, 89, 23);
		contentPanel.add(btnListar);
		
		scp = new JScrollPane();
		scp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scp.setBounds(10, 11, 414, 226);
		contentPanel.add(scp);
		
		txtS = new JTextArea();
		scp.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
	dispose();
	}
	
	
	protected void actionPerformedBtnListar(ActionEvent e) {
		txtS.setText("LISTADO DE COCINAS \n\n");
		txtS.append("Modelo "+"\t: "+FrmPrincipal.modelo0 + "\n");
		txtS.append("Precio "+"\t: "+FrmPrincipal.precio0 + "\n");
		txtS.append("\n");
		txtS.append("Modelo "+"\t: "+FrmPrincipal.modelo1 + "\n");
		
	}
}
