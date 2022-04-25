package com.panhu.java;

/**
 *
 * @author LanChaiHui
 * @version 1.0
 * @date 2022/4/7 20:01
 */
public class ClassInitTest {
    private static int num=1;
    static {
        num=2;
        number=20;
        System.out.println(num);
        //System.out.println(number);// 报错，非法的前向引用(这是语法规范，其实已经给了内存空间)
    }
    private static int number=10;// linking 中的 prepare :number=0 -->inital:20 --> 10
    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);//2
        System.out.println(ClassInitTest.number);//10
    }
}
