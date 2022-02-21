/*
	100 以内所有质数
	质数：素数，只有被1和它本身整除的自然数。--> 从2开始，到这个数-1结束位置，都不能被这个数本身整除
    对，PrimeNumberTest.java文件中质数输出问题的优化
*/
class  PrimeNumberTest1 {
    public static void main(String[] args) {
        boolean isFlag=true;// 标识I是否被j除尽，一旦除尽，修改其值
        // 获取当前时间距离，1970-01-01 00:00:00 的毫秒数
        long start = System.currentTimeMillis();
        for(int i=2; i<=100000; i++) {// 遍历100000以为的自然数
            for(int j=2; j<i; j++) {// 被i去除
                if(i%j==0) { // i 被j除尽
                    isFlag=false;// 优化一：只对本身非质数的自然数有效的
                    break;
                }
            }
            // 此时
            if(isFlag) {
                System.out.println(i);
            } else {
                // 重置isFlag
                isFlag=true;
            }
        }
        // 获取当前时间距离，1970-01-01 00:00:00 的毫秒数
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为："+(end-start));// 21094 - 优化一:break:20216
    }
}