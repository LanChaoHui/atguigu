/**
	������������֮�������
	ǰ�᣺ �������۵�ֻ��7�ֻ����������ͱ���������㣬������boolean���͵ġ�

	1. �Զ�����������
			���ۣ�������С���������͵ı�������������������͵ı���������ʱ���ṹ�Զ�����Ϊ�����������
			byte��char ��short -->short-->int-->long-->float-->double

			�ر�ģ���byte��char��short �������͵ı���������ʱ�����Ϊint���� 
			
	2. ǿ������ת���� �� VariableTest3


	˵������ʱ��������Сָ���ǣ���ʾ���ķ�Χ�Ĵ��С�����磺float����Ҫ����long������
*/
class  VariableTest2 {
    public static void main(String[] args) {
        byte b1=2;
        int  i1 =129;
        // ���벻ͨ��
        // byte b2 = b1+i1;
        int i2=b1+i1;
        long l1=b1+i1;
        System.out.println(i2);

        float f=b1+i1;
        System.out.println(f);

        short s1=123;
        double d1=s1;
        System.out.println(d1);// 123.0
		//**************************************
		char c1='a';//97
		int i3=10;
		int i4=c1+i3;
		System.out.println(i4);//107

		short s2=10;
		// char c2=c1+s2;// ���벻ͨ��

		byte b2=10;
		char c3 =c1+b2;

    }
}
