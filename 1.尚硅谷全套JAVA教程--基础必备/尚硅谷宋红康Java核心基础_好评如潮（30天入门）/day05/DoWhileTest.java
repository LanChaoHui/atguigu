/*
	do-while 循环的使用
	一、循环结构的4g要素
	① 初始化条件
	② 循环条件---> 是boolean 类型
	③ 循环体
	④ 迭代条件
	①
	do{
		③;
		④;
	}while(②)；
	执行过程：①——③——④——②——③——④——。。。——②

	说明：
	1. do-while 循环至少会执行一次循环体！
	2. 开发中，使用for和while更多一些。较少使用doi-while
*/
class  DoWhileTest {
    public static void main(String[] args) {
        // 遍历100以内的偶数，并计算所有偶数的和及偶数的个数
        int num =1;
        int sum=0;// 记录总和
        int count =0;//记录个数
        do {
            if(num%2==0) {
                System.out.println(num);
                sum+=num;
                count++;
            }
            num++;
        } while(num<=100);
        System.out.println("总和为："+sum);
        System.out.println("个数为："+count);
        // ****************体会do-while至少执行一次*****************
        int number = 15;
        while(number>10) {
            System.out.println("hello:while");
            number--;
        }

        int number2=15;
        do {
            System.out.println("hello:do-while");
            number2--;
        } while(number2>10);
    }
}
