import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class writeString {
    public static void main(String[] args) {
        String fileName = "student.txt";

        Scanner scn = new Scanner(System.in);
        String firstName; // Declaring a string variable to store the first name
        String lastName; // Declaring a string variable to store the last name
        String yearSchool; // Declaring a string variable to store the year in school
        String nameSchool; // Declaring a string variable to store the name of the school

        System.out.println("Enter your first name: ");
        firstName = scn.nextLine(); // Reading the first name from the user
        System.out.println("Enter your last name: ");
        lastName = scn.nextLine(); // Reading the last name from the user
        System.out.println("Enter the year in school: ");
        yearSchool = scn.nextLine(); // Reading the year in school from the user
        System.out.println("Enter the name of your school: ");
        nameSchool = scn.nextLine(); // Reading the year in school from the user
        try {
            BufferedWriter f_writer = new BufferedWriter(new FileWriter(fileName));
            f_writer.write(firstName);
            f_writer.write("\n");
            f_writer.write(lastName);
            f_writer.write("\n");
            f_writer.write(yearSchool);
            f_writer.write("\n");
            f_writer.write(nameSchool);
            scn.close();
            f_writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}