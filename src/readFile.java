// Java program to illustrate reading data from file
// using nio.File
import java.io.*;

public class readFile 
{
      // Main method
    public static void main(String[] args)
      throws IOException
    {      
        BufferedReader br; // Declaring BufferedReader
          try {
           br = new // Creating BufferedReader object
            BufferedReader(new FileReader("student.txt")); // Name of file to open
            // Delcaring strings to store data
            String firstName = br.readLine();
            String lastName = br.readLine();
            String grade = br.readLine();
            String nameSchool = br.readLine();
            
            // Checking for null values
            if (firstName == null || lastName == null || grade == null || nameSchool == null) { // Check if any data is missing 
              System.out.println("File is missing some data that was prompted. It will be listed as 'null'. Please enter the missing data in the file and try again.");
            } else;
{
}
            // Printing data
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("Grade: " + grade);
            System.out.println("Name of school: " + nameSchool);
            br.close(); // Closing BufferedReader
            // Catching exceptions
          } catch (FileNotFoundException e) {
            System.out.println("File not found. Make sure the file is one directory above the Java file."); // Print error message if there is a FileNotFoundException
          } catch (IOException e) {
            System.out.println("An IOException error occurred."); // Print error message if there is an IOException
    }
  }
}
