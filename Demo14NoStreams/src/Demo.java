import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		Person lindsey = new Person("Lindsey", 34);
		Person hilary = new Person("Hilary", 44);
		Person ashley = new Person("Ashley", 22);
		Person robin = new Person("Robin", 12);
		Person sam = new Person("Sam", 33);
		
		List<Sale> sales = new LinkedList<>();
		sales.add(new Sale(lindsey, 3.00));
		sales.add(new Sale(hilary, 14.95));
		sales.add(new Sale(ashley, 13.12));
		sales.add(new Sale(robin, 0.95));
		sales.add(new Sale(hilary, 22.99));
		sales.add(new Sale(sam, 10.50));
		sales.add(new Sale(ashley, 12.25));
		sales.add(new Sale(lindsey, 6.00));
		sales.add(new Sale(lindsey, 2.99));
		
		// The requirement is for PersonPicker to pick from a list of Person instances where the
		// Person's total sales are greater than 20 or Person's age < 18, and the Person instances
		// must be sorted by name.
		
		// Create dictionary of totals
		HashMap<Person, Double> totals = new HashMap<>();
		for (Sale sale: sales) {
			Double currentTotal = totals.get(sale.getPerson());
			if (currentTotal == null)
				totals.put(sale.getPerson(), sale.getAmount());
			else
				totals.put(sale.getPerson(), currentTotal + sale.getAmount());
		}

		// Obtain Person instances where sales are greater than 20 or where person's age is < 18
		List<Person> peopleToPickFrom = new LinkedList<>();
		Set<Entry<Person, Double>> salesTotals = totals.entrySet();
		for (Entry<Person, Double> entry: salesTotals) {
			Person person = entry.getKey();
			Double totalSales = entry.getValue();
			if (totalSales > 20.0 || person.getAge() < 18)
				peopleToPickFrom.add(person);
		}
		
		// Sort the people to pick from
		Collections.sort(peopleToPickFrom);
		
		PersonPicker picker = new PersonPicker(peopleToPickFrom);
		System.out.println(picker.getSelectedPerson());
		
		System.exit(0);
	}

}
