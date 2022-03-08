/*
break和continue关键字
				使用范围			循环中使用的作用			相同点
break ： switch-case
				 循环结构中国     结束单前循环					关键字后面不能声明执行语句
contiune:  循环结构中		   结束当次循环

*/
class BreakContiuneTest 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<10;i++){
			if(i%4==0){
				break; //123
				//continue;//12356789
				//System.out.println("不会执行！！！");
			}
			System.out.print(i);
		}
		System.out.println();
		// ***********************************************
		for(int i=1;i<=4;i++){
			for(int j=1;j<=10;j++){
				if(j%4==0){
					break;
				}
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
