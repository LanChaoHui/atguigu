/*
������е�ˮ�ɻ�������νˮ�ɻ�����ָһ��3λ���������λ�����������͵����䱾��
���磺153 = 1*1*1 + 3*3*3 + 5*5*5
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
