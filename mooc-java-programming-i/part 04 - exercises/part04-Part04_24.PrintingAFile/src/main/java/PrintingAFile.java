
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try(Scanner readScanner=new Scanner(Paths.get("data.txt"))){
            while(readScanner.hasNextLine()){
                String row=readScanner.nextLine();
                System.out.println(row);
            }
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
