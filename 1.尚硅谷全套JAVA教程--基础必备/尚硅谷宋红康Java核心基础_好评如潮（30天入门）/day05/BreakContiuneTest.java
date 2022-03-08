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
		System.out.println("\n");
		// ***********************************************
		label:for(int i=1;i<=4;i++){
			for(int j=1;j<=10;j++){
				if(j%4==0){
					//break;//  默认跳出宝贵此关键字最近的一层
					//continue;
					//break label;// 结束指定标识的一层循环结构
					continue label;// 结束指定标识一层循环当次循环
				}
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
