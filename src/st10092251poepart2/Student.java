public class Student {
    
    // Declare variables
    public static String name;
    public static String surname;
    public static String ID;
    public static String courseCode;
    public static int result;
    public static int NumOfStudents;
    
    // STEP 1: Declare Arrays:
    String[] stName;
    String[] stSurname;
    String[] stID;
    String[] stCourseCode;
    int[] stResult;

    //Getters and Setters
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname) {
        Student.surname = surname;
    }

    public static String getID() {
        return ID;
    }

    public static void setID(String ID) {
        Student.ID = ID;
    }

    public static String getCourseCode() {
        return courseCode;
    }

    public static void setCourseCode(String courseCode) {
        Student.courseCode = courseCode;
    }

    public static int getResult() {
        return result;
    }

    public static void setResult(int result) {
        Student.result = result;
    }

    void AddstudentsToArray() {
        for (int i = 0; i < NumOfStudents; i++) {
            System.out.println("Name:");
            String studentName = stName[i];
            
            System.out.println("Surname:");
            String studentSurname = stSurname[i];
            
            System.out.println("ID:");
            String studentID = stID[i];
            
            System.out.println("Course Code:");
            String studentCC = stCourseCode[i];
            
            System.out.println("Result");
            int studentResult = stResult[i];
            
        }
    }
    public static int getNumOfStudents() {
        return NumOfStudents;
    }

    public static void setNumOfStudents(int NumOfStudents) {
        Student.NumOfStudents = NumOfStudents;
    }
   
    
}
