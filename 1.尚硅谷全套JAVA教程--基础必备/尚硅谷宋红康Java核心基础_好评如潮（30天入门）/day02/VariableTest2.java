/**
	������������֮�������
	ǰ�᣺ �������۵�ֻ��7�ֻ����������ͱ���������㣬������boolean���͵ġ�

	1. �Զ�����������
			���ۣ�������С���������͵ı�������������������͵ı���������ʱ���ṹ�Զ�����Ϊ�����������
			byte-->short-->int-->long-->float-->double

	2. ǿ������ת����


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
        System.out.println(d1);
    }
}
