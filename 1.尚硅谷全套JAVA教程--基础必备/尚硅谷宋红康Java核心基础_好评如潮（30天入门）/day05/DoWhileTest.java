/*
	do-while ѭ����ʹ��
	һ��ѭ���ṹ��4��Ҫ��
	�� ��ʼ������
	�� ѭ������---> ��boolean ����
	�� ѭ����
	�� ��������
	��
	do{
		��;
		��;
	}while(��)��
	ִ�й��̣��١����ۡ����ܡ����ڡ����ۡ����ܡ���������������

	˵����
	1. do-while ѭ�����ٻ�ִ��һ��ѭ���壡
	2. �����У�ʹ��for��while����һЩ������ʹ��doi-while
*/
class  DoWhileTest {
    public static void main(String[] args) {
        // ����100���ڵ�ż��������������ż���ĺͼ�ż���ĸ���
        int num =1;
        int sum=0;// ��¼�ܺ�
        int count =0;//��¼����
        do {
            if(num%2==0) {
                System.out.println(num);
                sum+=num;
                count++;
            }
            num++;
        } while(num<=100);
        System.out.println("�ܺ�Ϊ��"+sum);
        System.out.println("����Ϊ��"+count);
        // ****************���do-while����ִ��һ��*****************
        int number = 15;
        while(number>10) {
            System.out.println("hello:while");
            number--;
        }

        int number2=15;
        do {
            System.out.println("hello:do-while");
            number2--;
        } while(number2>10);
    }
}
