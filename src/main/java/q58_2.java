import javax.print.event.PrintEvent;

public class q58_2 {
    int n;
    String s;
    public q58_2(String s, int n) {
        this.n = n;
        this.s = s;
    }

    public String revent() {
        int length = s.length();
        String str1 = new String(s.substring(n)) ;
        String str2 = new String(s.substring(0,2));
        return str1+str2;
    }

    public static void main(String[] args) {
        q58_2 q = new q58_2("abcdefg", 2);
        String revent = q.revent();
        System.out.println(revent);


    }
}
