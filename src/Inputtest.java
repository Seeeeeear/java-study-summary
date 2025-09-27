import java.util.Scanner; // 导入Scanner类
public class Inputtest {
        // public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        // System.out.println("请输入上次成绩：");
        // int lastScore = scanner.nextInt(); // 读取整数输入
        // System.out.println("请输入本次成绩：");
        // int currentScore = scanner.nextInt();
        // int scoreDifference = currentScore - lastScore; // 计算成绩差
        // System.out.println("成绩差为: " + scoreDifference); // 输出成绩差
        // float improvement = (float)scoreDifference / lastScore * 100;
        // System.out.println("成绩提升百分比为: " + improvement + "%");
        // scanner.close(); // 关闭Scanner对象
    // }
    // public static void main(String[] args){
    //     String fruit = "banana";
    //     switch (fruit){
    //     case "apple" -> System.out.println("苹果");
    //     case "banana" -> System.out.println("香蕉");
    //     case "orange" -> System.out.println("橙子");
    //     default -> System.out.println("未知水果");

    //     }
    // }
    // public static void main(String[] args){
    //     int [] ns = {1,2,3,4,5};
    //     for (int i=ns.length-1;i>=0;i--){
    //         System.out.println(ns[i]);
    //     }
    // }
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.print(arg);
        }
    }
}

