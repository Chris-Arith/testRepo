import java.util.Arrays;

/**
 * 类Parameter.java的实现描述：TODO 类实现描述 <br>
 * 测试java的传参方式(到底是传值还是传址)
 *
 * @author wangding_91@163.com 2016年3月10日 下午10:05:53
 */
public class Parameter {

    static void exchange(String str2) {
        str2 = "cde";
    }

    static void exchange(int i) {
        i = 1;
    }

    static void exchange(char[] c) {
        c[0] = 'd';
    }

    public static void main(String[] args) {
        char[] a = new char[] { 'g', 'o', 'o', 'd' };
        int j = 0;
        String str1 = "abc";
        exchange(str1);
        exchange(a);
        exchange(j);
        System.out.println("str1=" + str1);
        System.out.println("a=" + Arrays.toString(a));
        System.out.println("j=" + j);
    }

}