
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int count=0;
        while(true){
            int input=scanner.nextInt();
            if(input==0){
                break;
            }
            if(input>0){
                count++;
                sum+=input;
            }


        }

        if(sum==0){
            System.out.println("cannot calculate the average");
        }else{
            System.out.println((double)sum/count);
        }
    }
}
