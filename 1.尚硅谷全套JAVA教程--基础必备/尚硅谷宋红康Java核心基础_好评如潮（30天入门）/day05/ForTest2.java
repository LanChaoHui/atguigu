/*
	��ӡ1~100 ����7�ı����������ĸ������ܺ�
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
		System.out.println("1~100����7�ı����ĸ���Ϊ��"+count);
		System.out.println("1~100����7�ı������ܺ�Ϊ��"+sum);
	}
}
