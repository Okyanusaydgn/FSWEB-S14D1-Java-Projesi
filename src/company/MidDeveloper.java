package company;

public class MidDeveloper extends Employee {


    public MidDeveloper(long id, String name) {
        super(id, name);
    }

    // override amacı parent daki default davranışı gösterme childe da ona özel oluşturulan davranışı göster.


    @Override
    public void work() {
        setSalary(Salaries.MID.getSalary());
        System.out.println(getName() + " Mid developer starts to working...");
    }
}
