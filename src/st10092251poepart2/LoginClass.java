package st10092251poepart2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class LoginClass {

    String username;
    String password;
    String fname, lname;
    Scanner UN = new Scanner(System.in);
//Login details feature
    public void registeruser() {
        //The register feature will be found here
        //RegisterUser obj = new RegisterUser();
        
        int arraySize = Integer.parseInt(JOptionPane.showInputDialog
        ("What is the size of your array"));
        
        int[] myValues = new int[arraySize];
        
        for (int i = 0; i < 10; i++)
        {
            myValues[i] = Integer.parseInt(JOptionPane.showInputDialog
        ("Enter an Integer"));
        }
        
        //JOptionPane.showMessageDialog(null,"The maximum number is " 
             //   + obj.max(myValues));
        
        //JOptionPane.showMessageDialog(null,"The minimum number is " 
          //      + obj.min(myValues));
        
        System.out.println("Enter your first name");
        fname = UN.nextLine();
        System.out.println("Enter your last name");
        lname = UN.nextLine();
    }
//Login details
    public void checkusername() {
        System.out.println("Please enter your username");
        username = UN.nextLine();

        if (usernameverification(username)) {
            System.out.println("Username successfully captured");
        } else {
            System.out.println("Username incorrectly formatted, please ensure "
                    + "your username contains an underscore and is no longer"
                    + " than 5 characters long.");
        }

    }
//Username verification and conditions
    public static boolean usernameverification(String UName) {
        return UName.length() <= 5 && UName.contains("_");
    }

    public static void Application(String[] args) {
//Welcome message for application
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
    }
//Password feature
    public void passwordverification() {
        System.out.println("Please enter a password");
        password = UN.nextLine();
//Boolean to check wether or not the password meets the correct complexity 
//requirements using CLI
        if (checkpasswordcomplexity(password)) {
            System.out.println("Password successfully entered!");
        } else {
            System.out.println("Password incorrectly formatted, please ensure "
                    + "password contains at least 8 characters, a capital "
                    + "letter, a number and a special character.");
        }
    }
//Password complexity requirements
    public static boolean checkpasswordcomplexity(String PWord) {
        Pattern sp = Pattern.compile("[a-zA-Z0-9]*");
        Matcher pm = sp.matcher(PWord);
        return PWord.length() >= 8 && !pm.matches();
    }
//Login user again using the username
    public boolean loginuser() {
        String userN, passW;
        System.out.println("Please re-enter username,for security "
                + "purposes");
        userN = UN.nextLine();
//Login the user again using CLI
        System.out.println("Please re-enter password, for security "
                + "purposes");
        passW = UN.nextLine();
//Boolean to welcome the user using CLI feature
        if (userN.equals(username) && passW.equals(password)) {
            System.out.println("Welcome, it is great to see you again. "
                    + "Your login was successful.");
            return true;
//Boolean to show the incorrect login feature usage
        } else {
            System.out.println("Your login failed due to an incorrect password "
                    + "or username, please try again.");
            return false;
        }
    }

}
