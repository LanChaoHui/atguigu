/*
��дһ������Ϊһ������������ҳ����Ӧ���й���Ф��
�й�����Ф����12��һ�����ڣ�ÿ����һ���������
`rat��ox��tiger��rabbit��dragon��snake��horse��sheep��monkey��rooster��dog��pig��
��ʾ��2019�꣺��2019 % 12 == 3
*/
import java.util.Scanner;
class SwitchCase6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("��������ݣ�");
        int year=scan.nextInt();
		int sx=(year-1900)%12;
        switch(sx) {
        case 0:
            System.out.println("rat");
            break;
        case 1:
            System.out.println("ox");
            break;
        case 2:
            System.out.println("tiger");
            break;
        case 3:
            System.out.println("rabbit");
            break;
        case 4:
            System.out.println("dragon");
            break;
        case 5:
            System.out.println("snake");
            break;
        case 6:
            System.out.println("horse");
            break;
        case 7:
            System.out.println("sheep");
            break;
        case 8:
            System.out.println("monkey");
            break;
        case 9:
            System.out.println("rooster");
            break;
        case 10:
            System.out.println("dog");
            break;
        case 11:
            System.out.println("pig");
        }
    }
}
