import java.util.Scanner;

public class myAssignment {
    public static void main(String[] args) {
        System.out.println("hello world!");
        int flag = 0;
        printMenu();
        while(flag == 0) {
            System.out.println("What action would you like to perform?");
            Scanner sc = new Scanner(System.in);
            String input =  sc.nextLine().trim().toUpperCase();
            switch(input) {
                case "A" :
                    //Add string to index
                    System.out.println("Please enter a string to add:");
                    String str = sc.nextLine();
                    System.out.println("Please enter an index to add:");
                    String index = sc.nextLine();
                    System.out.println("str: " + str);
                    System.out.println("index: " + index);
                    break;
                case "C" :
                    //check is empty
                    System.out.println("The list contains some element(s).");
                    System.out.println("The list is empty");
                    break;
                case "E" :
                    //search for string
                    System.out.println("Please enter an index to search: ");
                    break;
                case "L" :
                    //list strings
                    System.out.print("{ ");
                    System.out.println("}");
                    break;
                case "O" :
                    //list current size
                    System.out.println("The current size is ");
                    break;
                case "Q" :
                    //quit
                    flag = 1;
                    break;
                case "R" :
                    //remove string
                    System.out.println("Please enter the index of a string to remove: ");
                    break;
                case "T" :
                    //reverse
                    System.out.println("list reversed");
                    break;
                case "U" :
                    //Remove duplicates
                    System.out.println("duplicate removed");
                    break;
                case "?" :
                    //Display help
                    printMenu();
                    break;
                default :
                    break;
            }
        }
    }
    private static void printMenu() {
        System.out.println("Choice      Action");
        System.out.println("------      ------");
        System.out.println("A       Add String");
        System.out.println("C       Check if Empty");
        System.out.println("E       Search for String");
        System.out.println("L       List Strings");
        System.out.println("O       List Current Size");
        System.out.println("Q       Quit");
        System.out.println("R       Remove String");
        System.out.println("T       Reverse");
        System.out.println("U       Remove Duplicate");
        System.out.println("?       Display Help");
        System.out.println();
    }
}
