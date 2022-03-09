package looptest;

/**
 * @author small瑞
 */
public class Shape {
    protected double area ;
    private String type ;

    public Shape( String type ){
        this.type = type ;
    }
    public void calculate() {
        System.out.println( "计算" + this.type + "的面积" );
        // 父类 Shape 的 calculate 中仅仅包含一条输出语句，没有任何计算过程
    }
    public void show(){
        // 在 Shape 类中 show 方法除了输出语句外，没有任何其它代码
        System.out.println( this.type + "的面积为" + this.area );
    }
}
