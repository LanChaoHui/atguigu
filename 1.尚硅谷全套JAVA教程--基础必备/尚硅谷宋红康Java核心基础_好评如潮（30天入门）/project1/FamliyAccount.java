class FamliyAccount {
    public static void main(String[] args) {
        boolean isFlag=true;
        // ���ڼ�¼�û��������֧��������
        String details = "��֧\t�˻����\t��֧���\t˵    ��\n";
        // ��ʼ���
        int balance = 10000;
        while(isFlag) {
            System.out.println("\n-----------------��ͥ��֧�������-----------------\n");
            System.out.println("                   1 ��֧��ϸ");
            System.out.println("                   2 �Ǽ�����");
            System.out.println("                   3 �Ǽ�֧��");
            System.out.println("                   4 ��    ��\n");
            System.out.print("                   ��ѡ��(1-4)��");
            //  ��ȡ�û�ѡ��ģ�1-4
            char selection= Utility.readMenuSelection();
            switch(selection) {
            case '1':
                // System.out.println("1.��֧��ϸ");
                System.out.println("-----------------��ǰ��֧��ϸ��¼-----------------");
                System.out.println(details);
                System.out.println("--------------------------------------------------");
                break;
            case '2':
                // System.out.println("2.�Ǽ�����");
                System.out.print("���������");
                int addMoney=Utility.readNumber();
                System.out.print("��������˵����");
                String addInfo=Utility.readString();
                // ����balance
                balance+=addMoney;
                // ����details
                details+=("����\t"+balance+"\t\t"+addMoney+"\t\t"+addInfo+"\n");
                System.out.println("---------------------�Ǽ����---------------------\n");
                break;
            case '3':
                // System.out.println("3.�Ǽ�֧��");
                System.out.print("����֧����");
                int minuyMoney=Utility.readNumber();
                System.out.print("����֧��˵����");
                String  minuyInfo=Utility.readString();
                // ����balance
                if(balance>=minuyMoney) {
                    balance-=minuyMoney;
                    details+=("֧��\t"+balance+"\t\t"+minuyMoney+"\t\t"+minuyInfo+"\n");
                } else {
                    System.out.println("֧�������˻��Ķ�ȣ�֧��ʧ��");
                }
                break;
            case '4':
                // System.out.println("4.��\n��");
                System.out.print("ȷ���Ƿ��˳�(Y/N)��");
                char isExit=Utility.readConfirmSelection();
                if(isExit=='Y') {
                    isFlag=false;
                }
                //break;
            }
        }
    }
}
