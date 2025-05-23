
public class StarSign {

    public static void main(String[] args) {

        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for (int i =0; i<number;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        int i=0;
        while(i<size){
            printStars(size);
            i++;
        }
    }

    public static void printRectangle(int width, int height) {
        int i=0;
        while(i<height){
            printStars(width);
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i=1;
        while(i<=size){
            printStars(i);
            i++;
        }
    }
}
