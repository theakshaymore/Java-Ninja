package day10_GA;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Akshay", 7000.90);
		Employee e2 = new Employee(8, "Rohit", 6000.78);
		Employee e3 = new Employee(3, "Sai", 5000.00);
		Employee e4 = new Employee(9, "latha", 5900.98);

		CollectionMap collectionMap = new CollectionMap();
		System.out.println(collectionMap.addEmployee(e1) == 0 ? e1.getId() + " Employee Added" : "Error"); 
		System.out.println(collectionMap.addEmployee(e2) == 0 ? e2.getId() + " Employee Added" : "Error");
		System.out.println(collectionMap.addEmployee(e3) == 0 ? e3.getId() + " Employee Added" : "Error");
		System.out.println(collectionMap.addEmployee(e4) == 0 ? e4.getId() + " Employee Added" : "Error");
		System.out.println(collectionMap.addEmployee(null) == 0 ? "Employee Added" : "Error / duplicate entry");
		System.out.println(collectionMap.addEmployee(e1) == 0 ? "Employee Added" : "Error / duplicate entry");


		System.out.println("========================================");
		System.out.println("Employee List:");
		System.out.println(collectionMap.getEmployeeList());

		System.out.println("============================================");
		System.out.println("Find employee:");
		//case 1
		if(collectionMap.findEmployee(1) == null){
			System.out.println("Employee not found");
		}else{
			System.out.println("Found: " + collectionMap.findEmployee(1));
		}
		//case 2
		if(collectionMap.findEmployee(7) == null){
			System.out.println("Employee not found");
		}else{
			System.out.println("Found: " + collectionMap.findEmployee(7));
		}

		System.out.println("===================================================");
		System.out.println("Remove employees:");
		//case 1
		if(collectionMap.removeEmployee(7) == 2){
			System.out.println("Employee not found");
		}else{
			System.out.println("Removed Succesfully"); 
		}
		//case 2
		if(collectionMap.removeEmployee(9) == 2){
			System.out.println("Employee not found");
		}else{
			System.out.println("Removed Succesfully"); 
		}


		System.out.println("===========================");
		System.out.println("Final List: \n" + collectionMap.getEmployeeList());

	}
}
