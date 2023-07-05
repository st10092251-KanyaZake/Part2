package st10092251poepart2;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Scanner;
//import static st10092251poepart2.St10092251POEPart2.TaskDescription;
//import static st10092251poepart2.St10092251POEPart2.menu;
//import static st10092251poepart2.St10092251POEPart2.task_num;

public class TaskClass {

    //declare variables    
    public static String TaskName;
    public static int TaskNumber;
    public static int TaskDescription;
    //Condition: Should not exceed 50 characters in length.
    public static String TaskID;
    public static String TaskDeveloper;
    public static int TaskDuration;
    public static int TotalDuration;
    public static int DeveloperDetails;
    //First and last name of developer
    public static double TaskStatus;
    public static int option;
    public static int NumOfTasks;
    //  STEP 1 Declare arrays:
    // developer
    public static String[] dev;
    // task name
    // task ID
    // task duration 
    // task status

//getter and setter
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
        //Make application perform the following functions, for each task performed:
        return JOptionPane.showInputDialog(null, "Welcome to EasyKanban "
                + "\n Please "
                + "choose one of the following: \n Option 1) Add tasks \n"
                + "Option 2) Show report \n"
                + "Option 3) Quit", option);
    }

    public static void user() {
// ************
        //Option 1:
        TaskNumber = parseInt(JOptionPane.showInputDialog(null, "How many tasks "
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

    private static void displayAddress() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
            JOptionPane.showMessageDialog(null, "Task name" + TaskName);
            JOptionPane.showMessageDialog(null, "Task number" + TaskNumber);
            JOptionPane.showMessageDialog(null, "Task description" + TaskDescription);
        }
    }

    public static void developernames() {
        displayAddress();
        // STEP 2 Add data to the array
        for (int i = 0; i < NumOfTasks; i++) {
        JOptionPane.showInputDialog(null, "Please enter the developer's names"
                + TaskDeveloper);
           TaskDeveloper = dev[i];
        JOptionPane.showInputDialog(null, "Please enter the task names"
                + TaskName);
        JOptionPane.showInputDialog(null, "Please enter the task ID" + TaskID);
        JOptionPane.showInputDialog(null, "Please enter the task duration"
                + TaskDuration);
        JOptionPane.showInputDialog(null, "Please enter the task status"
                + TaskStatus);
            
        }

    }

    public static void Arrays() {
        for (int i = 0; i < NumOfTasks; i++) {
            JOptionPane.showMessageDialog(null, "Name>> " + dev[i]);
            
        }
    }
}
