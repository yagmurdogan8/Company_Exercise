public abstract class Employee extends Person {

	// Do not change anything in this class

	protected int yearOfSeniority;


	public Employee() {

	}
	public Employee(String name, int yearOfSeniority) {

		this.name = name;
		this.yearOfSeniority = yearOfSeniority;
		number++;
	}


}
