package looptest;

/**
 * @author small瑞
 */
public class TriangleTest {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.firstEdge = 30 ;
        t.secondEdge = 40 ;
        t.thirdEdge = 56 ;
        t.squaring() ; // 计算面积并在控制台输出面积
    }
}
