public class Test {
	
	// Do not change anything in this class
	
	public static void main(String[] args) {
		
		int score = 0;
		
		Department d1 = new SoftwareDevelopment("Android", 30);
		Department d2 = new SoftwareDevelopment("Java", 25);
		Department d3 = new SoftwareDevelopment(".NET", 27);
		Department d4 = new SoftwareDevelopment("IOS", 27);
		
		SoftwareDeveloper s1 = new SoftwareDeveloper("Bob", 8,"ElektroAndroid",d1);
		SoftwareDeveloper s2 = new SoftwareDeveloper("Jane", 3, "Engineering Unit Converter",d3);
		SoftwareDeveloper s3 = new SoftwareDeveloper("David", 4, "Library Otomation",d2);
		SoftwareDeveloper s4 = new SoftwareDeveloper("Bill", 7,  "Calculator",d4);
		SoftwareDeveloper s5 = new SoftwareDeveloper("John", 8,"ElektroAndroid",d1);
		SoftwareDeveloper s6 = new SoftwareDeveloper("Tom", 10, "Calculator",d4);
		SoftwareDeveloper s7 = new SoftwareDeveloper("Michael", 9, "Web Design",d3);

		if (SoftwareDeveloper.getNumber() == 7) {
			score += 10;
		}
		if (SoftwareDevelopment.getNumber() == 4) {
			score += 10;
		}
		if (s1.equals(s5)) {
			score += 20;
		}
		if (s3.toString().equals("David@Java-P:Library Otomation-S:4")) {
			score += 15;
		}
		if (d3.equals(d3)) {
			score += 20;
		}
		if (d3.toString().equals(".NET/number of worker : 27")) {
			score += 15;
		}
		if (s6.calculateSalary() == 5000.0) {
			score += 10;
		}
				
		System.out.println("your grade is " + score);
		
	}
	
}
