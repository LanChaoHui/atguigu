class FamliyAccount {
    public static void main(String[] args) {
        boolean isFlag=true;
        while(isFlag) {
            System.out.println("\n-----------------家庭收支记账软件-----------------\n");
            System.out.println("                   1 收支明细");
            System.out.println("                   2 登记收入");
            System.out.println("                   3 登记支出");
            System.out.println("                   4 退    出\n");
            System.out.print("                      请选择(1-4)：");
            //  获取用户选择的：1-4
            char selection= Utility.readMenuSelection();
            switch(selection) {
            case '1':
                System.out.println("1.收支明细");
                break;
            case '2':
                System.out.println("2.登记收入");
                break;
            case '3':
                System.out.println("3.登记支出");
                break;
            case '4':
                // System.out.println("4.退\n出");
                System.out.print("确认是否退出(Y/N)：");
                char isExit=Utility.readConfirmSelection();
				if(isExit=='Y'){
					isFlag=false;
				}
                //break;
            }
        }
    }
}
