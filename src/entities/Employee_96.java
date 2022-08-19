package entities;

public class Employee_96 {

    private Integer id;
    private String name;
    private Double salary;

    public Employee_96(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public Employee_96(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getSalary(double salary){
        return salary;
    }

    public void increaseSalary(double percentage){
        this.salary += salary * percentage / 100.0 ;

    }
    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
