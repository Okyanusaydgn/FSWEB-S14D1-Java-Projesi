package company;

public class SeniourDeveloper extends Employee {

    public SeniourDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(Salaries.SENIOR.getSalary());
        System.out.println(getName() + " Seniour developer starts to working...");
    }
}
