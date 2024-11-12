package Arrays;

public class StudentArray {
    public static void main(String[] args) {
        Student[] stdArr = new Student[10];
        stdArr[0] = new Student(1, "Tapan", 26);
        stdArr[1] = new Student(2, "Sapan", 15);
        stdArr[3] = new Student(3, "Ram", 18);
        stdArr[4] = new Student(4, "Raj", 25);

        for (Student std : stdArr) {
            System.out.println(std);
        }
    }
}
