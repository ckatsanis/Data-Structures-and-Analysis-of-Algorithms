package AbstractTypesArrays;
import List.*;
public class List {
    public static void get() {
        System.out.println("LIsts");

        LinkedList li = new LinkedList();
        LinkedList L2 = new LinkedList();

        Student s0 = new Student(1,"Christos", "Tade", 25, 'm', 0, 10);
        Student s1 = new Student(2,"Nikos", "Tade", 28, 'm', 2, 5);
        Student s2 = new Student(3,"Maria", "Tade", 25, 'f', 4, 10);
        Student s3 = new Student(4,"Georgia", "Tade", 20, 'f', 2, 4);
        Student s4 = new Student(5,"Soula", "Tade", 20, 'f', 2, 5);

        li.insertLast("Stamatis");
        li.insertLast("Adamakis");
        li.insertLast("Sferioy");
        li.insertLast("Santouris");
        li.insertLast("Iliopoulos");

        L2.insertLast(s1);
        L2.insertLast(s1);
        L2.insertLast(s2);
        L2.insertLast(s3);
        L2.insertLast(s4);

        try {
            System.out.println("List size: " + li.size());
            System.out.println("List max: " + li.maxOfList());
            System.out.println("List: ");
            li.printList();
            System.out.println("List size: " + li.size());
            System.out.println("List max: " + li.maxOfList());
            String s = "Adamakis";
            System.out.println("Found: " + li.ifExists(s));
            System.out.println("List: ");
            li.printList();
            System.out.println("List Sorted: ");
            li.Sort();
            li.printList();
            System.out.println("MinMax: " + L2.MinMaxOfList());
        } catch (ListEmptyException Error) {
            System.out.println("IS EMPTY ");
        }
    }
}
