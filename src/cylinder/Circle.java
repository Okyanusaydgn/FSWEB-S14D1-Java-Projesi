package cylinder;

public class Circle {

    private double radius;

    // access modifier (değişken tipi) -- > public,private
    // constructor ı methoddan ayıran şey geri dönüşüm tipi yani return type bulunmamasıdır.
    // constructor bir nesne oluşturulduğunda bu nesneyi başlatmak için kullanılır.

    // istersek aşağıdaki circle ı biz dışarıdan parametre almadan da yazabiliriz
    /*
    * public Circle(){
    *  this.radius =3;
    * }
    * */

    public Circle(double radius){
        if(radius < 0){
            this.radius = 0;
        }
        else {
            this.radius = radius;
        }
    }
    // getter ve setterları public yapıyoruz ama instance variable lar yani değişkenler private olur. Biz buna encapsulation denir.
    //  encapsulation sayesinde sınıflarda bulunan verileri güvenliği sağlanır ve sadece sınıf içindeki yöntemler aracılığıyla ulaşılabilir.
    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }
}

