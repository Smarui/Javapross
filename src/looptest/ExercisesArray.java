package looptest;

import java.util.*;

/**
 * @author small瑞
 * 11.
 *
 * 12. 使用多个函数的形式完成打印某年日历。
 *
 * 13. 排序数组
 *
 *     设存在以下数组:
 *
 *     ```java
 *     		// 设 names 数组中存放学生姓名
 *     		String[] names = { "雷军" , "马云" , "周鸿祎" , "丁磊" , "李彦宏" };
 *
 *     		// 设 courses 数组中依次存放三门课程的名称
 *     		String[] courses = { "C++" , "Java" , "English" };
 *
 *     		// 设 scores 数组中依次存储的是 names 数组中各个学生的 C++ 、Java 、English 课程的成绩
 *     		int[][] scores = {
 *                           {  90 ,  89 ,  75 } ,
 *                           {  59 ,  40 , 100 } ,
 *                           { 100 ,  99 ,  80 } ,
 *                           {  80 ,  61 ,  61 } ,
 *                           {  60 , 100 ,  99 } ,
 *                          };
 *     ```
 *
 *     尝试设计程序，根据各门课程的总分进行排序(降序排列)，
 *
 *     并输出学生姓名、每门课程的名称和该学生的成绩、该学生的总成绩
 *
 *
 *
 * 15. 六十甲子
 *
 *     ```
 *     声明三个数组，分别表示 `中国纪年法` 中的 `天干` 、`地支` ，以及 `生肖` :
 *
 *
 *     public static void main( String[] args ) {
 *
 *       char[] heavenlyStems = { '甲' , '乙' , '丙' , '丁' , '戊' , '己' , '庚' , '辛' , '壬' , '癸' };
 *
 *       char[] earthlyBranches = { '子' , '丑' , '寅' , '卯' , '辰' , '巳' ,
 *                            		 '午' , '未' , '申' , '酉' , '戌' , '亥' };
 *
 *       // 输出六十甲子名称 ( 要求每行输出12个，总共输出 5 行 )
 *
 *     }
 *
 *
 *     在中国古代的纪年法中，采用`天干`和`地支`相组合的方式来表示一个年份，其组合规则为:
 *
 *
 *     甲子、乙丑、丙寅、丁卯、戊辰、......、壬申、癸酉、甲戌、乙亥、丙子、丁丑、戊寅、...... 、壬戌、癸亥
 *
 *
 *     其中 `甲子` 是第一个组合，也是一个甲子六十年的开始。
 *
 *     十天干与十二地支按顺序两两相配，从**甲子**到**癸亥**，共六十个组合，称六十甲子。( 60年一个循环 )
 *     ```
 *

 * 17. 翻转数组
 *
 *     ```

 *
 *     ```
 *
 *     现要求在保证原数组中所有元素不发生更改的前提下，通过遍历输出数组中的每个元素，输出形式变成 :
 *
 *     ```
 *       不    打    处    春
 *       知    上    处    眠
 *       死    敌    蚊    不
 *       了    敌    子    觉
 *       谁    畏    咬    晓
 *     ```
 *

 *
 * 20. 学生成绩查询系统（控制台版本）
 *
 *     ```
 *     将所有学生的课程成绩保留在一个二维数组中，每一行代表一个学生的成绩，每一列代表一门课程的成绩；将每门课程的名称保留在一个一维数组中（课程的下标序号与二维数组的列号匹配）；将每个学生的姓名保留在一个一维数组中（学生的下标序号与二维数组的行号匹配）；要求编写程序实现成绩的查询，程序运行时从命令行输入统计命令及参数，程序则输出结果，例如：
 *     AVG corejava：统计课程corejava的平均分。
 *     AVG 张三：统计学生张三的平均分。
 *     SORT sum：列出总分的排序。
 *     SORT corejava：列出corejava课程的成绩的排序。
 *     SUM 张三：统计学生张三的总分。
 *     GET 张三 corejava：统计张三的corejava课程的成绩。
 *     EXIT：退出程序。
 *
 *     说明 ：
 *     1）该习题主要考察的知识点：控制台输入，循环控制，数组的使用，方法调用等。
 *     2)二维数组的结构如下：
 *        87  98  65  77
 *        69  75  68  91
 *        81  70  69  72
 *        90  88  82  76
 *        92  74  51  82
 *        学生数组的结构：
 *        zhangsan  lisi  wangwu  zhaoliu  qianqi
 *
 *        课程数组的结构：
 *        corejava  JDBC  javaWeb  EJB
 *     ```
 *
 * 21. 五子棋游戏（控制台版本）
 *
 *     ```
 *     描述：编写程序实现两人互玩的五子棋游戏，游戏开始时要求在控制台输出以下棋盘,然后提示黑方或白方下子,玩家从命令行输入:6 8,表示在6,8坐标位置落子,其中黑方的子用@表示,白方的子用O表示,每有一方落子,则要重新输出棋盘的状态.程序还要能判断某一方获胜,并终止游戏。
 *
 *     棋盘状态：
 *        0   1   2   3   4   5   6   7   8   9   a   b   c   d   e   f
 *     0  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
 *     1  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
 *     2  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
 *     3  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
 *     4  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
 *     5  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
 *     6  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
 *     7  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
 *     8  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
 *     9  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
 *     a  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
 *     b  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
 *     c  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
 *     d  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
 *     e  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
 *     f  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
 *
 *     说明：
 *     1）可以用二维字符数组来保存棋盘的状态。
 *     2）当某一方落子后要判断这一方是否赢了。
 *     ```
 *
 * 22. 炸金花游戏（控制台版本）
 *
 *     ```
 *     描述：编写程序实现砸金花的扑克游戏，程序允许用户和电脑对玩，程序开始时要求用户输入总赌本，电脑和玩家的赌本一样多。每次开局前，提示用户输入本次赌注，并在一副牌中随机发两手牌（去掉大小王），每手牌三张，然后比较这两手牌的大小，若A比B大，则用户赢得赌注，反之，则输掉赌注，直到有一方（用户或电脑）的赌注为0，则退出游戏。
 *     每手牌的大小比较规则：
 *     1）三条>同花顺>同花>顺子>对子>单张
 *     2）处于同一级别的两手牌比较最大的一张牌的大小
 *     3）若两手牌同为对子，则应比较成对的那张牌的大小
 *
 *     说明：
 *     1）可以用一个三位的整数来表示一张扑克牌，百位数字代表扑克牌的花色（1～4），十位和个位数组代表扑克牌的点数（2～14），例如：308代表梅花8；412代表方块Q。
 *     2）随机发牌时要保证不能出现重复的牌。
 *     3）比较两手牌大小的时候，可以将每一手牌转化为一个7位的整数，来比较这个整数的大小。
 *     ```
 */
public class ExercisesArray {
    public static void main(String[] args)throws Exception{
        /*  //1. 将一个整数的每一位放入数组中。
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        while(a != 0){
            int temp = a%10;
            int arr[] =new int[10];
            Arrays.fill(arr , temp);
            a = a/10;
            System.out.println(Arrays.toString(arr));
         */
        /*   //2. 在数组中查找某个数的位置。   //3. 在数组中查找某个数，结果为是否存在。
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int [] arr =new int[1000];
        for(int i = 0 ; i < 1000 ; i ++){
            arr[i] = (int)(100*Math.random());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,a));
         */
            // 4. 求整型数组中所有元素的平均值。 5. 将整型数组使用冒泡排序方法，排成升序数组。6. 将整型数组使用冒泡排序方法，排成降序数组。7. 获得整型数组中最大的元素值。 9. 获得整型数组中最小的元素值。
        /*
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[100];
        for(int i = 0 , len =arr.length; i < len ; i++ ){
            arr[i] = (int)(100*Math.random());
        }
        int ans = 0;
        for(int i : arr){
            ans+=i;
        }
        for(int i = 0 ,len = arr.length ; i <len ; i++){
            for(int j = 0 ; j < len - i -1 ; j++ ){
                if(arr[j] > arr[j+1]){
                    arr[j]   ^= arr[j+1];
                    arr[j+1] ^= arr[j];
                    arr[j]   ^= arr[j+1];
                }
            }
        }
        int a = 8 , b = 11 ;
        a ^=b;b^=a;a^=b;
        System.out.println(a+" "+b);
        System.out.println(ans/arr.length);
        System.out.println(Arrays.toString(arr));
        for(int i = 0 ,len = arr.length ; i <len ; i++){
            for(int j = 0 ; j < len - i -1 ; j++ ){
                if(arr[j] < arr[j+1]){
                    arr[j]   ^= arr[j+1];
                    arr[j+1] ^= arr[j];
                    arr[j]   ^= arr[j+1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
        System.out.println("---------------------------------------------");//最大值索引  和  最小值索引
        int [] arrt = new int[100];
        for(int i = 0 , len =arrt.length; i < len ; i++ ){
            arrt[i] = (int)(100*Math.random());
        }
        int max = 0 ,min = 0 ;
        for(int i = 0 ,len = arrt.length; i <len ; i ++){
            if(arrt[i] > arrt[max]) {
                max = i;
            }
            if(arrt[i] < arrt[min]) {
                min = i;
            }
        }
        System.out.println(max +"---" +min);
        System.out.println("-----------------------------------------------------------");
        //使用多个函数的形式完成石头剪刀布游戏。使用Scanner,Random,Integer等类。
        String[] names = { "雷军" , "马云" , "周鸿祎" , "丁磊" , "李彦宏" };
        String[] courses = { "C++" , "Java" , "English" };
        int[][] scores = {
                            {  90 ,  89 ,  75 } ,
                            {  59 ,  40 , 100 } ,
                            { 100 ,  99 ,  80 } ,
                            {  80 ,  61 ,  61 } ,
                            {  60 , 100 ,  99 } ,
            };
        Map<Integer,Integer> map = new HashMap<>();
        int [] scoresum = new int[names.length];
        for(int i = 0 ,len = names.length ;i<len; i++){
            for(int j = 0 , len1 = courses.length;j<len1;j++){
                scoresum[i] += scores[i][j];
            }
        }
        for(int i = 0,len = names.length;i<len;i++){
            map.put(scoresum[i],i);
        }
        System.out.print("      ");
        for(String i :courses){
            System.out.print(i+"   ");
        }
        Arrays.sort(scoresum);
        System.out.println("总分");
        for(int i = 0 ,len=names.length ;i<len; i++){
            System.out.print(names[map.getOrDefault(scoresum[len-i-1],0)] + "   ");
            for(int j = 0, len1 = courses.length;j<len1;j++){
               System.out.print(scores[map.getOrDefault(scoresum[len-i-1],0)][j]+"     ");
            }
            System.out.println(scoresum[len-i-1]);

        }

         */
        int arr1[] = new int[]{1,2,3,4,5};
        int arr2[] = new int[]{1,2,3,4,5};
        System.out.println(Arrays.equals(arr1,arr2));
        // 16. 33选7 编写一段程序，实现从 1 到 33 之间随机选择 7 个不重复的数字放入到数组中，最后将遍历数组输出这7个数字。
        Object[] cur = new Object[7] ;
        Set<Double> set = new HashSet<>();
        while(set.size()<7){
            set.add(Math.random()*33);
        }
        cur = set.toArray();
        System.out.println(Arrays.toString(cur));
        System.out.println("--------------------------------");
        char[][]  chunxiao = {
                { '春' , '眠' , '不' , '觉' , '晓' }  ,
                { '处' , '处' , '蚊' , '子' , '咬' } ,
                { '打' , '上' , '敌' , '敌' , '畏' } ,
                { '不' , '知' , '死' , '了' , '谁' }
        };
        for(int i = 0 , len = chunxiao[0].length ; i<len ; i++){
            for(int j = 0 , len1 = chunxiao.length ; j < len1 ; j++){
                System.out.print(chunxiao[j][i]+"  ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
        //* 18. 算术运算练习器
        // *
        // *     ```
        // *     编写程序，实现一个简单的算术运算的练习器，程序运行时随机生成两个两位数，
        // *           和一个运算符（+，-，×，/），并组成一个表达式输出出来，然后读取用户的输入答案，
        // *           如果输入答案正确，则输出祝贺信息，若输入答案错误则提示重来一次。
        // *     ```
        // *
        /*
        Scanner scanner = new Scanner(System.in);
        List<Character> list = new ArrayList<>();
        list.add('+');
        list.add('-');
        list.add('*');
        list.add('/');
        double x = Math.random()*100;
        double y = Math.random()*100;
        int ran = (int)(Math.random()*4);
        System.out.println("请输入以下算式你认为的正确答案:");
        System.out.println(x+" "+list.get(ran)+" "+y+" "+"="+"?");
        double end = 0.0;
        if(ran ==0) end = x+y;
        if(ran ==1) end = x-y;
        if(ran ==2) end = x*y;
        if(ran ==3) end = x/y;
        double ans= scanner.nextDouble();
        if(ans == ran)System.out.println("恭喜回答正确!");
        else System.out.println("很遗憾回答错误!");
        */




    }
}
