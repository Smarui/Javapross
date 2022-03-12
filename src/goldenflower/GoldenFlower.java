package goldenflower;

import java.util.*;

/**
 * @author small瑞
 * 描述：编写程序实现砸金花的扑克游戏，程序允许用户和电脑对玩，程序开始时要求用户输入总赌本，电脑和玩家的赌本一样多。
 * 每次开局前，提示用户输入本次赌注，并在一副牌中随机发两手牌（去掉大小王），每手牌三张，然后比较这两手牌的大小，若A比B大，则用户赢得赌注，反之，则输掉赌注，直到有一方（用户或电脑）的赌注为0，则退出游戏。
 * 每手牌的大小比较规则：

 * 2）处于同一级别的两手牌比较最大的一张牌的大小
 * 3）若两手牌同为对子，则应比较成对的那张牌的大小
 *
 * 说明：
 * 1）可以用一个三位的整数来表示一张扑克牌，百位数字代表扑克牌的花色（1～4），十位和个位数组代表扑克牌的点数（2～14），例如：308代表梅花8；412代表方块Q。
 * 2）随机发牌时要保证不能出现重复的牌。
 * 3）比较两手牌大小的时候，可以将每一手牌转化为一个7位的整数，来比较这个整数的大小。
 */
public class GoldenFlower {
    static LinkedList<Integer> D = new LinkedList<Integer>();
    static void Shuffle(){  //洗牌
        StringBuilder sb = new StringBuilder();
       for(int i = 1 ; i <= 4 ; i ++){
           for( int j = 2 ; j <= 14 ; j++){
               if(j>=10) {
                   int cur = Integer.parseInt(sb.append(i).append(j).toString());
                   D.add(cur);
                   sb.delete(0,3);
               }
               else{
                   int cur = Integer.parseInt(sb.append(i).append(0).append(j).toString());
                   D.add(cur);
                   sb.delete(0,3);
               }
           }
       }
    }
    static int[] Deal(){ //发牌
        int []play = new int[3];
        for(int i = 0 ; i < 3 ; i++){
            int cur = (int)(Math.random()*52);
            play[i] = D.get(cur);
            D.remove(cur);
        }
        return play;
    }
    static int level(int[]play1){  //判级别
        int l = 0 ;
        int [] t1 = new int[3];
        int [] t2 = new int[3];
        for(int i = 0 ; i < 3 ; i++){
            t1[i] = play1[i]/100;
        }
        for(int i = 0 ; i < 3 ; i++){
            t2[i] = play1[i]%100;
        }
        Arrays.sort(t2);
        Arrays.sort(t1);
        //三条
        if(t2[0] == t2[1] && t2[0] == t2[2]){
            l = 1;
        }
        //同花顺
        else if(t2[2] - t2[0] == 2 &&t1[0]*3 == t1[0]+t1[1]+t1[2]){
            l = 2;
        }
        //同花
        else if(t1[0]*3 == t1[0]+t1[1]+t1[2]){
            l = 3;
        }
        //顺子
        else if(t2[2] - t2[0] == 2){
            l = 4;
        }
        else if(t2[0] == t2[1] ||t2[0] == t2[2] || t2[1] == t2[2]){
            l = 5;
        }
        else{
            l = 6;
        }

        return l;
    }
    static int size(int level ,int[] play1, int[] play2){ //大小
        int ans ;
        int [] t11 = new int[3];
        int [] t12 = new int[3];
        int [] t21 = new int[3];
        int [] t22 = new int[3];
        Arrays.sort(t12);
        Arrays.sort(t11);
        Arrays.sort(t22);
        Arrays.sort(t21);
        for(int i = 0 ; i < 3 ; i++){
            t11[i] = play1[i]/100;
            t21[i] = play2[i]/100;
        }
        for(int i = 0 ; i < 3 ; i++){
            t12[i] = play1[i]%100;
            t22[i] = play2[i]%100;
        }
        if(level == 1){
            if(t12[0]>t22[0]){
                ans = 1 ;
            }
            else{
                ans = 2;
            }
        }
        else if(level == 2){
            if(t11[0]>t21[0]){
                ans = 1;
            }
            else if(t11[0]<t21[0]){
                ans = 2;
            }
            else{
                if(t12[0]>t22[0]){
                    ans = 1;
                }
                else{
                    ans = 2;
                }
            }
        }
        else if(level ==3){
            if(t11[0]>t21[0]){
                ans = 1 ;
            }
            else if(t11[0]<t21[0]){
                ans = 2;
            }
            else{
                if(t12[2] > t22[2]){
                    ans = 1;
                }
                else if(t12[2] < t22[2]){
                    ans = 2;
                }
                else{
                    if(t12[1] > t22[1]){
                        ans = 1;
                    }
                    else if(t12[1] < t22[1]){
                        ans = 2;
                    }
                    else{
                        if(t12[0] > t22[0]){
                            ans = 1;
                        }
                        else{
                            ans = 2;
                        }
                    }

                }
            }
        }
        else if(level == 4){
            if(t12[2] > t22[2]){
                ans = 1;
            }
            else{
                ans = 2;
            }
        }
        else if(level == 5){
            int s1 = 0 , s2 = 0 ;
            if(t12[0] == t12[1]){
                s1 = t12[0];
            }
            else {
                s1 = t12[2];
            }
            if(t22[0] == t22[1]){
                s2 = t22[0];
            }
            else {
                s2 = t22[2];
            }
            if(s1>s2){
                ans = 1;
            }
            else {
                ans = 2;
            }
        }
        else {
            if(t12[2]>t22[2]){
                ans = 1;
            }
            else if(t12[2]<t22[2]){
                ans = 2;
            }
            else{
                if(t12[1]>t22[1]){
                    ans = 1;
                }
                else if(t12[1]<t22[1]){
                    ans = 2;
                }
                else {
                    if(t12[0]>t22[0]){
                        ans = 1;
                    }
                    else{
                        ans = 2;
                    }
                }
            }
        }
        return ans;
    }
    // 1）三条>同花顺>同花>顺子>对子>单张
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"三条");
        map.put(2,"同花顺");
        map.put(3,"同花");
        map.put(4,"顺子");
        map.put(5,"对子");
        map.put(6,"散牌");
        System.out.println("欢迎来到吃人不吐骨头赌博机---------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的尊称:");
        String name = scanner.nextLine();
        System.out.print("请充值你的赌金:");
        int playmon = scanner.nextInt();
        int macmon = playmon;
        while(playmon>0 || macmon>0) {
            Shuffle();
            System.out.print("请输入您的押注金额:");
            int mon = scanner.nextInt();
            int[] play = Deal();
            int[] machine = Deal();
            int playle = level(play);
            int macle = level(machine);
            System.out.println(name+"的牌为:"+map.get(playle)+Arrays.toString(play));
            System.out.println("无敌暴龙战神的牌为:"+map.get(macle)+Arrays.toString(machine));
            if(playle<macle){
                playmon+=mon;
                macmon -= mon;
                System.out.println(name+"获胜!您的资产为:"+playmon);
                if(playmon<=0){
                    System.out.println("傻逼输了吧");
                    System.out.println(name+"您破产了!");
                    break;
                }
                if(macmon<=0){
                    System.out.println("您的对手破产了!手下留情!");
                    break;
                }

            }
            else if(playle>macle){
                playmon-=mon;
                macmon += mon;
                System.out.println(name+"输了!您的资产为:"+playmon);
                if(playmon<=0){
                    System.out.println("傻逼输了吧");
                    System.out.println(name+"您破产了!");
                    break;
                }
                if(macmon<=0){
                    System.out.println("您的对手破产了!手下留情!");
                    break;
                }

            }
            else {
                int ans = size(playle,play,machine);
                if(ans == 1){
                    playmon+=mon;
                    macmon -= mon;
                    System.out.println(name+"获胜!您的资产为:"+playmon);
                    if(playmon<=0){
                        System.out.println("傻逼输了吧");
                        System.out.println(name+"您破产了!");
                        break;
                    }
                    if(macmon<=0){
                        System.out.println("您的对手破产了!手下留情!");
                        break;
                    }

                }
                else{
                    playmon-=mon;
                    macmon += mon;
                    System.out.println(name+"输了!您的资产为:"+playmon);
                    if(playmon<=0){
                        System.out.println("傻逼输了吧");
                        System.out.println(name+"您破产了!");
                        break;
                    }
                    if(macmon<=0){
                        System.out.println("您的对手破产了!手下留情!");
                        break;
                    }

                }
            }
        }

    }
}
