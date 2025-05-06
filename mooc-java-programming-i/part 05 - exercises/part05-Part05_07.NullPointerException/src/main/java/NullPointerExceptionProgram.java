
import java.util.ArrayList;

public class NullPointerExceptionProgram {

    public static void main(String[] args) {
        // Implement a program, or modify a program so, that it causes 
        // the NullPointerException -error


        String text = null; // This is explicitly set to null
            int length = text.length(); // 💥 NullPointerException occurs here
            System.out.println("Length of text: " + length);
    }
}
