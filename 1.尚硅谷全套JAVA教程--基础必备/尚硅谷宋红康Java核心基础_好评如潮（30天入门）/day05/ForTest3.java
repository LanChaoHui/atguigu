/*
输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
例如：153 = 1*1*1 + 3*3*3 + 5*5*5
*/
class ForTest3 {
    public static void main(String[] args) {
        for(int i=100; i<1000; i++) {
            int g=(i%100)%10;
            int s=(i%100)/10;
            int b=(i/100);
            if(g*g*g+s*s*s+b*b*b==i) {
                System.out.println("得到一个水仙花："+i);
            }
        }
    }
}
