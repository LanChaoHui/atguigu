/*
	100 ������������
	������������ֻ�б�1����������������Ȼ����--> ��2��ʼ���������-1����λ�ã������ܱ��������������
	��С�������ǣ�2
*/
class  PrimeNumberTest {
    public static void main(String[] args) {
		boolean isFlag=true;// ��ʶI�Ƿ�j������һ���������޸���ֵ
        for(int i=2; i<=100; i++) {// ����һ����Ϊ����Ȼ��
            for(int j=2; j<i; j++) {// ��iȥ��
				if(i%j==0){// i ��j����
					isFlag=false;
				}
            }
			// ��ʱ
			if(isFlag){
				System.out.println(i);
			}else{
				boolean isFlag=true;
			}
        }
    }
}
