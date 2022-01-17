/*
	分支结构之二：switch-case
	1. 格式
	switch(表达式){
		case 常量1:
		执行语句1;
		// break;
		case 常量2:
		执行语句2;
		//break;
	...
	default:
		执行语句n;
		// break;
	}
	2. 说明
① 根据switch 表达式中的值，依次匹配各个case中的常量。一旦匹配成功，则进入case结构中，调用其执行语句。
      当调用完执行语句以后，仍然继续向下执行其他case结构中的执行语句，直到遇到break关键字，或此switch-case结构末尾为止结束为止。
② break,可以使用在switch-case结构中，表示一旦执行到此，就跳出switch-case结构。
*/
class SwitchCaseTest {
    public static void main(String[] args) {
        int number = 2;
        switch(number) {
        case 0:
            System.out.println("zero");
            break;
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default:
            System.out.println("other");
            break;
        }
    }
}
