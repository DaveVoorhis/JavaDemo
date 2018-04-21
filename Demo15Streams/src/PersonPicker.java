import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPanel;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;

/** Dialog box for picking a Person. */
public class PersonPicker {

	private JDialog frmThings;
	private List<Person> people;
	private Person pickedPerson;

	/**
	 * Construct and display person selection dialog box.
	 */
	public PersonPicker(List<Person> people) {
		this.people = people;
		pickedPerson = null;
		initialize();
		frmThings.setVisible(true);
	}

	public Person getSelectedPerson() {
		return pickedPerson;
	}
	
	/**
	 * Initialize the contents of the dialog box.
	 */
	private void initialize() {
		frmThings = new JDialog(null, "Pick a Person", Dialog.ModalityType.APPLICATION_MODAL);
		frmThings.getContentPane().setLayout(new MigLayout("", "[][grow]", "[][]"));
		
		JLabel lblPerson = new JLabel("Person:");
		frmThings.getContentPane().add(lblPerson, "cell 0 0,alignx trailing");
		
		JComboBox<Person> comboPerson = new JComboBox<>();
		comboPerson.setEditable(false);
		for (Person person: people)
			comboPerson.addItem(person);
		frmThings.getContentPane().add(comboPerson, "cell 1 0,growx");
		
		JPanel panel = new JPanel();
		frmThings.getContentPane().add(panel, "cell 1 1,grow");
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnOk = new JButton("Ok");
		panel.add(btnOk);
		// set default button
		SwingUtilities.getRootPane(btnOk).setDefaultButton(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		panel.add(btnCancel);
		
		frmThings.pack();
		
		btnOk.addActionListener(event -> {
			int index = comboPerson.getSelectedIndex();
			if (index >= 0)
				pickedPerson = comboPerson.getItemAt(index);
			else
				pickedPerson = null;
			frmThings.setVisible(false);
		});
		
		btnCancel.addActionListener(event -> {
			pickedPerson = null;
			frmThings.setVisible(false);
		});
	}

}
