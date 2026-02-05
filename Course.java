
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course {
    private String courseCode;
    private String courseName;
    private String instructorName;
    private int creditHours;
    private int maxCapacity;
    private int enrolledStudents;
    private boolean isActive;

    public Course(){
        this.courseCode = "UNKNOWN";
        this.courseName = "unknown course";
        this.instructorName = " ";
        this.creditHours = 0;
        this.maxCapacity = 0;
        this.enrolledStudents = 0;
        this.isActive = true;
    }

    public Course(String courseCode,String courseName,int creditHours,int maxCapacity){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = 0;
        this.isActive = true;
    }

    public String getCourseCode(){
        return courseCode; }
    public String getCourseName(){
        return courseName; }
    public int getCreditHours(){
        return creditHours; }
    public int getMaxCapacity(){ 
        return maxCapacity; }
    public int getEnrolledStudents(){
        return enrolledStudents; }
    public boolean getIsActive(){
        return isActive; }

    public void setCreditHours(int creditHours){
        if (creditHours >=1 && creditHours <=6){
            this.creditHours = creditHours;
        }
    }

    public void setMaxCapacity(int maxCapacity){
        if (maxCapacity > 0){
            this.maxCapacity = maxCapacity;
        }
    }

    public void assignInstructor(String name){
        this.instructorName = name;
    }

    public boolean enrollStudent(){
        if (isActive && enrolledStudents < maxCapacity){
            enrolledStudents++;
            return true;
        }
        return false;
    }

    public void dropStudent(){
        if (enrolledStudents > 0){
            enrolledStudents--;
        }
    }

    public int getAvailableSeats(){
        return maxCapacity - enrolledStudents;
    }

    public boolean isFull(){
        return enrolledStudents == maxCapacity;
    }

    public void cancelCourse(){
        if (enrolledStudents == 0){
            isActive = false;
        }
    }

    public void displayCourseInfo(){
        System.out.println("courseCode: " + courseCode);
        System.out.println("courseName: " + courseName);
        System.out.println("maxCapacity: " + maxCapacity);
        System.out.println("instructor: " + instructorName);
        System.out.println("creditHours: " + creditHours);
        System.out.println("enrolledStudents: " + enrolledStudents);
        System.out.println("isActive: " + isActive);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Course c1 = new Course("CT78", "OOP", 8, 34);
        c1.assignInstructor("Dr Mbeumo");
        c1.enrollStudent();
        c1.enrollStudent();
        c1.displayCourseInfo();

        Course c2 = new Course("CS101", "Computing", 3, 1);
        c2.assignInstructor("Ms Cunha");
        c2.enrollStudent();
        c2.displayCourseInfo();
    }
}
