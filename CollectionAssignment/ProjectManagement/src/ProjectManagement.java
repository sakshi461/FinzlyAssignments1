import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProjectManagement {
public static void main(String[] args) {
	
	 Scanner scanner = new Scanner(System.in);
     Map<String, Project> projects = new HashMap<>();

     while (true) {
         System.out.println("Project Management System");
         System.out.println("1. Add Project");
         System.out.println("2. Assign Team Member");
         System.out.println("3. View Project Details");
         System.out.println("4. List All Projects");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         scanner.nextLine(); // Consume newline

         switch (choice) {
             case 1:
                 System.out.print("Enter project name: ");
                 String projectName = scanner.nextLine();
                 System.out.print("Enter project description: ");
                 String description = scanner.nextLine();
                 Project project = new Project(projectName,description);
                 projects.put(projectName, project);
                 System.out.println("Project added successfully!");
                 break;

             case 2:
                 System.out.print("Enter project name: ");
                 String projectNameForAssignment = scanner.nextLine();
                 if (projects.containsKey(projectNameForAssignment)) {
                     Project assignProject = projects.get(projectNameForAssignment);
                     System.out.print("Enter team member name: ");
                     String teamMember = scanner.nextLine();
                     assignProject.addTeamMembers(teamMember);
                     System.out.println("Team member assigned successfully!");
                     System.out.println();
                 } else {
                     System.out.println("Project not found.");
                 }
                 break;

             case 3:
                 System.out.print("Enter project name: ");
                 String viewProjectName = scanner.nextLine();
                 if (projects.containsKey(viewProjectName)) {
                     System.out.println("project is :"+projects.get(viewProjectName));
                     System.out.println();
                 } else {
                     System.out.println("Project not found.");
                 }
                 break;

             case 4:
                 for (Project p : projects.values()) {
                     System.out.println(p.getProjectName());
                 }
                 break;

             case 5:
                 System.out.println("Exiting program. Goodbye!");
                 scanner.close();
                 System.exit(0);
                 break;

             default:
                 System.out.println("Invalid choice. Please choose again.");
       
         }
	
	
         }	
}
}
