package HashMap;

import java.util.ArrayList;
import java.util.List;

public class EmployeShortbyage {
    public static void main(String[] args) {
        List<Employe> emplist = new ArrayList<Employe>();
        emplist.add(new Employe(1, "Raj", "male", 27));
        emplist.add(new Employe(2, "Rajma", "female", 29));
        emplist.add(new Employe(3, "Rajmaa", "male", 39));
        emplist.stream().filter(age -> age.getAge() > 28).map(name -> name.name).forEach(System.out::println);
        emplist.stream().filter(e -> e.getAge() > 27 && e.getName().equals("Rajma")).map(gen -> gen.gender).forEach(System.out::println);
    }
}
