
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Where to? ");
        int end=input.nextInt();
        System.out.println("Where from? ");
        int start=input.nextInt();

        for(int i = start ; i<=end;i++){
            System.out.println(i);
        }
       
    }
}
