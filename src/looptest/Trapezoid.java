package looptest;

/**
 * @author small瑞
 */
public class Trapezoid extends Shape{
    private double top ;
    private double bottom ;
    private double height ;

    public Trapezoid(String type, double top, double bottom, double height) {
        super(type);
        this.top = top;
        this.bottom = bottom;
        this.height = height;
    }

    public Trapezoid(String type) {
        super(type);
    }
    @Override
    public void calculate(){
        this.area = (this.top+this.bottom)*this.height/2;
    }
    @Override
    public void show(){
        System.out.println("上底:"+this.top);
        System.out.println("下底:"+this.bottom);
        System.out.println("高:"+this.height);
        System.out.println("面积:"+this.area);
        super.show();
    }
}
