/*
	String���ͱ�����ʹ��
	1. String ���������������ͣ�����Ϊ���ַ���
	2. ����String���ͱ���ʱ��ʹ��һ��""
	3. String ���Ժ�8�л������ݱ��������㣬������ֻ�����������㣺+
	4. ����Ľṹ��Ȼ��String����
*/
class StringTest 
{
	public static void main(String[] args) 
	{
		String s1="Hello World!";
		System.out.println(s1);
		
		String s2="a";
		String s3="";
		// char ������������һ���ո�
		// char c=''; ���벻ͨ��
		// ************************************
		int number=1001;
		String numberStr="ѧ�ţ�";
		String info=numberStr+number;
		System.out.println(info);
		boolean b1=true;
		String info1=info+b1;//+ ����������
		System.out.println(info1);
	}
}
