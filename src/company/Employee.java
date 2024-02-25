package company;

public class Employee {
    private long id; // id ler genellikle long olarak tanımlanır !!!! unutma

    private String name;

    private double salary;

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void  work(){
        System.out.println("Employee starts to working");
    }

    // aşağıda toString methodu kullanıcaz. Bunun kısaca kullanmamızın amacı yazdığımız kodu print yaptırıyor. Yani bize gösteriyor.


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
