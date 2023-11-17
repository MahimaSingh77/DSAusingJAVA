import java.util.Scanner;

public class ques2 {
    int salary;
    int workHours;

    public void getInfo(int salary, int workHours) {
        this.salary = salary;
        this.workHours = workHours;
    }

    public void AddSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void AddWork() {
        if (workHours > 6) {
            salary += 5;
        }
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ques2 e = new ques2();
        e.getInfo(sc.nextInt(), sc.nextInt());
        e.AddSal();
        e.AddWork();
        e.printSalary();
    }
}