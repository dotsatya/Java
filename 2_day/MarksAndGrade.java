class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public int totalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double averageMarks() {
        return totalMarks() / 5.0;
    }

    public char calculateGrade() {
        double average = averageMarks();
        if (average >= 90) return 'A';
        else if (average >= 75) return 'B';
        else if (average >= 50) return 'C';
        else return 'F';
    }

    public String toString() {
        return "Name: " + name + ", Total Marks: " + totalMarks() + ", Grade: " + calculateGrade();
    }
}

public class MarksAndGrade {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 88, 92};
        Student student = new Student("Satya", marks);
        System.out.println(student);
    }
}
