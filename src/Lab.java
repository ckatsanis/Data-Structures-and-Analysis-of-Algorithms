public class Lab implements LabInterface {

    private String LabName;
    private int capacity;
    private int size = 0;
    private Student[] LabArray;

    public Lab (String name, int capacity) {
        LabName = name;
        this.capacity = capacity;
        LabArray = new Student[capacity];
    }

    public Lab (String name) {
        LabName = name;
    }

    public int getSize() {
        return size;
    }

    public String getLabName() {
        return LabName;
    }

    @Override
    public boolean insert(Student S) {
        if (size >= capacity) {
            System.out.println("Lab: " + LabName + " is full.");
            return false;
        } else {
            LabArray[size++]=S;
            return true;
        }
    }

    @Override
    public boolean delete(Student S) {
        for (int i=0; i < size; i++)
            if (LabArray[i] == S) {
                LabArray[i] = LabArray[--size];
                return true;
            }

        return false;
    }

    @Override
    public Student search(int AM) {
        for (int i=0; i < size; i++)
            if ( LabArray[i].getAM() == AM) {
                return LabArray[i];
            }

            return null;
    }

    @Override
    public void presentation() {
        for (int i=0; i < size; i++)
            System.out.println(LabArray[i].getAM() + ' ' + LabArray[i].getOnoma() + ' ' + LabArray[i].getAbsences() + ' ' + LabArray[i].getGrade());
    }

    @Override
    public int succeded() {
        int count = 0;

        for (int i=0; i < size; i++)
            if ((LabArray[i].getGrade() >= 5 ) && (LabArray[i].getAbsences() <= 2))
                count++;

            return count;
    }

    @Override
    public int failed() {
        return size - succeded();
    }

    @Override
    public double averageGrade() {
        double total = 0.0;

        for (int i=0; i < size; i++)
            total += LabArray[i].getGrade();

        return total/size;
    }
}
