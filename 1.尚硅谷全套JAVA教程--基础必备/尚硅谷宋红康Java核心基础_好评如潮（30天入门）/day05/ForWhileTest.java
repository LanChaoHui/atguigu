/*
	题目
	从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序

	说明：
	1. 不在循环条件部分限制吃书的结构：for(;;) 或 while(true)
*/
import java.util.Scanner;
class  ForWhileTest {
    public static void main(String[] args) {
        Scanner sacn=new Scanner(System.in);
        int positiveNumber=0;// 记录正数的个数
        int negativeNumber=0;// 记录负数的个数
        for(;;){ //while(true) {
            int number=sacn.nextInt();
            // 判断number的正负
            if(number>0) {
                positiveNumber++;
            } else if(number<0) {
                negativeNumber++;
            } else {
                // 一旦执行beark,跳出循环
                break;
            }
        }
        System.out.println("输入的正数个数为："+positiveNumber);
        System.out.println("输入的负数个数为："+negativeNumber);
    }
}
