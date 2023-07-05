package st10092251poepart2;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
//import static st10092251poepart2.St10092251POEPart2.TaskDescription;
//import static st10092251poepart2.St10092251POEPart2.menu;
//import static st10092251poepart2.St10092251POEPart2.task_num;

public class TaskClass {

    // declare variables 
    public static String TaskName;
    public static int TaskNumber;
    public static int TaskDescription;
    public static String TaskID;
    public static String TaskDeveloper;
    public static int TaskDuration;
    public static int TotalDuration;
    public static int DeveloperDetails;
    //First and last name of developer
    public static double TaskStatus;
    public static int option;
    public static int totalTasks;
    // Declaring arrays
    public static String dev[];
    public static String ID[];
    public static String name[];
    public static int duration[];
    public static double status[];

    public static String getTaskName() {
        return TaskName;
    }

    public static void setTaskName(String TaskName) {
        TaskClass.TaskName = TaskName;
    }

    public static int getTaskNumber() {
        return TaskNumber;
    }

    public static void setTaskNumber(int TaskNumber) {
        TaskClass.TaskNumber = TaskNumber;
    }

    public static int getTaskDescription() {
        return TaskDescription;
    }

    public static void setTaskDescription(int TaskDescription) {
        TaskClass.TaskDescription = TaskDescription;
    }

    public static String getTaskID() {
        return TaskID;
    }

    public static void setTaskID(String TaskID) {
        TaskClass.TaskID = TaskID;
    }

    public static String getTaskDeveloper() {
        return TaskDeveloper;
    }

    public static void setTaskDeveloper(String TaskDeveloper) {
        TaskClass.TaskDeveloper = TaskDeveloper;
    }

    public static int getTaskDuration() {
        return TaskDuration;
    }

    public static void setTaskDuration(int TaskDuration) {
        TaskClass.TaskDuration = TaskDuration;
    }

    public static int getTotalDuration() {
        return TotalDuration;
    }

    public static void setTotalDuration(int TotalDuration) {
        TaskClass.TotalDuration = TotalDuration;
    }

    public static int getDeveloperDetails() {
        return DeveloperDetails;
    }

    public static void setDeveloperDetails(int DeveloperDetails) {
        TaskClass.DeveloperDetails = DeveloperDetails;
    }

    public static double getTaskStatus() {
        return TaskStatus;
    }

    public static void setTaskStatus(double TaskStatus) {
        TaskClass.TaskStatus = TaskStatus;
    }

    public static int getOption() {
        return option;
    }

    public static void setOption(int option) {
        TaskClass.option = option;
    }

    // methods
    public static boolean taskdescription() {
        if (TaskDescription < 50) {
            if (TaskDescription > 50) {
                JOptionPane.showMessageDialog(null, "Please enter a task "
                        + "description of less than 50 characters");
            }
        } else if (TaskDescription < 50) {
            JOptionPane.showMessageDialog(null, "Task Successfully Captured");
            menu();
        }

        return true;

    }

    public static String menu() {
        //Make application perform the following functions, for each task 
        //performed:
        return JOptionPane.showInputDialog(null, "Welcome to EasyKanban "
                + "\n Please "
                + "choose one of the following: \n Option 1) Add tasks \n"
                + "Option 2) Show report \n"
                + "Option 3) Quit", option);
    }

    public static void user() {

        //Option 1:
        TaskNumber = parseInt(JOptionPane.showInputDialog(null, "How many "
                + "tasks "
                + "would you like to add?"));
        //int task_num= Keyboard.hashCode();
        for (int i = 0; i < TaskNumber; i++) {
            JOptionPane.showInputDialog(null, "Please enter the task name"
                    + TaskName);
            JOptionPane.showInputDialog(null, "Please enter the task number"
                    + TaskNumber);
            JOptionPane.showInputDialog(null, "Please enter the task "
                    + "description" + TaskDescription);
            taskdescription();
            menu();
        }
    }

    public static void ComingSoon() {
        //Option 2:
        JOptionPane.showMessageDialog(null, "Coming Soon");
        menu();

    }

    public static void Quit() {
        //Option 3:
        JOptionPane.showMessageDialog(null, "Quit");
    }

    public boolean checkTaskDescription(String description) {
        if ((description.length() <= 50)) {
            return true;
        } else {
            return false;
        }
    }

    public String printTaskDetails() {
        String strDisplay = "";

        strDisplay = "ID:              " + TaskID + "\n"
                + "Name:            " + TaskName + "\n"
                + "Description:     " + TaskDescription + "\n"
                + "Duration:        " + TaskDuration + "\n"
                + "Developer:       " + TaskDeveloper + "\n"
                + "Status           " + TaskStatus + "\n";
        return strDisplay;
    }

    public int returnTotalHours(int duration) {
        return (TotalDuration += duration);

    }

    public static void display() {

        for (int i = 0; i < TaskNumber; i++) {
            // STEP 3 displaying the array
            JOptionPane.showMessageDialog(null, "Task Developer" + dev[i]);
            JOptionPane.showMessageDialog(null, "Task name" + name[i]);

            JOptionPane.showMessageDialog(null, "Task ID" + ID[i]);

            JOptionPane.showMessageDialog(null, "Task Duration" + duration[i]);

            JOptionPane.showMessageDialog(null, "Task Status" + status[i]);

        }
    }

    public static void Array() {
       totalTasks = Integer.parseInt(JOptionPane.showInputDialog(null,"What is the size ofyour array"));

        for (int i = 0; i < totalTasks; i++) {
            // STEP 2 Adding elements to the array
            TaskDeveloper = JOptionPane.showInputDialog(null, "Dev name");
            TaskDeveloper = dev[i];
            
            TaskName = JOptionPane.showInputDialog(null, "Task Name");
            TaskName = name[i];
            TaskID = JOptionPane.showInputDialog(null, "Task ID" );
            TaskID = ID[i];
            TaskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Task Duration" ));
            TaskDuration = duration[i];
            TaskStatus = Double.parseDouble(JOptionPane.showInputDialog(null, "Task Status" ));
            TaskStatus = status[i];
        }
    }
}
