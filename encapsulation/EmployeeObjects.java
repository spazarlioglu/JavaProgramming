package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee e1=new Employee();

        e1.setName("Elif Miray");
        e1.setAge(18);
        e1.setGender('F');
        e1.setSalary(115000);

        System.out.println(e1.getName());
        System.out.println(e1.getGender());
        System.out.println(e1.getAge());
        System.out.println(e1.getSalary());


    }
}
