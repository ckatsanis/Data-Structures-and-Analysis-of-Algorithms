package AbstractTypesArrays;

import ArrayStack.ArrayStack.*;

public class ArrayStacks {
    public static void get() { //ArrayStack
        System.out.println("\nArray Stacks");
        ArrayStack Array = new ArrayStack(10);

        Array.push(new Student(1,"Christos", "Tade", 25, 'm', 0, 10));
        Array.push(new Student(2,"Nikos", "Tade", 28, 'm', 2, 5));
        Array.push(new Student(3,"Maria", "Tade", 25, 'f', 4, 10));

        Lab L2 = new Lab("Domes", 4);

        for (int i = 0; i < Array.size(); i++) {
            Student S = (Student) Array.pop();
            L2.insert(S);
        }

        System.out.println("Size of Array " + Array.size());

        System.out.println(L2.succeded());
        System.out.println(L2.failed());
        System.out.println(L2.averageGrade());
        System.out.println( L2.search(2));
        System.out.println(L2.search(5));
    }
}
