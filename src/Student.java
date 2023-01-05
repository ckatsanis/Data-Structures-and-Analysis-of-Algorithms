import javax.swing.text.html.parser.TagElement;

public class Student {

    private int am;
    private String fname;
    private String lname;
    private double age;
    private char sex;
    private int nac; // number of absences in the course
    private double grade;

    // Create New Object
    Student (int am, String fname, String lname, double age, char sex, int nac, double grade) {
        this.am = am;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.sex = sex;
        this.nac = nac;
        this.grade = grade;
    }

    public int getAM() {
        return am;
    }

    public String getOnoma() {
        return fname + ' ' + lname;
    }

    public double getGrade() {
        return grade;
    }

    public int getAbsences() {
        return nac;
    }

    public String toString() {
        return ("AM: " + am + "\nName: " + this.getOnoma() + "\nGrade: " + grade + "\nAbsences: " + nac);
    }

}
