/*
break��continue�ؼ���
				ʹ�÷�Χ			ѭ����ʹ�õ�����			��ͬ��
break �� switch-case
				 ѭ���ṹ�й�     ������ǰѭ��					�ؼ��ֺ��治������ִ�����
contiune:  ѭ���ṹ��		   ��������ѭ��

*/
class BreakContiuneTest 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<10;i++){
			if(i%4==0){
				break; //123
				//continue;//12356789
				//System.out.println("����ִ�У�����");
			}
			System.out.print(i);
		}
		System.out.println();
		// ***********************************************
		for(int i=1;i<=4;i++){
			for(int j=1;j<=10;j++){
				if(j%4==0){
					break;
				}
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
