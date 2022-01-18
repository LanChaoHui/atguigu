/*
编写程序：从键盘上读入一个学生成绩，存放在变量score中，根据score的
值输出其对应的成绩等级：
score>=90 等级: A
70<=score<90 等级: B
60<=score<70 等级: C
score<60 等级: D
方式一：使用if-else
方式二：使用switch-case: score / 10: 0 - 10

说明：
1. 凡是可以使用switch-case的结构，都可以转换为if-else。反之，不成立
2. 当我们写分支结构时，当发现既可以使用switch-case（同时case，swich中表达式的取值情况不太多），
又可以使用if-else时，我们优先选择switch-case。原因：switch-case 执行效率稍高。
*/
import java.util.Scanner;
class  SwitchCaseTest4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // 方式1
        System.out.println("请输入学生成绩：");
        int score=scan.nextInt();
        if(score >= 90) {
            System.out.println("等级：A");
        } else if(70 <= score&& score< 90) {
            System.out.println("等级：B");
        } else if(60 <= score&&score < 70) {
            System.out.println("等级：C");
        } else {
            System.out.println("等级：D");
        }
        // 方式2
        int tempScore= score/10;
        switch(tempScore) {
        case 10:
        case 9:
            System.out.println("等级：A");
            break;
        case 8:
        case 7:
            System.out.println("等级：B");
            break;
        case 6:
            System.out.println("等级：C");
            break;
        default:
            System.out.println("等级：D");

        }
    }
}
