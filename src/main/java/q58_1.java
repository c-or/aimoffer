import java.lang.reflect.Array;
import java.util.Arrays;

public class q58_1 {
    String s;
    public q58_1(String s){
        this.s = s.trim();//
    }
    public String reverse(){
        String[] strings = s.split(" +");//此处可以使用正则表达式
        int length = strings.length;//string中只能使用length()函数，数组中可以使用 length 属性
        int i = 0;
        int j = length-1;
        String temp;
        while (i<j){
            temp = strings[i];
            strings[i] = strings[j];
            strings[j] = temp;
            i++;
            j--;

        }
//        temp = "";
//        for (String str:strings
//             ) {
//            temp += (str+" ");
//
//        }
        String join = String.join(" ", strings);//好方法，得记住
        return join;
    }

    public static void main(String[] args) {
        q58_1 q58_1 = new q58_1("a good   example");
        String reversed = q58_1.reverse();
        System.out.println(reversed);

    }
}
