package company;

public class JuniourDeveloper extends Employee {

    public JuniourDeveloper(long id, String name ){
        super(id, name);
    }


    /*public void  work(){
        System.out.println("Employee starts to working");
    normalde default mesaj bu ama biz aşağıda override yapıyoruz ve juniour için aşağıdaki mesajın yazılmasını istiyoruz.
    }*/
    @Override
    public void work() {
        super.setSalary(Salaries.JUNIOR.getSalary());
        System.out.println(getName() + " Juniour developer starts to working...  ");
    }
}
