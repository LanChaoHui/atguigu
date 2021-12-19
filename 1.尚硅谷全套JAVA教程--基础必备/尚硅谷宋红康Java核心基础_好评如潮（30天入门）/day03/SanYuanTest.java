/**
	运算符之六：三元运算符
	1. 结构：（条件表达式）？表达式1：表达式2
	2. 说明
	① 条件表达式的结果为boolean 类型
	②根据条件表达式为真或假，决定执行表达式1，还是表达式2
	   如果表示为true,则执行表达式1
	   如果表示为false，则执行表达式2

	  ③ 表达式1 和表达式 2要求是一致的。
	  ④ 三元运算符是可以嵌套的
*/
class  SanYuanTest {
    public static void main(String[] args) {
        // 获取两个整数的较大值
        int m=12;
        int n=5;
        int max= (m>n)?m:n;
        System.out.println(max);

        double num=(m>n)?2:1.0;

        // (m>n)? 2 : "n大"; 编译错误
        // ***************************
        String maxStr =  (m >n ) ?"m大":((m==n)?"m和n相等":"n大");
        System.out.println(maxStr);
        // ****************************
        // 获取三个数的最大值
        int n1=12;
        int n2=30;
        int n3=-43;

        int max1=(n1>n2)?n1:n2;
        int max2=(max1>n3)?max1:n3;
        System.out.println("三个数中的最大值为："+max2);
		// 不建议
       //  int max3= (n1 >n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
        System.out.println("三个数中的最大值为："+max3);

    }
}
