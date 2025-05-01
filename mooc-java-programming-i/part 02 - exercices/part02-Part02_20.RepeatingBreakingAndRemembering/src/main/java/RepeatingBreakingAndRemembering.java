
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        
        Scanner input= new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum=0;
        int count=0;
        int even=0;
        int odd=0;

        while(true){
            int number=input.nextInt();
            if (number==-1){
                System.out.println("Thx! Bye!");
                break;
            }else if(number%2==1){
                odd++;
            }else{
                even++;
            }
            sum+=number;
            count++;
        }
        double avg=(double)sum/count;

        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+count);
        System.out.println("Average: "+avg);
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
