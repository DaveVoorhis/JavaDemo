import java.util.LinkedList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Person> people = new LinkedList<>();
		people.add(new Person("Lindsey", 34));
		people.add(new Person("Hilary", 44));
		people.add(new Person("Ashley", 22));
		people.add(new Person("Robin", 12));
		
		PersonPicker picker = new PersonPicker(people);
		System.out.println(picker.getSelectedPerson());
		
		System.exit(0);
	}

}
