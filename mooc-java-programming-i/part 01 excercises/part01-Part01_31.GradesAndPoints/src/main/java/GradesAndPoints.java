
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int mark=scan.nextInt();

        if (mark < 0) {
            System.out.println("Grade: impossible!");
        } else if (mark >= 0 && mark <= 49) {
            System.out.println("Grade: failed");
        } else if (mark >= 50 && mark <= 59) {
            System.out.println("Grade: 1");
        } else if (mark >= 60 && mark <= 69) {
            System.out.println("Grade: 2");
        } else if (mark >= 70 && mark <= 79) {
            System.out.println("Grade: 3");
        } else if (mark >= 80 && mark <= 89) {
            System.out.println("Grade: 4");
        } else if (mark >= 90 && mark <= 100) {
            System.out.println("Grade: 5"); 
        } else {
            System.out.println("Grade: incredible!");
        }

    }
}
