package AbstractTypesArrays;

import QueueStack.QueueStack.*;

public class QueueStack {
    public static void get() {
        System.out.println("\nQueue List");
        Queue q = new Queue(10);

        q.enqueue(new Student(1,"Christos", "Tade", 25, 'm', 0, 10));
        q.enqueue(new Student(2,"Nikos", "Tade", 28, 'm', 2, 5));
        q.enqueue(new Student(3,"Maria", "Tade", 25, 'f', 4, 10));

        Lab L3 = new Lab("Domes", 4);

        for (int i = 0; i < q.size(); i++) {
            Student S = (Student) q.dequeue();
            L3.insert(S);
            q.enqueue(S);
        }

        System.out.println("Size of Queue " + q.size());

        System.out.println(L3.succeded());
        System.out.println(L3.failed());
        System.out.println(L3.averageGrade());
        System.out.println( L3.search(2));
        System.out.println(L3.search(5));
    }
}
