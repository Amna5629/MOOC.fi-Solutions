
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number=input.nextInt();
        if(number<0){
            System.out.println(number*-1);
        }else{
            System.out.println(number);
        }
    }
}
