package looptest;

/**
 * @author small瑞
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder  c = new Cylinder();
        c.radius = 20;
        c.height = 20 ;
        c.squaring() ; // 计算圆柱体表面积并在控制台输出面积
        c.cube();
    }
}
