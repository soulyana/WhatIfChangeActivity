import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        String fname, lname, status;
        double gpa;
        int credits;


        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Student's First Name? " );
        fname = keyboard.next();

        System.out.print( "Student's Last Name? " );
        lname = keyboard.next();

        System.out.print( "Student's GPA? " );
        gpa = keyboard.nextDouble();

        System.out.print( "Student's Current Course Load? (Credits) " );
        credits = keyboard.nextInt();

        if(credits > 12) {

            System.out.println();
            System.out.println("Student Name :" + fname + " " + lname);
            System.out.println("Student GPA :" + gpa);
            if (gpa >= 3) {
                System.out.println("This student is in good standing.");
            } else if (gpa >= 2) {
                System.out.println("This student needs to study more.");
            } else if (gpa >= 1) {
                System.out.println("This student is on academic probation.");
            } else {
                System.out.println("This student has been expelled.");
            }
        } else {
            System.out.println("This student's record is unavailable at this time because they're not a full-time "
                    + " student. Please check with the Registrar's office for further information.");
    }
}
}
