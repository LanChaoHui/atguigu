/*
使用switch 把小写类型的char型转为大写。只转换a, b, c, d, e. 其它的输出“other”。
提示：String word = scan.next();  char c = word.charAt(0); switch(c){}
*/
import java.util.Scanner;
class SwitchCaseTest5 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入字母：");
		String word=scan.next();
		char c=word.charAt(0);
		switch(c){
			case 'a':
			System.out.println("A");
			break;
			case 'b':
			System.out.println("B");
			break;
			case 'c':
			System.out.println("C");
			break;
			case 'd':
			System.out.println("D");
			break;
			case 'e':
			System.out.println("E");
			break;
			default:
			System.out.println("other");
		}
	}
}
