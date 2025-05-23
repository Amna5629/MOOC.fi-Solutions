import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Name: ");
            String showName=scanner.nextLine();
            if(showName.isEmpty()){
                break;
            }
            System.out.println("Duration: ");
            int duration=scanner.nextInt();
            scanner.nextLine();
            programs.add(new TelevisionProgram(showName, duration));

        }
        System.out.println("Program's maximum duration? ");
        int maxDuration=scanner.nextInt();
        for (TelevisionProgram show:programs){
            if(show.getDuration()<=maxDuration){
                System.out.println(show.getName()+" , "+show.getDuration()+" minutes");
            }
        }


    }
}
