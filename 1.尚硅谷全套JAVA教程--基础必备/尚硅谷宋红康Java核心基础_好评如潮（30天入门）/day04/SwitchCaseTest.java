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
*/
class SwitchCaseTest {
    public static void main(String[] args) {
        int number = 2;
        switch(number) {
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
        default:
            System.out.println("other");
            break;
        }
    }
}
