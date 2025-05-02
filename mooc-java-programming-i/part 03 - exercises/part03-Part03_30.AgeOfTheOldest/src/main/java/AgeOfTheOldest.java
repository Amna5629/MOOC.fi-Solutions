
import java.util.*;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
        
            String[] parts = input.split(",");
            numbers.add(Integer.valueOf(parts[1]));
            
        }
        int oldest=numbers.get(0);
        for (int number : numbers){
            if(oldest<number){
                oldest=number;
            }
        }
        System.out.println("Age of the oldest: "+oldest);



    }
}
