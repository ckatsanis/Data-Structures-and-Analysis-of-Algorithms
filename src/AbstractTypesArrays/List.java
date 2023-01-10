package AbstractTypesArrays;
import List.*;
public class List {
    public static void get() {
        System.out.println("LIsts");

        LinkedList li = new LinkedList();
        LinkedList L2 = new LinkedList();

        li.insertLast("Stamatis");
        li.insertLast("Adamakis");
        li.insertLast("Sferioy");
        li.insertLast("Santouris");
        li.insertLast("Iliopoulos");

        try {
            System.out.println("List size: " + li.size());
            System.out.println("List max: " + li.maxOfList());
            System.out.println("List: ");
            li.printList();
        } catch (ListEmptyException Error) {
            System.out.println("IS EMPTY ");
        }
    }
}
