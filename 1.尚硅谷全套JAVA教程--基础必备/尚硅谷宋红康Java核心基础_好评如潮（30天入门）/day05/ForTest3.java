/*
	ˮ�ɻ�
*/
class ForTest3 {
    public static void main(String[] args) {
        for(int i=100; i<1000; i++) {
            int g=(i%100)%10;
            int s=(i%100)/10;
            int b=(i/100);
            if(g*g*g+s*s*s+b*b*b==i) {
                System.out.println("�õ�һ��ˮ�ɻ���"+i);
            }
        }
    }
}
