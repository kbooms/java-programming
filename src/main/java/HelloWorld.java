import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        // Declaring and initializing a String variable "myIntro"
        String myIntro = ("My name is Kevin Booms. I am a Java Programmer and Full Stack Developer \n");

        // Printing a String to screen, next line prints a variable (also a String)
        System.out.println("What up! I'm here to play now!");
        System.out.println(myIntro);

        // Declaring and initializing an array
        int[] someNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        // Declaring a blank array of size 10
        int[] blankArray = new int[10];
        System.out.println("Two Arrays, both the same size, one populated, one blank");
        System.out.println("The blank array:     " + blankArray.length);
        System.out.println("The populated array: " + someNumbers.length);

        // Loop formatting FOR and FOR-EACH loops
        System.out.print("Numbers from a FOR Loop: ");
        for (int i = 0; i < someNumbers.length; i++) {
            if (i == someNumbers.length - 1){
                System.out.println(someNumbers[i]);
            } else {
                System.out.print(someNumbers[i] + ", ");
            }
        }
        System.out.print("Numbers from a FOR EACH Loop: ");
        for (int number: someNumbers) {
            if (number != 0) {
                System.out.print(number + ", ");
            } else {
                System.out.println(number);
            }
        }

        // having imported the Scanner Object, we can play with that a bit
        Scanner hollaHolla = new Scanner(System.in);
        System.out.println("\nHolla holla if you hear me! ");
        System.out.print(">");
        String hollaBack = hollaHolla.nextLine();
        System.out.println("\nCool! Glad we got that established.");
        System.out.println("Press ENTER to continue...");
        hollaBack = hollaHolla.nextLine();

    }
}
