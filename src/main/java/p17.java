public class p17 {
    public int[] printNumbers(int n) {
        double pow = Math.pow(10, n)-1;
        int pow_int = new Double(pow).intValue();
        int[] a = new int[pow_int];
        for (int i=0;i<pow_int;i++)
            a[i] = i+1;
        return a;

    }

    public static void main(String[] args) {
        p17 p17 = new p17();
        int[] ints = p17.printNumbers(0);
        for (int i :
                ints) {
            System.out.println(i);
        }
    }
}
