package looptest;

/**
 * @author small瑞
 */
public class ShapeTest {
    public static void main(String[] args) {
        Trapezoid t = new Trapezoid( "梯形",30 , 40 , 50 ); // 创建 Trapezoid 实例
        t.calculate() ; // 计算梯形面积
        t.show(); // 输出梯形信息和梯形面积

        Sector s = new Sector("扇形" ,5,50 );
        s.calculate() ; // 计算扇形面积
        s.show(); // 输出扇形信息和扇形面积
    }
}
