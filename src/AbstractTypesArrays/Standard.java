package AbstractTypesArrays;

public class Standard {

    public static void get() {
        System.out.println("Default Elements");
        Student[] s = new Student[5];

        s[0] = new Student(1,"Christos", "Tade", 25, 'm', 0, 10);
        s[1] = new Student(2,"Nikos", "Tade", 28, 'm', 2, 5);
        s[2] = new Student(3,"Maria", "Tade", 25, 'f', 4, 10);
        s[3] = new Student(4,"Georgia", "Tade", 20, 'f', 2, 4);
        s[4] = new Student(5,"Soula", "Tade", 20, 'f', 2, 5);

        Lab L1 = new Lab("Domes", 4);

        L1.insert(s[0]);
        L1.insert(s[1]);
        L1.insert(s[2]);
        L1.insert(s[3]);

        System.out.println(L1.succeded());
        System.out.println(L1.failed());
        System.out.println(L1.averageGrade());
        System.out.println( L1.search(2));
        System.out.println(L1.search(5));
    }

}
