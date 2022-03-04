package looptest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. 使用while结构，计算从1到100之间的数的和。
 *
 * 2. 使用while结构，计算从1到100之间的所有偶数的和。
 *
 * 3. 使用while结构，计算从1到100之间的所有奇数的和。
 *
 * 4. 使用while结构判断一个整数是否为质数。
 *
 * 5. 使用while结构将一个10进制的数转换成它的逆序数，比如1234的逆序数是4321。
 *
 * 7. 使用for循环打印一个由*组成的5行的直角三角形。
 *
 * 8. 使用for循环打印一个由*组成的5行的等腰三角形。
 *
 * 9. 使用for循环打印一个由*组成的5行的倒置等腰三角形。
 *
 * 10. 使用for循环打印一个由*组成的9行的实心菱形。
 *
 * 11. 使用for循环打印一个由*组成的9行的空心菱形。
 *
 * 12. 初始条件：1900年1月1日是星期一，计算从1900年1月1日到2021年1月1日共有多少天。
 *
 * 13. 初始条件：1900年1月1日是星期一，计算从1900年1月1日到2021年10月1日共有多少天。
 *
 * 14. 初始条件：1900年1月1日是星期一，计算2021年1月1日是星期几。
 *
 * 15. 初始条件：1900年1月1日是星期一，计算2021年10月1日是星期几。
 *
 * 16. 输出九九乘法表
 *
 * 17. 打印杨辉三角行（一直输出到第九行）
 *
 * 18. 输出以下形状
 *
 *     ```
 *     *
 *     **
 *     ***
 *     ****
 *     *****
 *     ******
 *     *****
 *     ****
 *     ***
 *     **
 *     *
 *     ```
 *
 * 19. 输出以下形状:
 *
 *     ```
 *     * * * * * * * * * *
 *     *                       *
 *     *                       *
 *     *                       *
 *     *                       *
 *     * * * * * * * * * *
 *     ```
 *
 * 20. 输出以下形状
 *
 *     ```
 *         *
 *        **
 *       ***
 *      ****
 *     *****
 *      ****
 *       ***
 *        **
 *         *
 *     ```
 *
 * 21. 把 9527 转成 二进制 形式 (使用循环)
 *
 *     ```
 *          思路：9527 % 2 = 1;
 *                   9527 / 2 = 4763;
 *                   4763 % 2 = 1;
 *                   4763 / 2 = 2381;
 *                   .........
 *         提示：步进(迭代部分)使用 /=
 *     ```
 *
 * 22. 使用 while 循环，把任意一个正整数拆分
 *
 *     ```
 *     举例：1234567 --> 1,2,3,4,5,6,7
 *     ```
 *
 * 23. 使用循环列出 100 以内的所有质数(素数)
 *
 *     ```
 *     质数：只能被 1 和 本身整除的正整数
 *          int a = 77;
 *          a % 1 == 0;
 *          a % 77 == 0 ;
 *          a % 其它 != 0
 *     ```
 *
 * 24. 实现把二进制计算成十进制
 *
 *     ```
 *     a = 110101 --> 十进制数
 *     101 ---> 5
 *     ```
 *
 * 25. 写一个程序，用来做华氏温度到摄氏温度的转换。
 *
 *     ```
 *     该程序需要定义一个变量代表华氏温度，经过运算后输出相应的摄氏温度。
 *     利用如下公式进行换算：  C = 5 (F - 32) / 9
 *     ```
 *
 * 26. 写一个程序定义一个char变量并赋值，然后判断该char变量是不是一个小写字母， 如果是则将其转换为大写并输出；如果不是则输出错误信息。
 *
 *
 * 27. 猜数字的游戏
 *
 *     ```
 *     编写程序，实现控制台的猜数字游戏。游戏运行时产生一个0－1000之间的随机整数，
 *     要求用户从控制台输入数字，
 *     若输入的数字比产生的数字小，则输出：“太小了，再大一点！”；
 *     若输入的数字比产生的数字大，则输出：“太大了，再小一点！”，
 *     若输入的数字和产生的数字相等，则输出：“恭喜你猜对了！”然后退出程序；
 *     若用户猜了10次还未猜对，则输出：“你太笨了，下次再来吧！”然后退出程序。
 *     ```
 *
 *
 * @author small瑞
 */
public class Exercises {
    public static  int sun(int n){
        int i = 1,ans = 0;
        while(i <= n){
            ans+=i;
            i++;
        }
        return ans;
    }                //First
    public static  int sunEven(int n){
        int i = 0 ,ans = 0;
        while(i<=n){
            ans+=i;
            i+=2;
        }
        return ans;
    }            //Second
    public static int sunOdd(int n){
        int i = 1 ,ans = 0;
        while(i<=n){
            ans+=i;
            i+=2;
        }
        return ans;
    }              //Third
    public static boolean isPrime(int n){
        if(n == 1 || n == 2 || n == 5) {
            return true;
        }
        if(n%2 == 0 || n%10 == 5) {
            return false;
        }
        int t = 0;
        while(n != 0){
            t +=(n%10);
            n = n/10;
        }
        if(t%3 == 0) {
            return false;
        }
        return true;
    }         //fourth
    public static void drawTriangle(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j >=0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }      //7. 使用for循环打印一个由*组成的5行的直角三角形。
    public static void drawIsosceles(int n){    //使用for循环打印一个由*组成的5行的等腰三角形。
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j <=i ; j++){
                System.out.print("*");
            }
            for(int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void drawIsosceles2(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < n-i ; j++){
                System.out.print("*");
            }
            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }      //使用for循环打印一个由*组成的5行的倒置等腰三角形。
    public static int toInverse(int n){            // 使用while结构将一个10进制的数转换成它的逆序数，比如1234的逆序数是4321。
        int i = 0 , ans = 0 ;
        int len = String.valueOf(n).length();
        while(i < len){
            ans += Math.pow(10,(len - i-1))*(n%10);
            n/=10;
            i++;
        }
        return ans;
    }
    public static void drawLozenge(int n){        //使用for循环打印一个由*组成的9行的实心菱形
        for(int i = 0 ; i < n/2 + 1 ; i++){
            for(int j = 0 ; j < n/2 -i; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j <=i ; j++){
                System.out.print("*");
            }
            for(int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0 ; i < n/2 ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n / 2 - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void drawLozenge2(int n){
        for(int i = 0 ; i < n/2 + 1 ; i++){
            for(int j = 0 ; j < n/2 -i; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j <=i ; j++){
                if(j ==0) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for(int j = 0 ; j < i ; j++){
                if(j == i-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = 0 ; i < n/2 ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n / 2 - i; j++) {
                if(j == 0) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n / 2 - i - 1; j++) {
                if(j == n/2-i-2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }     //使用for循环打印一个由*组成的9行的空心菱形。
    public static void drawTable(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <=i ; j++){
                System.out.print(i + "*" + j + "=" + i*j + " ");
            }
            System.out.println();
        }
    }
    public static void yangHuiTriangle(int n) throws Exception{
        List<List<Integer>> arr =new ArrayList<List<Integer>>() ;
        for(int i = 0 ; i < n ; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0 ; j <=i ; j ++){
                if( i == j || j == 0) {
                    list.add(1);
                }
                else if(i>1){
                    list.add(arr.get(i-1).get(j)+arr.get(i-1).get(j-1));
                }

            }
            arr.add(new ArrayList<>(list));
            list.clear();
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        //System.out.println(sun(100));
        //System.out.println(sunEven(100));
        //System.out.println(sunOdd(100));
        /*
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n) ? "这个数是质数":"这个数不是质数");
        */
        //drawTriangle(5);
        //drawIsosceles(5);
        /*
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("n的倒序为:"+toInverse(n));
         */
        //drawIsosceles2(5);
        //drawLozenge(9);
        //drawLozenge2(9);
        //drawTable(9);
        yangHuiTriangle(9);


    }

}
