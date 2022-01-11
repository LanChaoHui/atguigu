import java.util.Scanner;
class IfExer2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入狗的年龄");
        int dogAge=scan.nextInt();
        if(dogAge>=0&&dogAge<=2) {
            System.out.println("相当于人的年龄："+dogAge*10.5);
        } else if(dogAge>2) {
            System.out.println("相当于人的年龄："+2*10.5+(dogAge-2*4));
        }else{
			System.out.println("狗狗还没出生！");
        }
    }
}
