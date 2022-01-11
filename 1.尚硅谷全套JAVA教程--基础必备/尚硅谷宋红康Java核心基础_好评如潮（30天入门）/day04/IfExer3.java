/*
如何获取一个随机数：10-99
*/
class IfExer3 
{
	public static void main(String[] args) 
	{	
		// 如何获取一个随机数：10-99
		int value=(int)(Math.random()*90+10);//[0.0,0.9999...]--->[0.0-90.0]--->[10.0,100.0]--->[10,99]
		System.out.println(value);
		// 公式：[a,b]:(int)(Math.random*(a-b+1)+a)
	}
}
