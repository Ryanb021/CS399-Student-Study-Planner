public class Course {

    // Variables to store course information
    private String courseName;
    private String courseCode;

    // Constructor to create new course
    public Course(String name, String code) {
        courseName = name;
        courseCode = code;
    }

    // Method to get the course name
    public String getCourseName() {
        return courseName;
    }

    // Method to get the coure code
    public String getCourseCode() {
        return courseCode;
    }

    // Method to display course information
    public void displayCourse() {
        System.out.println(courseCode + " - " + courseName);
    }
}
