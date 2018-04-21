
public class Sale {

	private Person person;
	private double amount;
	
	public Sale(Person person, double amount) {
		setPerson(person);
		setAmount(amount);
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public String toString() {
		return person.toString() + ": " + getAmount();
	}
}
