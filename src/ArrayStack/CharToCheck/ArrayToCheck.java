package ArrayStack.CharToCheck;
import ArrayStack.ArrayStack.*;
public class ArrayToCheck extends ArrayStack {

    public static void main(String [] args) {

        String text = "(hi)()asas(})]";
        System.out.println(CharCheck(text));

    }

    public static boolean CharCheck( String text ) {

        ArrayStack check = new ArrayStack(10);

        char charToCheck;

        for (int i = 0; i < text.length(); i++) {
            charToCheck = text.charAt(i);
            if ((charToCheck == '(') || (charToCheck == '[') || (charToCheck == '{'))
                check.push(charToCheck);
            if ((charToCheck == ')') || (charToCheck == ']') || (charToCheck == '}'))
                if (check.isEmpty()) {
                    System.out.println("Error at position " + i );
                    return false;
                } else {
                    check.pop();
                }
        }

        if ( check.isEmpty() ) {
            System.out.println("No Error");
            return true;
        } else {
            System.out.println("Error at position " + text.length() );
            return false;
        }

    }
}
