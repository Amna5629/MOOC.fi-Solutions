
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("First name: ");
            String fname=scanner.nextLine();
            if(fname.isEmpty()){
                break;
            }
            System.out.println("Last name: ");
            String lname=scanner.nextLine();
            System.out.println("Identification number: ");
            String number=scanner.nextLine();
            infoCollection.add(new PersonalInformation(fname, lname, number));


        }
        for(PersonalInformation person:infoCollection){
            System.out.println(person.getFirstName()+" "+person.getLastName());
        }
        


    }
}
