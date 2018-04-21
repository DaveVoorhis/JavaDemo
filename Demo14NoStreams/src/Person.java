
public class Person implements Comparable<Person> {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return getName();
	}

	@Override
	public int compareTo(Person other) {
		return getName().compareTo(other.getName());
	}
	
	public boolean equals(Object other) {
		return compareTo((Person)other) == 0;
	}
	
	public int hashCode() {
		return getName().hashCode();
	}
}
