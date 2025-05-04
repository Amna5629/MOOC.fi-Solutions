
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName=scan.nextLine();
        System.out.println("Team:");
        String team=scan.nextLine();
        int count=0;
        int win=0;
        int loss=0;

        try(Scanner reader=new Scanner(Paths.get(fileName))){
            
            while(reader.hasNextLine()){
                String row=reader.nextLine();
                String[] parts=row.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homePoints=Integer.valueOf(parts[2]);
                int awayPoints=Integer.valueOf(parts[3]);
                if (homeTeam.equals(team)) {
                    count++;
                    if (homePoints > awayPoints) {
                        win++;
                    } else {
                        loss++;
                    }
                } else if (awayTeam.equals(team)) {
                    count++;
                    if (awayPoints > homePoints) {
                        win++;
                    } else {
                        loss++;
                    }
                }
            }
        }catch(Exception e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        System.out.println("Games: "+count);
        System.out.println("Wins: "+win);
        System.out.println("Losses: "+loss);

    }

}
