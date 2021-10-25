/**
    Java定义的数据类型
    一、变量按照数据类型来分
        基本数据类型：
            整型：byte\short\int\long
            浮点型：float double
            字符型：char
            布尔型：boolean
        引用数据类型
            类(class)
            接口(interface)
            数组(array)
    二、变量在类中声明的位置
        成员变量 vs 局部变量
 */
class VariableTest1 {
    public static void main(String[] args) {
        // 1. 整型：byte(1字节=8bit) short(2字节)\int(4字节)\long(8字节)
        // ① byte范围：-128~127
        byte b1=12;
        byte b2=-128;
        // b=128;// 编译不通过
        System.out.println(b1);
        System.out.println(b2);
        // ② 声明long型变量，必须以"l"或"L"结尾
        // ③ 通常，定义整型变量时，使用int型。
        short s1=128;
        int i1=1234;
        long l1=3214231L;
        System.out.println(l1);
        // 2. 浮点型：float(4字节)\double(8个字节)
        // ① 浮点型，表示带小数点的数值
        // ② float 表示数值的范围比long还大
        double d1=123.3;
        System.out.println(d1+1);
        // ③ 定义float类型变量时，变量要以"F"或"f"结尾
        float f1=12.3F;
        System.out.println(f1);
        // ④ 通常，定义浮点型变量时，使用double 类型

        // 3. 字符型：char (1 字符=2 字节)
        // ① 定义char型变量，通常使用一对''
        char c1='a';
        // 编译不通过
        //c1='Ab';
        System.out.println(c1);

        char c2='1';
        char c3='中';
        char c4='あ';
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        // ② 表示方式： 1. 声明一个字符 2. 转义字符
        char c5='\n'; // 换行符
        c5='\t'; // 制表符
        System.out.print("hello"+c5);
        System.out.println("world");

        char c6='\u0043';
        System.out.println(c6);
    }
}