import java.util.Random;
import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static String black = "\u001B[30m\t";
    public static String red = "\u001B[31m\t";
    public static String green = "\u001B[32m\t";
    public static String yellow = "\u001B[33m\t";
    public static String blue = "\u001B[34m\t";
    public static String purple = "\u001B[35m\t";
    public static String cyan = "\u001B[36m\t";
    public static String white = "\u001B[37m\t";
    public static String reset = "\u001B[0m\t";
    public static String tenSpaces = "\n\n\n\n\n\n\n\n\n\n";
    static  Random random = new Random();
    static Scanner scan = new Scanner(System.in);

    static String colorOfReturn = "";

    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        int ComputerSelect = random.nextInt(3);
        System.out.println(tenSpaces+cyan+"Please select an action \n"+" 0 = Rock \n 1 = paper \n 2 = Scissors"+reset);
        int userInput = 0;
        try {
            userInput = scan.nextInt();
        } catch (Exception e) {
            System.out.println(red+"Only accepting numbers");
            System.exit(0);
        }
        if (userInput != 0 && userInput != 1 && userInput != 2){
            System.out.println(red+"Only accepting numbers from 0 to 2");
            System.exit(0);
        }

        System.out.println(yellow+"Computer chose "+ToText.ConvertCodeToText(ComputerSelect)+blue+" and you chose "+ToText.ConvertCodeToText(userInput));
        String returned = getWinner.GetWinner(ComputerSelect, userInput);
        if (returned.equals("You Win")){
            colorOfReturn = green;
        } else {
            colorOfReturn = red;
        }
        System.out.println(colorOfReturn+returned);

    }
}
