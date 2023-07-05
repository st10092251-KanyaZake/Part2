package st10092251poepart2;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import static st10092251poepart2.TaskClass.TaskNumber;

public class St10092251POEPart2 {

    public static int option;

    public static void main(String[] args) {
        LoginClass ln = new LoginClass();
        ln.registeruser();
        ln.checkusername();
        ln.passwordverification();
        ln.loginuser();

        TaskClass tc = new TaskClass();
        JOptionPane.showInputDialog(null, "Welcome to EasyKanban "
                + "\n Please "
                + "choose one of the following: \n Option 1) Add tasks \n"
                + "Option 2) Show report \n"
                + "Option 3) Quit");
        JOptionPane.showInputDialog(null, "Please enter the task number"
                    + option);
        //   tc.menu();
        option = parseInt(tc.menu());
        if (option == 1) {
            tc.user();
        } else if (option == 2) {
            tc.ComingSoon();
        } else if (option == 3) {
            tc.Quit();
        }

    } // end of main method

}
