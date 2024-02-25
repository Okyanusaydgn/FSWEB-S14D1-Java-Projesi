package cylinder;

public class Cylinder extends Circle  {
    private double height;

    public Cylinder(double radius, double height){
        super(radius); // buradki super(radius) un anlamı circle bulunan oluşturduğumuz constructor yapısıdır. Yani o circle daki constructor yapısını super ile buraya çağrıyoruz.
        // radius için if döngüsü oluşturmayacağız çünkü zaten circle içinde bu gerçekleşiyor.
        // protected ve private arasında ne fark var ? --->  protected da global dan erişim olmaz ama public de class,package, subclass, global dan erişim sağlanır.
        // default da Yalnız!! aynı paket içindeki sınıflardan erişilebilir.
        // protected aynı paket içinde veya aynı paketten kalıtılan alt sınıflardan erişilebilir.
        if(height < 0){
            this.height = 0;
        } else{
            this.height = height;
        }
    }

    public double getHeight(){
        return this.height;
    }

    // eğer biz buraya getArea yazsak aşağıdaki public double getVolume methodu içindeki get area kimi çağırır tabiki şuan yazacağımız methodu eğer üst sınıftaki getArea() yı çağırmasını istiyorsak. "super.getArea()" diye yazmamız lazım.
    // veya @override ı kullanabiliriz.
    public double getVolume(){
        return super.getArea() * this.height;
    }
}
