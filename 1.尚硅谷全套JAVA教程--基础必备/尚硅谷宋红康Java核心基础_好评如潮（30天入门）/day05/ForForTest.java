/*
	Ƕ��ѭ����ʹ��
	1. Ƕ��ѭ������һ��ѭ���ṹA��������һ��ѭ���ṹB��ѭ���ṹ�У�������Ƕ��ѭ��
	2.
		���ѭ����ѭ���ṹB
		�ڲ�ѭ����ѭ���ṹA
	3. ˵�� 
	���ڲ�ѵ�ṹ����һ�飬ֻ�൱�����ѭ����ִ����һ��
	�ڼ������ѭ����Ҫִ��m�Σ��ڲ�ѭ����Ҫִ��n�Ρ���ʱ�ڲ�ѭ����ѭ����һ��ִ����m*n

*/
class ForForTest {
    public static void main(String[] args) {
        // *******
        // System.out.println("******");
        for(int i=1; i<=6; i++) {
            System.out.print("*");
        }
		 System.out.println("\n");
        /*
        	*******
        	*******
        	*******
        	*******
        */
        for(int i=0; i<4; i++) {
            for(int j=1; j<=6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
