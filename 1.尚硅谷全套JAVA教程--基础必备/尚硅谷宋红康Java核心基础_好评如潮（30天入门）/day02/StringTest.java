/*
	String���ͱ�����ʹ��
	1. String ���������������ͣ�����Ϊ���ַ���
	2. ����String���ͱ���ʱ��ʹ��һ��""
	3. String ���Ժ�8�л������ݱ��������㣬������ֻ�����������㣺+
	4. ����Ľṹ��Ȼ��String����
*/
class StringTest {
    public static void main(String[] args) {
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
        // ************************************
        // ��ϰ1
        char c='a';// a:97  A:65
        int num=10;
        String str="hello";
        System.out.println(c+num+str);// 107hello
        System.out.println(c+str+num);//ahelloa
        System.out.println(c+(num+str));//a10hello
        System.out.println((c+num)+str);//107hello
        System.out.println(str+num+c); //hello10a
        // ��ϰ2
        //*	*
        System.out.println("*	*");//*	*
        System.out.println('*'+'\t'+'*');// 93
		System.out.println('*'+"\t"+'*');// *	*		
		System.out.println('*'+'\t'+"*");//51*
		System.out.println('*'+('\t'+"*"));//*	*
    }

}
