import java.util.Scanner;
class  SwitchCaseTest2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("«Î ‰»Î‘¬∑›£∫");
        int month=scan.nextInt();
        switch(month) {
        case 3:
        case 4:
        case 5:
            System.out.println("¥∫ºæ");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("œƒºæ");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("«Ôºæ");
            break;
        case 12:
        case 1:
        case 2:
            System.out.println("∂¨ºæ");
            break;
        }
    }
}
