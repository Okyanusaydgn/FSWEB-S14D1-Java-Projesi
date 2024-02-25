//  inheritance bir diğer anlamı miras alma. Yani elimizdeki bir sınıfın başka bir sınıftan özelliklerini ve davranışlarını devralması demektir.
// bir sınıfın diğer bir sınıftan özelliklerini miras alabilmesi için "extends" anahtar kelimesi kullanılır.
// inheritance sayesinde kod tekrarından kurtulmuş oluruz.
// alt + enter tuşu ile hızlıca import edebilirsin.

import company.HrManager;
import company.JuniourDeveloper;
import company.MidDeveloper;
import company.SeniourDeveloper;
import cylinder.Circle;
import cylinder.Cylinder;
import pool.Cuboid;
import pool.Rectangle;

public class Main {
    public static void main(String[] args) {

//        Circle circle = new Circle(3.75); // içine değer yazıyoruz çünkü cicrle daki constructor değer alıyor.
//
//        System.out.println("circle.radius= " + circle.getRadius());
//
//        System.out.println("circle.area= " + circle.getArea());
//
//
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//
//        System.out.println("cylinder.area= " + cylinder.getArea());
//
//        System.out.println("cylinder.volume= " + cylinder.getVolume());


/*        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());*/

/*
        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());
*/


        JuniourDeveloper juniourDeveloper1 = new JuniourDeveloper(1,"Ahmet");
        JuniourDeveloper juniourDeveloper2 = new JuniourDeveloper(2,"Ayşe");
        juniourDeveloper1.work();
        juniourDeveloper2.work();

        System.out.println(juniourDeveloper1);
        System.out.println(juniourDeveloper2);

        MidDeveloper midDeveloper = new MidDeveloper(1,"buse");
        midDeveloper.work();
        System.out.println(midDeveloper);

        SeniourDeveloper seniourDeveloper = new SeniourDeveloper(1,"Can");
        seniourDeveloper.work();
        System.out.println(seniourDeveloper);

        System.out.println("*************************");
        System.out.println("*************************");

        HrManager hrManager = new HrManager(1,"kerem",new JuniourDeveloper[3],new MidDeveloper[4],new SeniourDeveloper[3]);
        hrManager.work();
        System.out.println(hrManager);

        hrManager.addEmployee(0,juniourDeveloper1);
        hrManager.addEmployee(1,juniourDeveloper2);
        hrManager.addEmployee(1,midDeveloper);
        hrManager.addEmployee(2,seniourDeveloper);
        System.out.println(hrManager);
    }

}