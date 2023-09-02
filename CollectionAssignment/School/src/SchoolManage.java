import java.util.ArrayList;
import java.util.Scanner;

public class SchoolManage {
	public static void main(String[] args) {
		
     ArrayList<Student>students=new ArrayList<>();
    ArrayList<Teacher>teachers=new ArrayList<>();
	Scanner s =new Scanner(System.in);
	while(true)
	{
		  System.out.println("\nSchool Management System");
          System.out.println("1. Add Student");
          System.out.println("2. Add Teacher");
          System.out.println("3. Display Students");
          System.out.println("4. Display Teachers");
          System.out.println("5. Exit");
          System.out.print("Enter your choice: ");
          int choice = s.nextInt();

          switch (choice) {
          case 1:
              s.nextLine(); 
              System.out.print("Enter Student Name: ");
              String studentName = s.nextLine();
              System.out.print("Enter Student ID: ");
              int studentId = s.nextInt();

              Student student = new Student(studentName,  studentId);
              students.add(student);
              System.out.println("Student added successfully!");
              break;
              
          case 2:
        	  s.nextLine(); // Consume the newline
              System.out.print("Enter Teacher Name: ");
              String teacherName = s.nextLine();
              System.out.print("Enter Teacher Age: ");
              int teacherAge = s.nextInt();
              s.nextLine(); // Consume the newline
              System.out.print("Enter Subject: ");
              String subject = s.nextLine();

              Teacher teacher = new Teacher(teacherName, subject, teacherAge);
              teachers.add(teacher);
              System.out.println("Teacher added successfully!");
              break;
  
          case 3:
              System.out.println("List of Students:");
              for (Student stu : students) {
                  System.out.println(stu);
              }
              break;

          case 4:
              System.out.println("List of Teachers:");
              for (Teacher tea : teachers) {
                  System.out.println(tea);
              }
              break;

          case 5:
              System.out.println("Exiting program.");
              s.close();
              System.exit(0);

          default:
              System.out.println("Invalid choice. Please select a valid option.");
      
      
          }
	}
	
	}
}
