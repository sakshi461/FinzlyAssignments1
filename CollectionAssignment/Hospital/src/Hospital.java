import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hospital {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
    Map<Integer,Patient>patients = new HashMap<>();

   while(true)
{
	  System.out.println("Hospital Management System");
      System.out.println("1. Add Patient");
      System.out.println("2. View Patient Details");
      System.out.println("3. Search Patient by ID");
      System.out.println("4. List All Patients");
      System.out.println("5. Exit");
      System.out.print("Enter your choice: ");
      int choice = s.nextInt();
      

      switch (choice) {
          case 1:
              System.out.print("Enter patient ID: ");
              int id = s.nextInt();
              s.nextLine(); // Consume newline
              System.out.print("Enter patient name: ");
              String name = s.nextLine();
              System.out.print("Enter patient age: ");
              int age = s.nextInt();
              Patient patient = new Patient(name ,age,id);
              patients.put(id, patient);
              System.out.println("Patient added successfully!");
              System.out.println();
              break;

          case 2:
              System.out.print("Enter patient ID: ");
              int viewId = s.nextInt();
              if (patients.containsKey(viewId)) {
                  System.out.println(patients.get(viewId));
              } else {
                  System.out.println("Patient not found.");
              }
              break;

          case 3:
              System.out.print("Enter patient ID: ");
              int searchId = s.nextInt();
              if (patients.containsKey(searchId)) {
                  System.out.println(patients.get(searchId));
              } else {
                  System.out.println("Patient not found.");
              }
              break;

          case 4:
              for (Patient p : patients.values()) {
                  System.out.println(p);
              }
              break;

          case 5:
              System.out.println("Exiting program. Goodbye!");
              s.close();
              System.exit(0);
              break;

          default:
              System.out.println("Invalid choice. Please choose again.");
           
              
              
           }        
      }
 }

}


