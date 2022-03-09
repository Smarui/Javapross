package looptest;

/**
 * @author small瑞
 * 定义一个名称为 Triangle 的类用来表示任意三角形，其中采用三个字段来描述三角形三边的长度:
 *
 * firstEdge
 * secondEdge
 * thirdEdge
 * 要求在 Triangle 类中定义一个名称为 squaring 的方法来计算该三角形的面积。
 *
 * 将 Triangle 类开发好后，通过以下程序来测试:
 *
 * Triangle t = new Triangle();
 * t.firstEdge = 30 ;
 * t.secondEdge = 40 ;
 * t.thirdEdge = 50 ;
 * t.squaring() ; // 计算面积并在控制台输出面积
 * 在设置 三角形三边的长度时，必须保证 其中一边之长 小于 另外两边长度之和。
 */
public class Triangle {
    public int firstEdge;
    public int secondEdge;
    public int thirdEdge;
    public int getFirstEdge() {
        return firstEdge;
    }

    public Triangle() {

    }

    public Triangle(int firstEdge, int secondEdge, int thirdEdge) {
        this.firstEdge = firstEdge;
        this.secondEdge = secondEdge;
        this.thirdEdge = thirdEdge;
        this.isTriangle();
    }
    public boolean isTriangle(){
        if(this.firstEdge < this.secondEdge + this.thirdEdge && firstEdge > this.secondEdge - this.thirdEdge&&secondEdge < this.firstEdge + this.thirdEdge && secondEdge > this.firstEdge - this.thirdEdge&&thirdEdge < this.firstEdge + this.secondEdge && secondEdge > this.firstEdge - this.secondEdge){
            return true;
        }else {
            this.firstEdge = 0;
            this.secondEdge = 0;
            this.thirdEdge = 0;
            System.out.println("所设置的三边无法构成三角形，请重新设置!");
            return false;
        }

    }
    public void setFirstEdge(int firstEdge) {
        if(this.secondEdge!=0&&this.thirdEdge!=0) {
            if (firstEdge < this.secondEdge + this.thirdEdge && firstEdge > this.secondEdge - this.thirdEdge) {
                this.firstEdge = firstEdge;
            } else {
                System.out.println("输入的数据不合理");
            }
        }
        else{
            this.firstEdge = firstEdge;
        }

    }

    public int getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(int secondEdge) {
        if(this.firstEdge!=0&&this.thirdEdge!=0) {
            if (secondEdge < this.firstEdge + this.thirdEdge && secondEdge > this.firstEdge - this.thirdEdge) {
                this.secondEdge = secondEdge;
            } else {
                System.out.println("输入的数据不合理");
            }

        }
        else{
            this.secondEdge = secondEdge;
        }

    }

    public int getThirdEdge() {
        return thirdEdge;
    }

    public void setThirdEdge(int thirdEdge) {
        if(this.firstEdge!=0&&this.secondEdge!=0) {
            if (thirdEdge < this.firstEdge + this.secondEdge && secondEdge > this.firstEdge - this.secondEdge) {
                this.thirdEdge = thirdEdge;
            } else {
                System.out.println("输入的数据不合理");
            }
        }
        else{
            this.thirdEdge = thirdEdge;
        }

    }
    public void squaring(){
        if(this.isTriangle()){
            double p = (firstEdge+secondEdge+thirdEdge)/2;
            double s = Math.sqrt(p*(p-firstEdge)*(p-secondEdge)*(p-thirdEdge));
            System.out.println("三角形的面积为:"+s);
        }

    }

}
