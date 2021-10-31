class VariableTest4 
{
	public static void main(String[] args) 
	{
		// 1. 编码情况1；123213默认是int 类型用long类型去接收会自动类型提升，所以可以不用加L
		long l=123213;
		System.out.println(l);
		// 编译失败：过大的整数,1111111111111111111 超过int类型的范围，必须使用L后面去做标记
		//long l1=1111111111111111111;
		long l1=1111111111111111111L;

		// ***************************
		// 编译失败,默认类型为double型,可以使用强制类型转换或者后面加F使之变为float类型，提是值的范围属于float的类型范围
		// float f1=12.3;

		// 2. 编码情况2
		// 整型常量，默认类型为int
		// 浮点型常量，默认类型为double型
		byte b=12;
		// byte b1=b+1; // 编译失败
		// float f1=b+12.3;//编译失败

	}
}
