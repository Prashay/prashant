package Personal;

public class Employmain {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(10);
        e1.setName("Ram");
        e1.setStrem("Cse");
        e1.setRoll("E32");

        System.out.println("Details of Employee" + e1.getId() + " - " + e1.getName() + " - " + e1.getStrem() + " - " + e1.getRoll());
    }
}
