/*
	强制类型转换：自动类型提升运算的逆运算
	1. 需要使用强转符:()
	2. 注意点：强制类型转换，可能会导致精度损失
*/
class VariableTest3 {
    public static void main(String[] args) {
        double d1=12.9;
        // 截断操作
        int i1=(int)d1;
        System.out.println(i1);
        long l1=123;
		// 没有精度损失
        short s2=(short)l1;
        System.out.println(s2);
		// 精度损失
		int i2=128;
		byte b=(byte)i2;
		// -128
		System.out.println(b);
    }
}
