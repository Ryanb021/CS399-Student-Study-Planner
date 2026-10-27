import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Create Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Create ArrayList to store courses
        ArrayList<Course> courses = new ArrayList<>();

        // Store user' menu choice
        int choice = 0;

        // Display the menu until the user exits
        while (choice != 6) {

            System.out.println();
            System.out.println("===== Student Study Planner =====");
            System.out.println("1. Add Class");
            System.out.println("2. Add Assignment");
            System.out.println("3. View Assignments");
            System.out.println("4. Mark Assignment Complete");
            System.out.println("5. Remove Assignment");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");

            // Check if the user entered a number
            if (input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine(); // Clear leftover line
            } else {
                System.out.println("Please enter a number.");
                input.next();
                continue;
            }

            // Check the user's menu choice
            switch (choice) {

                case 1:

                    // Ask for course information
                    System.out.print("Enter course name: ");
                    String name = input.nextLine();

                    System.out.print("Enter course code: ");
                    String code =  input.nextLine();

                    // Create new Course object
                    Course newCourse = new Course(name, code);

                    // Add the course to the ArrayList
                    courses.add(newCourse);

                    System.out.println("Course added succcessfully!");

                    // Display all courses
                    System.out.println();
                    System.out.println("Your Courses: ");

                    for (Course course : courses) {
                        course.displayCourse();
                    }

                    break;

                case 2:
                    System.out.println("Add Assignment selected.");
                    break;

                case 3:
                    System.out.println("View Assignments selected.");
                    break;

                case 4:
                    System.out.println("Mark Complete selected.");
                    break;

                case 5:
                    System.out.println("Remove Assignment selected.");
                    break;

                case 6:
                    System.out.println("Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        input.close();
    }
}