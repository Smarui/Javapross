package looptest;

/**
 * @author small瑞
 * Sector 继承 Shape 类
 *
 * Sector 类中有一个表示 圆半径 的 实例变量 ( radius )
 *
 * Sector 类中有一个表示 扇形弧长 的 实例变量 ( arcLength )
 *
 * 或者可以在 Sector 类中定义 圆心角的角度 ( degree )
 * Sector 类中有一个带参数的构造方法
 *
 * 通过构造方法的参数用来初始化 radius 和 arcLength ( 或 degree )
 * Sector 类的构造方法中需要调用父类有参构造设置其类型 ( 将 type 设置为 "扇形" 即可 )
 *
 * 在 Sector 中重新声明 calculate 方法计算扇形的面积
 *
 * 在 Sector 中重新声明 show 方法输出扇形信息(比如半径、弧长/角度 等)和扇形面积
 */
public class Sector extends Shape{
    private double radius;
    private double arcLength;
    public Sector(String type){
        super(type);
    }
    public Sector(String type, double radius,double arcLength){
        super(type);
        this.radius = radius;
        this.arcLength = arcLength;
    }

    @Override
    public void calculate() {
        this.area = this.arcLength*this.radius/2;

    }
    @Override
    public void show(){
        System.out.println("半径:"+this.radius);
        System.out.println("弧长:"+this.arcLength);
        System.out.println("面积:"+this.area);
        super.show();
    }
}
