package looptest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author small瑞
 *         // * 19. 酒店前台客房管理系统（控制台版本）
 *         // *
 *         // *     ```
 *         // *     为某酒店设计一套简单的前台房间管理系统，该系统可以通过在命令行输入命令来为客人办理入住和退房手续。要求该系统支持通过命令行输入以下命令来进行入住，退房及查询的操作：
 *         // *     search  ：查询所有房间的状态
 *         // *     in 1202 tangliang  ：姓名为tangliang的客人入住1202房间
 *         // *     out 1202：1202房间退房
 *         // *     quit：退出程序
 *         // *     说明 ：
 *         // *     1）该习题主要考察的知识点：控制台输入，循环控制，数组的使用，方法调用等。
 *         // *     2）酒店房间的状态可以用一个二维数组来存放，
 *         // *          如果有客人已经入住，则存放该客人的姓名，如果没有客人入住，则存放null值。
 *         // *     3）可以从控制台读入命令的第一个单词，来决定调用哪个方法负责处理该类命令。
 *         // *     4）可以将每个命令要完成的功能分别用一个方法来描述，在main方法中调用这些方法。
 *         // *     ```
 */
public class HotelSystem {
    static String[][] room = new String[20][10];
    public static void search(){
        for(int i = 0 , len = room.length ;i<len ; i++){
            for(int j = 0 , len1 = room[0].length ; j < len1 ; j++){
                System.out.print(room[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void in(int i , int j , String name){
        if(room[i][j].equals("空房间")) {
            room[i][j] = name + "已入住!";
            System.out.println("恭喜" + name + "先生/女士已成功入住" + i + "" + j + "号房间");
        }
        else{
            System.out.println("该房间已经有人入住!请更换房间!");
        }
    }
    public static void out(int i , int j ){
        if(!room[i][j].equals("空房间")){
            room[i][j] = "空房间";
            System.out.println("成功退房!");
        }
        else{
            System.out.println("该房间无人居住，无法退房!");
        }
    }
    public static void main(String[] args) {
        for(int i = 0 , len = room.length ;i<len ; i++){
            for(int j = 0 , len1 = room[0].length ; j < len1 ; j++){
                room[i][j] = "空房间";
            }
        }
        Scanner scanner = new Scanner(System.in);
        String cur = "ss" ;
        System.out.println("------------------------欢迎来到small - rui 电竞酒店------------------------");
        while (!cur.equals("exit")){
            System.out.println("请输入指令:");
            cur = scanner.nextLine();
            String curl[] = cur.split(" ");
            if(curl[0].equals("search")){
                System.out.println("酒店当前所有房间信息如下:");
                search();
            }
            else if(curl[0].equals("in")){
                int x = Integer.valueOf(curl[1].substring(0,2));
                int y = Integer.valueOf(curl[1].substring(2));
                System.out.println(x+"---"+y);
                in(x,y,curl[2]);

            }
            else if(curl[0].equals("out")){
                int x = Integer.valueOf(curl[1].substring(0,2));
                int y = Integer.valueOf(curl[1].substring(2));
                out(x,y);
            }
            else if(curl[0].equals("exit")){
                break;
            }
            else{
                System.out.println("输入的指令无法识别，请重新输入!");
            }
        }
        System.out.println("欢迎下次光临!");
        scanner.close();
    }
}
