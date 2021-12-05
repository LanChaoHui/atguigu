/**
	运算符之一：算数运算符
	+ - * /  % (前)++ (后)++ 前(--) 后(--) +

*/
class  AriTest {
    public static void main(String[] args) {
        // 除号：/
        int num1 = 12;
        int num2 =5;
        int result1=num1/num2;
        System.out.println(result1);//2

        int  result2= num1/num2*num2;
        System.out.println(result2);//10

        double result3 =num1/num2;
        System.out.println(result3);//2.0

        double result4 = num1/num2 +0.0;// 2.0
        double result5 =  num1/(num2+0.0);//2.4
        double result6 = (double)num1/num2;//2.4
        double result7 = (double)(num1/num2);//2.0
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);

        // %：取余运算
		// 结果的符合与被模数符合相同
		// 开发中，经常使用% 来判断能否被除尽
        int m1 =12;
        int n1=5;
        System.out.println("m1 % n1 = "+ m1%n1);

		int m2 =-12;
        int n2=5;
        System.out.println("m2 % n2 = "+ m2%n2);

		int m3 =12;
        int n3=-5;
        System.out.println("m3 % n3 = "+ m3%n3);

		int m4 =-12;
        int n4=-5;
        System.out.println("m4 % n4 = "+ m4%n4);
    }
}
