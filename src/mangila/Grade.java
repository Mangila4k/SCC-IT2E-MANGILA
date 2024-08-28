package mangila;

public class Grade {

    int id;
    String name;
    double prelim;
    double midterm;
    double prefinal;
    double finals;

    public void addGrade(int id, String name, double prelim, double midterm, double prefinal, double finals) {
        this.id = id;
        this.name = name;
        this.prelim = prelim;
        this.midterm = midterm;
        this.prefinal = prefinal;
        this.finals = finals;
    }

    public void viewGrade() {

        double average = (prelim + midterm + prefinal + finals) / 4.0;

        String status = (average <= 3.0) ? "Passed" : "Failed";

        System.out.printf("%-10d %-15s %-7.2f %-7.2f %-7.2f %-7.2f %-10.2f %-7s\n",
                this.id, this.name, this.prelim, this.midterm, this.prefinal, this.finals, average, status);
    }
}
