/*
	嵌套循环的使用
	1. 嵌套循环：将一个循环结构A声明在另一个循环结构B的循环结构中，构成了嵌套循环
	2.
		外层循环：循环结构B
		内层循环：循环结构A
	3. 说明 
	①内层训结构遍历一遍，只相当于外层循环体执行了一次
	②假设外层循环需要执行m次，内层循环需要执行n次。此时内层循环的循环体一个执行了m*n

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
