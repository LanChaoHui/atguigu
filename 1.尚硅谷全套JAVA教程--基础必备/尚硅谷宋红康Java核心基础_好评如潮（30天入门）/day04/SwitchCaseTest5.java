/*
ʹ��switch ��Сд���͵�char��תΪ��д��ֻת��a, b, c, d, e. �����������other����
��ʾ��String word = scan.next();  char c = word.charAt(0); switch(c){}
*/
import java.util.Scanner;
class SwitchCaseTest5 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("��������ĸ��");
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
