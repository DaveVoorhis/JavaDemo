import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;

public class Demo {

	private JFrame frmThings;
	private JTextField textName;

	/**
	 * Go!
	 */
	public Demo() {
		initialize();
		frmThings.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmThings = new JFrame();
		frmThings.setTitle("Name");
		frmThings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmThings.getContentPane().setLayout(new MigLayout("", "[][grow]", "[][]"));
		
		JLabel lblName = new JLabel("Name:");
		frmThings.getContentPane().add(lblName, "cell 0 0,alignx trailing");
		
		textName = new JTextField();
		frmThings.getContentPane().add(textName, "cell 1 0,growx");
		textName.setColumns(10);
		
		JPanel panel = new JPanel();
		frmThings.getContentPane().add(panel, "cell 1 1,grow");
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnOk = new JButton("Ok");
		panel.add(btnOk);
		SwingUtilities.getRootPane(btnOk).setDefaultButton(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		panel.add(btnCancel);
		
		frmThings.pack();
		
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frmThings, "Success!", "Result", JOptionPane.INFORMATION_MESSAGE);
				frmThings.dispose();
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmThings.dispose();
			}
		});
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Demo();
	}

}
