package encapsulation;
import java.util.*;

class Employee {
    private int salary;
    private String grade;


    public void setSalary(int salary){

        this.salary = salary;
    }
    public int getSalary()
    {
        return salary;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getGrade(){
        return grade;
    }
}

public class MainEmployee {

    public static void main(String []args){
        Employee e = new Employee();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the salary");
        int salary1 = sc.nextInt();
        System.out.println("Enter the grade");
        String str1= sc.next();
        e.setSalary(salary1);
        e.setGrade(str1);

        System.out.println("Salary"+" : "+e.getSalary());
        System.out.println("Grade"+" : "+e.getGrade());
    }
}
