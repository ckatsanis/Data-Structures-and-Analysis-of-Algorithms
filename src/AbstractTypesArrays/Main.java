package AbstractTypesArrays;

import ArrayStack.ArrayStack.ArrayStack;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static String [] string = {"0 - Exit", "1 - Standard", "2 - Array Stacks", "3 - Queue Stack", "4 - List", "5 - Tree"};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int index = 0;
        for (int i=0; i < string.length; i++)
            System.out.println(string[i]);

        while (index > -1 && index <6) {
            index = scan.nextInt();

            for (int i=0; i < string.length; i++)
                System.out.println(string[i]);

            switch (index) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    Standard.get();
                    break;
                case 2:
                    ArrayStacks.get();
                    break;
                case 3:
                    QueueStack.get();
                    break;
                case 4:
                    List.get();
                    break;
                case 5:
                    Tree.get();
                    break;
                default:
                    break;
            }
        }
    }
}