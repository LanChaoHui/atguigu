/**
	�����֮������Ԫ�����
	1. �ṹ�����������ʽ�������ʽ1�����ʽ2
	2. ˵��
	�� �������ʽ�Ľ��Ϊboolean ����
	�ڸ����������ʽΪ���٣�����ִ�б��ʽ1�����Ǳ��ʽ2
	   �����ʾΪtrue,��ִ�б��ʽ1
	   �����ʾΪfalse����ִ�б��ʽ2

	  �� ���ʽ1 �ͱ��ʽ 2Ҫ����һ�µġ�
	  �� ��Ԫ������ǿ���Ƕ�׵�

	  3.  ���ǿ���ʹ����Ԫ������ĵط��������Ը�дΪ if-else
	   ��֮���򲻳���

	   4. �������ȿ���ʹ����Ԫ��������ֿ���ʹ�� if-else�ṹ����ô����ѡ����Ԫ�������ԭ�򣺼�顢ִ��Ч�ʸߡ�
*/
class  SanYuanTest {
    public static void main(String[] args) {
        // ��ȡ���������Ľϴ�ֵ
        int m=12;
        int n=5;
        int max= (m>n)?m:n;
        System.out.println(max);

        double num=(m>n)?2:1.0;

        // (m>n)? 2 : "n��"; �������
        // ***************************
        String maxStr =  (m >n ) ?"m��":((m==n)?"m��n���":"n��");
        System.out.println(maxStr);
        // ****************************
        // ��ȡ�����������ֵ
        int n1=12;
        int n2=30;
        int n3=-43;

        int max1=(n1>n2)?n1:n2;
        int max2=(max1>n3)?max1:n3;
        System.out.println("�������е����ֵΪ��"+max2);
		// ������
       //  int max3= (n1 >n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
       //  System.out.println("�������е����ֵΪ��"+max3);

		// ��д�� if-else
		if(m>n){
			System.out.println(m);
		}else{
			System.out.println(n);
		}

    }
}
