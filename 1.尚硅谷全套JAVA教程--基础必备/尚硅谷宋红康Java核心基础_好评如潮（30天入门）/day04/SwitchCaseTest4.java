/*
��д���򣺴Ӽ����϶���һ��ѧ���ɼ�������ڱ���score�У�����score��
ֵ������Ӧ�ĳɼ��ȼ���
score>=90 �ȼ�: A
70<=score<90 �ȼ�: B
60<=score<70 �ȼ�: C
score<60 �ȼ�: D
��ʽһ��ʹ��if-else
��ʽ����ʹ��switch-case: score / 10: 0 - 10

˵����
1. ���ǿ���ʹ��switch-case�Ľṹ��������ת��Ϊif-else����֮��������
2. ������д��֧�ṹʱ�������ּȿ���ʹ��switch-case��ͬʱcase��swich�б��ʽ��ȡֵ�����̫�ࣩ��
�ֿ���ʹ��if-elseʱ����������ѡ��switch-case��ԭ��switch-case ִ��Ч���Ըߡ�
*/
import java.util.Scanner;
class  SwitchCaseTest4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // ��ʽ1
        System.out.println("������ѧ���ɼ���");
        int score=scan.nextInt();
        if(score >= 90) {
            System.out.println("�ȼ���A");
        } else if(70 <= score&& score< 90) {
            System.out.println("�ȼ���B");
        } else if(60 <= score&&score < 70) {
            System.out.println("�ȼ���C");
        } else {
            System.out.println("�ȼ���D");
        }
        // ��ʽ2
        int tempScore= score/10;
        switch(tempScore) {
        case 10:
        case 9:
            System.out.println("�ȼ���A");
            break;
        case 8:
        case 7:
            System.out.println("�ȼ���B");
            break;
        case 6:
            System.out.println("�ȼ���C");
            break;
        default:
            System.out.println("�ȼ���D");

        }
    }
}
