/*
	100 ������������
	������������ֻ�б�1����������������Ȼ����--> ��2��ʼ���������-1����λ�ã������ܱ��������������
    �ԣ�PrimeNumberTest.java�ļ����������������Ż�
*/
class  PrimeNumberTest1 {
    public static void main(String[] args) {
        boolean isFlag=true;// ��ʶI�Ƿ�j������һ���������޸���ֵ
		int count = 0;// ������¼�����ĸ���
        // ��ȡ��ǰʱ����룬1970-01-01 00:00:00 �ĺ�����
        long start = System.currentTimeMillis();
        for(int i=2; i<=100000; i++) {// ����100000��Ϊ����Ȼ��
			// �Ż������Ա�������������Ȼ������Ч�ġ�
			// for(int j=2; j< i; j++) {
            for(int j=2; j< Math.sqrt(i); j++) {// ��iȥ��
                if(i%j==0) { // i ��j����
                    isFlag=false;// �Ż�һ��ֻ�Ա������������Ȼ����Ч��
                   break;
                }
            }
            // ��ʱ
            if(isFlag) {
               // System.out.println(i);
			   count++;
            } else {
                // ����isFlag
                isFlag=true;
            }
        }
        // ��ȡ��ǰʱ����룬1970-01-01 00:00:00 �ĺ�����
        long end = System.currentTimeMillis();
		System.out.println("�����ĸ���Ϊ��"+count);
        System.out.println("�����ѵ�ʱ��Ϊ��"+(end-start));// 11562 - �Ż�һ:break:978 - �Ż�����11
    }
}