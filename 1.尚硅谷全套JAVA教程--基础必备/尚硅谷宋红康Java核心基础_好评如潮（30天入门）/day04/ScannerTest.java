/*
如何从键盘获取不同类型的变量；需要使用Scanner类
具体实现步骤：
1.导入包：import java.util.Scanner
2. Scanner 的实例化:Scanner scan=new Scanner(System.in);
3.  调用Scanner类的相关方法，来获取我们指定类型的数值
*/
import java.util.Scanner;
class ScannerTest 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(num);
	}
}
