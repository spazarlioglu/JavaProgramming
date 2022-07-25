package day35_Encapsulation.encapsulation;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    public void setName(String name){
        if (name.equals("")){
            System.out.println("Invalid name : "+name);
            System.exit(0);
        }
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setGender(char gender){
        if (!(gender=='F' || gender=='M')){
            System.out.println("Invalid gender : "+gender);
            System.exit(0);
        }
        this.gender=gender;
    }

    public char getGender(){
        return gender;
    }

    public void setAge(int age){
        if (age<16 || age>90){
            System.out.println("Invalid age : "+age);
            System.exit(0);
        }
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void setSalary(double salary){
        if (salary<=0){
            System.out.println("Invalid salary : "+salary);
            System.exit(0);
        }
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }


}
