package company;

import java.util.Arrays;

public class HrManager extends Employee {

    private JuniourDeveloper[] juniourDevelopers;
    private MidDeveloper[] midDevelopers;

    private SeniourDeveloper[] seniourDevelopers;

    public HrManager(long id, String name,
                     JuniourDeveloper[] juniourDevelopers,
                     MidDeveloper[] midDevelopers,
                     SeniourDeveloper[] seniourDevelopers) {
        super(id, name);
        this.juniourDevelopers = juniourDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniourDevelopers = seniourDevelopers;
    }


    public void addEmployee(int index, JuniourDeveloper juniourDeveloper){

        try{
            // aşağıdak kodun amacın belirtilen index de eleman yok ise anlamına geliyor.
            if(this.juniourDevelopers[index] == null ){
                this.juniourDevelopers[index] = juniourDeveloper;
            }
            else{
                System.out.println("Index is full");
            }
        }
        catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }


    }

    public void addEmployee(int index, MidDeveloper midDeveloper){

        try{
            // aşağıdak kodun amacın belirtilen index de eleman yok ise anlamına geliyor.
            if(this.midDevelopers[index] == null ){
                this.midDevelopers[index] = midDeveloper;
            }
            else{
                System.out.println("Index is full");
            }
        }
        catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }

    }

    public void addEmployee(int index, SeniourDeveloper seniourDeveloper){

        try{
            // aşağıdak kodun amacın belirtilen index de eleman yok ise anlamına geliyor.
            if(this.seniourDevelopers[index] == null ){
                this.seniourDevelopers[index] = seniourDeveloper;
            }
            else{
                System.out.println("Index is full");
            }
        }
        catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }


    }

    @Override
    public void work() {
        setSalary(Salaries.HRMANAGER.getSalary());
        System.out.println(getName() + " HR manager  starts to working...");
    }


    // "super=" + super.toString() yerine ---> "id=" + super.getId() onun altına "name=" + super.getName() onun altına "salary=" + super.getSalary()
     @Override
    public String toString() {
        return "HrManager{" +
                "super=" + super.toString() +
                "juniourDevelopers=" + Arrays.toString(juniourDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniourDevelopers=" + Arrays.toString(seniourDevelopers) +
                '}';
    }
}
