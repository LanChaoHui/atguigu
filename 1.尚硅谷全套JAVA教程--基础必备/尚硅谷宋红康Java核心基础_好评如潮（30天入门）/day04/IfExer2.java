/*
	���㹷������
*/
import java.util.Scanner;
class IfExer2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("�����빷������");
        int dogAge=scan.nextInt();
        if(dogAge>=0&&dogAge<=2) {
            System.out.println("�൱���˵����䣺"+dogAge*10.5);
        } else if(dogAge>2) {
            System.out.println("�൱���˵����䣺"+2*10.5+(dogAge-2*4));
        }else{
			System.out.println("������û������");
        }
    }
}
