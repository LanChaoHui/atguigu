/**
    Java�������������
    һ����������������������
        �����������ͣ�
            ���ͣ�byte\short\int\long
            �����ͣ�float double
            �ַ��ͣ�char
            �����ͣ�boolean
        ������������
            ��(class)
            �ӿ�(interface)
            ����(array)
    ��������������������λ��
        ��Ա���� vs �ֲ�����
 */
class VariableTest1{
    public static void main(String[] args){
        // 1. ���ͣ�byte(1�ֽ�=8bit) short(2�ֽ�)\int(4�ֽ�)\long(8�ֽ�) 
        // �� byte��Χ��-128~127
        byte b1=12;
        byte b2=-128;
        // b=128;// ���벻ͨ��
        System.out.println(b1);
        System.out.println(b2);
        // �� ����long�ͱ�����������"l"��"L"��β
        // �� ͨ�����������ͱ���ʱ��ʹ��int�͡�
        short s1=128;
        int i1=1234;
        long l1=3214231L;
        System.out.println(l1);
    }
}