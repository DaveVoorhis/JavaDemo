import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;

public class Demo {

	private JFrame frmThings;
	private JTextField textName;
	private JTextField textAge;

	/**
	 * Set it up and make it go.
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
		frmThings.setTitle("Things");
		frmThings.setBounds(100, 100, 450, 300);
		frmThings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmThings.getContentPane().setLayout(new MigLayout("", "[][grow]", "[][][][][grow][]"));
		
		JLabel lblName = new JLabel("Name:");
		frmThings.getContentPane().add(lblName, "cell 0 0,alignx trailing");
		
		textName = new JTextField();
		frmThings.getContentPane().add(textName, "cell 1 0,growx");
		textName.setColumns(10);
		
		JLabel lblAge = new JLabel("Age:");
		frmThings.getContentPane().add(lblAge, "cell 0 1,alignx trailing");
		
		textAge = new JTextField();
		frmThings.getContentPane().add(textAge, "cell 1 1,growx");
		textAge.setColumns(10);
		
		JLabel lblGazebo = new JLabel("Gazebo:");
		frmThings.getContentPane().add(lblGazebo, "cell 0 2,alignx trailing");
		
		JComboBox<String> comboGazebo = new JComboBox<>();
		comboGazebo.addItem("Blah");
		comboGazebo.addItem("Blat");
		comboGazebo.addItem("Biff");
		frmThings.getContentPane().add(comboGazebo, "cell 1 2,growx");
		
		JLabel lblSpleen = new JLabel("Spleen:");
		frmThings.getContentPane().add(lblSpleen, "cell 1 3");
		
		JTextArea textAreaSpleen = new JTextArea();
		frmThings.getContentPane().add(textAreaSpleen, "cell 1 4,grow");
		
		JPanel panel = new JPanel();
		frmThings.getContentPane().add(panel, "cell 1 5,grow");
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnOk = new JButton("Ok");
		panel.add(btnOk);
		SwingUtilities.getRootPane(btnOk).setDefaultButton(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		panel.add(btnCancel);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Demo();
	}

}
