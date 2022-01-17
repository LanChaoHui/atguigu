/*
	��֧�ṹ֮����switch-case
	1. ��ʽ
	switch(���ʽ){
		case ����1:
		ִ�����1;
		// break;
		case ����2:
		ִ�����2;
		//break;
	...
	default:
		ִ�����n;
		// break;
	}
	2. ˵��
�� ����switch ���ʽ�е�ֵ������ƥ�����case�еĳ�����һ��ƥ��ɹ��������case�ṹ�У�������ִ����䡣
      ��������ִ������Ժ���Ȼ��������ִ������case�ṹ�е�ִ����䣬ֱ������break�ؼ��֣����switch-case�ṹĩβΪֹ����Ϊֹ��
�� break,����ʹ����switch-case�ṹ�У���ʾһ��ִ�е��ˣ�������switch-case�ṹ��
�� switch�ṹ�еı��ʽ��ֻ�������µ�6����������֮һ��byte��short��char��int��ö������(JDK5.0����)��String����(JDK7.0����)
�� case ֮��ֻ��ʲô����������������Χ.
�� break�ؼ����ǿ�ѡ�ġ�
�� default:�൱��if-else�е�else��default�ṹ�ǿ�ѡ�ģ�����λ�������ġ�
*/
class SwitchCaseTest {
    public static void main(String[] args) {
        int number = 5;
        switch(number) {
        default:
            System.out.println("other");
            break;
        case 0:
            System.out.println("zero");
            break;
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        }

        String season = "summer";
        switch (season) {
        case "spring":
            System.out.println("��ů����");
            break;
        case "summer":
            System.out.println("��������");
            break;
        case "autumn":
            System.out.println("�����ˬ");
            break;
        case "winter":
            System.out.println("��ѩ����");
            break;
        default:
            System.out.println("������������");
            break;
        }

        //*********************************
        /*
        boolean isHandsom=true;
        switch(isHandsom) {
        case true:
            System.out.println("�Һ�˧��~~~");
            break;
        case false:
            System.out.println("�Һó�~~~");
            break;
        default:
            System.out.println("��������~~~");
        }*/
        /*
        int age=10;
        switch(age){
        	case age>18:
        		System.out.println("������");
        	break;
        	default:
        		System.out.println("������");
        }*/
    }
}
