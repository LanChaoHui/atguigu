/*
	1~100 之间所有的奇数之和
*/
class ForTest1 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0; i<=100; i++) {
            if(i%2!=0) {
				sum+=i;
            }
        }
		System.out.println("1~100 之间所有的奇数之和为："+sum);
    }
}
