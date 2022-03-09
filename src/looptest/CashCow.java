package looptest;

/**
 * @author small瑞
 * 定义一个 CashCow 类，并在其中定义以下 私有 ( private ) 字段
 *
 * height 表示摇钱树的高度，采用 int 即可
 * goldPiece 表示金币数量，采用 int 类型即可
 * wormy 表示摇钱树上是否有虫子，采用 boolean 类型即可 ( true 表示有虫子 、false 表示没有虫子 )
 * pesticide 表示杀虫剂数量，采用 int 类型即可
 * 在 CashCow 类中添加以下方法:
 *
 * 成长
 * public void grow(){
 *     // 方法执行一次，摇钱树成长一次，高度增加 2 ，金币数量增加 10
 * }
 * 购买杀虫剂
 * public void buy(){
 *     // 当有金币时，从树上采摘金币购买农药
 *     // 每购买一次农药，金币减少 1 个，杀虫剂增加 100
 * }
 * 杀虫
 * public void kill(){
 *     // 当有虫子时，执行杀虫操作
 *     // 每执行一次杀虫操作，杀虫剂减少 50 ， 金币增加 5 个
 * }
 * 浇水
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * public void watering(){
 *     // 每次浇水，金币数量增加 5 个，高度增加 1
 *     // 每次浇水都会导致虫子增加 ( 即 wormy 变为 true )
 * }
 * 查询状态
 * public void show(){
 *     // 通过 show 方法显示 摇钱树的高度 、摇钱树上的金币数量 、是否用虫子 、杀虫剂数量
 * }
 */
public class CashCow {
    private int height;
    private int goldPiece;
    private boolean wormy;
    private int pesticide;

    public void grow(){
        this.height+=2;
        this.goldPiece+=10;
    }
    public void buy(){
        if(this.goldPiece>0){
            this.goldPiece--;
            this.pesticide+=100;
        }
    }
    public void kill(){
        if(this.wormy&&this.pesticide>=50){
            this.pesticide-=50;
            this.goldPiece+=5;
            this.wormy=!this.wormy;
        }
    }
    public void watering(){
        this.goldPiece+=5;
        this.height++;
        this.wormy=!this.wormy;
    }
    public void show(){
        System.out.println("欢迎来到smallrui摇钱养殖场!");
        System.out.println("摇钱树的高度:"+this.height);
        System.out.println("摇钱树上的金币数量:"+this.goldPiece);
        System.out.println("是否有虫子:"+this.wormy);
        System.out.println("杀虫剂数量:"+this.pesticide);
    }
}
