package AbstractTypesArrays;

import QueueStack.QueueStack.*;

public class QueueStack {
    public static void get() {
        System.out.println("\nQueue List");
        QueueStackCycle q = new QueueStackCycle(10);

        q.enqueue(new Student(1,"Christos", "Tade", 25, 'm', 0, 10));
        q.enqueue(new Student(2,"Nikos", "Tade", 28, 'm', 2, 5));
        q.enqueue(new Student(3,"Maria", "Tade", 25, 'f', 4, 10));
        q.enqueue(new Student(4,"Christos", "Tade", 25, 'm', 0, 10));
        q.enqueue(new Student(5,"Nikos", "Tade", 28, 'm', 2, 5));
        q.enqueue(new Student(6,"Maria", "Tade", 25, 'f', 4, 10));
        q.enqueue(new Student(7,"Christos", "Tade", 25, 'm', 0, 10));
        q.enqueue(new Student(8,"Nikos", "Tade", 28, 'm', 2, 5));
        q.enqueue(new Student(9,"Maria", "Tade", 25, 'f', 4, 10));
        q.enqueue(new Student(10,"Christos", "Tade", 25, 'm', 0, 10));

        /*Lab L3 = new Lab("Domes", 10);

        for (int i = 0; i < q.size(); i++) {
            Student S = (Student) q.dequeue();
            L3.insert(S);
            q.enqueue(S);
            System.out.println("Insert " + q.size());
        }

        System.out.println("Size of Queue " + q.size());

        try {
            System.out.println(L3.succeded());
            System.out.println(L3.failed());
            System.out.println(L3.averageGrade());
            System.out.println(L3.search(2));
            System.out.println(L3.search(5));
        } catch (QueueStackEmptyException emp) {
            System.out.println("Queue is Empty " + emp.toString());
        } catch (QueueStackFullException full) {
            System.out.println("Queue is Full " + full.toString());
        }*/

        System.out.println("Size of Queue " + q.size());

        System.out.println("\ndequeue");
        System.out.println(q.dequeue());
        System.out.println("Size of Queue " + q.size());
        q.enqueue(new Student(1, "Christos", "tade",25, 'm', 10, 0));
        System.out.println("Size of Queue " + q.size());

        int size = q.size();

        for (int i=0; i < size; i++) {
            Student s = (Student)q.dequeue();
            System.out.println(s);
            System.out.println("Size of Queue " + q.size());
        }
        System.out.println("Size of Queue " + q.size());
    }
}
