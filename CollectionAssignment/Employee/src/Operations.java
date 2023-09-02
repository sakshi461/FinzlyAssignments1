import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations {
	
	public static void main(String[] args) {
		List<Employee> al = new ArrayList<>();
		Employee e1 = new Employee("sakshi ",22,101);
		Employee e2 = new Employee("Sumit",24,102);
		al.add(e1);
		al.add(e2);

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nEmployee Management System");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee Details");
			System.out.println("3. Search Employee by ID");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			String input = sc.next();
			switch (input) {
			case "1":
				System.out.println("Enter employee Id: ");
				int id = sc.nextInt();
				System.out.println("Enter employee name: ");
				String name = sc.next();
				System.out.println("Enter the age of employee");
				int age=sc.nextInt();
				
				Employee employee = new Employee(name,age,id);
				al.add(employee);
				System.out.println("Employee added succesfully!!!");
				break;
			case "2":
				System.out.println("Employee Details");
				for (Employee emp : al) {
					System.out.println(emp);
				}
				break;
			case "3":
				System.out.println("Enter employe Id to search details ");
				int search = sc.nextInt();
				boolean bool = false;
				for (Employee emp : al) {
					if (emp.getEmpId() == search) {
						System.out.println("Employee found: " + emp);
						bool = true;
						break;
					}
				}
				if (!bool) {
					System.out.println("Employee with ID " + search + " not found.");
				}
				break;
			case "4":
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please select a valid option.");
				break;
			}
			
		}
	}
}

    
	
