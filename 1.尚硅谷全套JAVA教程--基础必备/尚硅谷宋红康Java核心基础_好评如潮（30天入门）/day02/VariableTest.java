/**
    变量的使用
    1. java 定义变量的格式： 数据类型 变量名 = 变量值;
    2. 说明：
        ①变量必须先声明，后使用
        ②变量都定义在其作用域内，在作用域内，它是有效的。换句话说，出了作用域就失效了。
        ③同一个作用域，不可以声明两个同名的变量

 */
class VariableTest{
    public static void main(String[] args){
        // 变量的定义
        int myAge=12;
        // 变量的使用
        System.out.println(myAge);
        // 编译错误：使用myNumber之前并为定义过myNumber
        // System.out.println(myNumber);
        // 变量的声明
        int myNumber;
        // 编译错误：使用myNumber之前并未赋值myNumber
        System.out.println(myNumber);
        // 变量的赋值
        myNumber=1001;
        // System.out.println(myClass);
        // 编译不通过
        // 不可以在同一作用域定义同样的变量名
        // int myAge=24;
    }

    public void method(){
        int myClass=1;
    }
}
// class VariableTest{} // 逆向思维，反证法