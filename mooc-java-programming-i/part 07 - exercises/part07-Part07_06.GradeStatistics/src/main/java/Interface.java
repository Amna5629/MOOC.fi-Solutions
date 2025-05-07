import java.util.Scanner;

public class Interface {
    private Scanner scanner;
    private Grading grading;
    
    public Interface(Scanner scanner, Grading grad) {
        this.scanner = scanner;
        this.grading = grad;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            
            if (value == -1) {
                System.out.println("Point average (all): " + grading.average());
                printAveragePassing();
                System.out.println("Pass percentage: " + grading.passPercentage());
                System.out.println("Grade distribution:");
                grading.printGradeDistribution(); // ✅ Call to print grade distribution
                break;
            }
            
            grading.add(value);
        }
    }
    
    private void printAveragePassing() {
        double avgPass = grading.averagePassing();
        if (avgPass == 0.0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + avgPass);
        }
    }
}
