/*
	100 以内所有质数 优化方式二
	质数：素数，只有被1和它本身整除的自然数。--> 从2开始，到这个数-1结束位置，都不能被这个数本身整除
    对，PrimeNumberTest.java文件中质数输出问题的优化
*/
class  PrimeNumberTest2 {
    public static void main(String[] args) {
        int count = 0;// 用来记录质数的个数
        // 获取当前时间距离，1970-01-01 00:00:00 的毫秒数
        long start = System.currentTimeMillis();
        label:for(int i=2; i<=100000; i++) {// 遍历100000以为的自然数
            // 优化二：对本身是质数的自然数是有效的。
            // for(int j=2; j< i; j++) {
            for(int j=2; j<=Math.sqrt(i); j++) {// 被i去除
                if(i%j==0) { // i 被j除尽
                    continue label;
                }
            }
			// 能执行到此步骤，都是质数
            count++;
        }
        // 获取当前时间距离，1970-01-01 00:00:00 的毫秒数
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为："+count);
        System.out.println("所花费的时间为："+(end-start));// 11562 - 优化一:break:978 - 优化二：11
    }
}