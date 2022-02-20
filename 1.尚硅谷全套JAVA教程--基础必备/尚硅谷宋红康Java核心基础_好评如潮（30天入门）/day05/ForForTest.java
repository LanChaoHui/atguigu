/*
	嵌套循环的使用
	1. 嵌套循环：将一个循环结构A声明在另一个循环结构B的循环结构中，构成了嵌套循环
	2.
		外层循环：循环结构B
		内层循环：循环结构A
	3. 说明
	①内层训结构遍历一遍，只相当于外层循环体执行了一次
	②假设外层循环需要执行m次，内层循环需要执行n次。此时内层循环的循环体一个执行了m*n
	4. 技巧
		外层循环控制行数，内层循环控制列数
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

        /*			 i(行号) j(*的个数)
        *    1			1
        **	  2			 2
        *** 3			 3
        ****
        *****
        ******
        */
        for(int i=1; i<=5; i++) { // 行数
            for(int j=1; j<=i; j++) { // 几个
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        ******
        *****
        ****
        ***
        **
        *
        */
        for(int i=1; i<=6; i++) {
            for(int j=6; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
		/*
		*    
        **	  
        *** 
        ****
        *****
		******
        *****
        ****
        ***
        **
        *
		*/
		// 略
		/*
		    * 
		   * * 
		  * * * 
		 * * * * 
		* * * * * 
		 * * * * 
		  * * * 
		   * * 
			 * 
		*/
		// 上半部分
		// 下半部分
    }
}
