/*
�����֮�壺λ�����

���ۣ�
1. λ����������Ķ������͵�����
2. <<����һ����Χ�ڣ������ƶ�һλ���൱��*2
     >> : ��һ����Χ�ڣ������ƶ�һλ�������/2;
�����⣺���У��ʽ�ļ���2 * 8 ? 2<<3 �� 8<<1
*/
class BitTest 
{
	public static void main(String[] args) 
	{
		int  i=21;
		System.out.println("i<<2="+ (i<< 2));
		System.out.println("i<<3="+ (i<< 3));
		System.out.println("i<<3="+ (i<< 27));

		int m=12;
		int n=5;
		System.out.println("m & n :"+(m&n));
		System.out.println("m | n :"+(m|n));
		System.out.println("m ^ n :"+(m^n));
	}
}
