
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();
        ArrayList<String> names=new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
        
            String[] parts = input.split(",");
            numbers.add(Integer.valueOf(parts[1]));
            names.add(parts[0]);
            
        }
        int oldest=numbers.get(0);
        for (int number : numbers){
            if(oldest<number){
                oldest=number;
            }
        }
        int index=numbers.indexOf(oldest);
        System.out.println("Name of the oldest: "+names.get(index));


    }
}
