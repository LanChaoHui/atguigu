/*
	打印1~100 所有7的倍数的整数的个数及总和
*/
class ForTest2 
{
	public static void main(String[] args) 
	{
		int sum =0;
		int count =0;
		for(int i=0;i<=100;i++){
			if(i%7==0){
				count++;
				sum+=i;
			}
		}
		System.out.println("1~100所有7的倍数的个数为："+count);
		System.out.println("1~100所有7的倍数的总和为："+sum);
	}
}
