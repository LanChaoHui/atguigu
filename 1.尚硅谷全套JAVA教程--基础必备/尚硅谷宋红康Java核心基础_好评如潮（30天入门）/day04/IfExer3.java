/*
�������뿪��һ�����Ʊ����Ϸ����������ز���һ����λ���Ĳ�Ʊ��
��ʾ�û�����һ����λ����Ȼ��������Ĺ����ж��û��Ƿ���Ӯ��
1)����û��������ƥ���Ʊ��ʵ��˳�򣬽���10 000��Ԫ��
2)����û��������������ƥ���Ʊ���������֣���˳��һ�£�����3 000��Ԫ��
3)����û������һ�����ֽ�����˳�������ƥ���Ʊ��һ�����֣�����1 000��Ԫ��
4)����û������һ�����ֽ������˳�������ƥ���Ʊ��һ�����֣�����500��Ԫ��
5)����û����������û��ƥ���κ�һ�����֣����Ʊ���ϡ�
��ʾ��ʹ��(int)(Math.random() * 90  + 10)�����������
Math.random() : [0,1)  * 90 ?[0,90) + 10 ?[10,100)?[10,99]
*/
import java.util.Scanner;
class IfExer3 {
    public static void main(String[] args) {
        // ��λ�ȡһ���������10-99
        int value=(int)(Math.random()*90+10);//[0.0,0.9999...]--->[0.0-90.0]--->[10.0,100.0]--->[10,99]
        // ��ʽ��[a,b]:(int)(Math.random*(a-b+1)+b)
        int numShi=value/10;
        int numGe=value%10;

        // �û�����һ����λ����
        Scanner scan=new Scanner(System.in);
        System.out.println("��������λ����");
        int guess=scan.nextInt();

        int guessShi=guess/10;
        int guessGe=guess%10;

        if(value == guess) {
            System.out.println("����10 000��Ԫ");
        } else if(numShi == guessGe &&numGe==guessShi) {
            System.out.println("����3 000��Ԫ");
        } else if(numShi==guessShi || guessGe==numGe) {
            System.out.println("����500��Ԫ");
        } else {
            System.out.println("û�н�");
        }
        System.out.println("�н������ǣ�" + value);

    }
}
