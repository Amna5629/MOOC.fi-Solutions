
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list=new ArrayList<>();

        while(true){
            int number=scanner.nextInt();
            if(number==-1){
                break;
            }
            list.add(number);
        }
        int sum=0;
        int count=0;
      

        for (int number:list){
            sum=sum+number;
            count++;
        }

        System.out.println("Average: " + (double)sum/count);

        
    }
}
