/*
While 的使用

一、 循环结构的4要素
① 初始化条件
② 循环条件---> 是boolean 类型
③ 循环体
④ 迭代条件
二、 while 循环的结构
①
while(②){
	③;
	④;
}

执行过程：①——②——③——④——②——③——④——。。。——②
说明：
1. 写while循环千万不要丢了迭代条件，一旦丢了，就会可能导致死循环；
2. 我们写程序，要避免出现死循环；
3. for 循环和while循环，是可以相互转换的！
	区别：for循环和while循环初始化条件部门的作用域不同。

算法：有限性

*/
class WhileTest 
{
	public static void main(String[] args) 
	{
		// 遍历100以内的所有偶数
		int i=1;
		while(i<=100){
			if(i%2==0){
				System.out.println(i);
			}
			i++;
		}
	}
}
