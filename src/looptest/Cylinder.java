package looptest;

/**
 * @author small瑞
 * 定义一个名称为 Cylinder 的类用来表示任意圆柱体，其中包含两个字段:
 *
 * radius 表示圆柱体底面的半径
 * height 表示圆柱体的高度
 * 要求在 Cylinder 类中增加以下方法并实现相应功能
 *
 * squaring 方法用于计算圆柱体的表面积
 * cube 方法用于计算圆柱体的体积
 * 将 Cylinder 类开发好后，通过以下程序来测试:
 *
 * Cylinder  c = new Cylinder();
 * c.radius = 20 ;
 * c.height = 20 ;
 * c.squaring() ; // 计算圆柱体表面积并在控制台输出面积
 * c.cube() ; // 计算圆柱体体积并在控制台输出体积
 */
public class Cylinder {
    public double radius ;
    public double height ;

    public Cylinder() {

    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void squaring(){
        double s = (2*Math.PI*this.radius*this.height)+2*Math.PI*this.radius*this.radius;
        System.out.println("面积:"+s);
    }
    public void cube(){
        System.out.println("体积:"+Math.PI*this.radius*this.radius*this.height);
    }

}
