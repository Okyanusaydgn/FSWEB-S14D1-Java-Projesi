package pool;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length){
        this.width = Math.max(width,0); // max işlevi en yüksek hangi sayı ise onu alır width değerimiz eksi değer ise sıfır değerini alır. Eğer width değeri sıfırdan büyük ise witdh değerini alır.
        this.length = Math.max(length,0);
    }

    public int getWidth(){
        return this.width;
    }

    public int getLength(){
        return this.length;
    }
    // double ile int in çarpımı double olur. Bunu unutma !!!!
    public int getArea(){
        return this.length * this.width;
    }
}
