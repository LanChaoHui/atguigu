/*
	100 以内所有质数
	质数：素数，只有被1和它本身整除的自然数。--> 从2开始，到这个数-1结束位置，都不能被这个数本身整除
	最小的质数是：2
*/
class  PrimeNumberTest {
    public static void main(String[] args) {
		boolean isFlag=true;// 标识I是否被j除尽，一旦除尽，修改其值
        for(int i=2; i<=100; i++) {// 遍历一百以为的自然数
            for(int j=2; j<i; j++) {// 被i去除
				if(i%j==0){// i 被j除尽
					isFlag=false;
				}
            }
			// 此时
			if(isFlag){
				System.out.println(i);
			}else{
				boolean isFlag=true;
			}
        }
    }
}
