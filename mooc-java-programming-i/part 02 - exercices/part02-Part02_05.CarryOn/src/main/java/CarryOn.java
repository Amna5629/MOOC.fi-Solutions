
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("Shall we carry on?");
            String reply=input.nextLine().toLowerCase();
            if(reply.equals("no")){
                break;
            }
        }
        
    }
}
