import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create an instance of TodoList
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);

        // Create the UserInterface object
        UserInterface ui = new UserInterface(list, scanner);
        
        // Start the UserInterface (UI loop)
        ui.start();
    }
}
