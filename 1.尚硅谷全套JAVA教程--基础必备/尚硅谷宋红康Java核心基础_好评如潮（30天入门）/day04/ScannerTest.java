/*
��δӼ��̻�ȡ��ͬ���͵ı�������Ҫʹ��Scanner��
����ʵ�ֲ��裺
1.�������import java.util.Scanner
2. Scanner ��ʵ����:Scanner scan=new Scanner(System.in);
3.  ����Scanner�����ط�����next()/nextXxx()��������ȡ����ָ�����͵���ֵ

ע�⣺
��Ҫ������Ӧ�ķ�����������ָ�����͵�ֵ��������������������Ҫ������Ͳ�ƥ��ʱ���ᱨ�쳣��InputMismatchException ���³�����ֹ
*/
import java.util.Scanner;
class ScannerTest {
    public static void main(String[] args) {
		// 2. Scanner��ʵ����
        Scanner scan=new Scanner(System.in);

		// 3. ����Scanner�����ط���
        System.out.println("���������������");
        String name=scan.next();
        System.out.println(name);
        System.out.println("��������ķ��䣺");
        int age=scan.nextInt();
        System.out.println(age);
        System.out.println("������������أ�");
        double weight=scan.nextDouble();
        System.out.println(weight);
        System.out.println("�Ƿ�ѡ��(true/false)");
        boolean isSelect=scan.nextBoolean();
        System.out.println(isSelect);
        // ����char�͵Ļ�ȡ��Scannerû���ṩ��صķ�����ֻ�ܻ�ȡһ���ַ���
        System.out.println("����������Ա�(��/Ů)");
        String gender=scan.next();//"��"
        char genderChar = gender.charAt(0);//��ȡ����Ϊ0�ϵ��ַ�
        System.out.println(genderChar);
    }
}
