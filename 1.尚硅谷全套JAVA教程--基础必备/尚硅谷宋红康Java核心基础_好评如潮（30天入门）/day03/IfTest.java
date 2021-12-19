

/*
分支结构中的if-else（条件判断结构）
一、三种结构
if(条件表达式){

}

第二种：二选一

if(条件表达式){
	执行表达式1
}else{
	执行表达式2
}

第三种：n选一
if(条件表达式){
	执行表达式1
}else if(
	执行表达式2
)else if(条件表达){
	执行表达式3
}
...
else{
	执行表达式n
}
*/
class IfTest {
    public static void main(String[] args) {
        // 举例1
        int hearBeats = 179;
        if(hearBeats<60||hearBeats>100) {
            System.out.println("需要进一步检查");
        }
        System.out.println("检查结束");

        // 举例2
        int age=23;

        if(age<18) {
            System.out.println("你还可以看动画片");
        } else {
            System.out.println("可以看电影了");
        }

        // 举例3

        if(age<0) {
            System.out.println("您输入的数据不正确");
        } else if(age<18) {
            System.out.println("青少年时期");
        } else if(age<35) {
            System.out.println("青壮年时期");
        } else if (age<60) {
            System.out.println("青壮年时期");
        } else if(age<120) {
            System.out.println("老年时期");
        } else {
            System.out.println("您是要成仙啊~~~");
        }
    }
}
