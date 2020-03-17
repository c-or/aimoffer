import java.util.HashMap;

public class q57_1 {
    int[] num;
    int sum;
    public q57_1(int[] num,int sum){
        this.num = num;
        this.sum = sum;
    }

    public int[] two_num(){
        HashMap<Object, Object> map = new HashMap<>();
        for (int temp:num
             ) {
            map.put(temp,temp);
        }
        int length = num.length;
        for (int i=0;num[i]<sum&&i<length;i++){
            int target = sum - num[i];
            if(map.containsKey(target)==false)
                continue;
            else
                return new int[]{num[i],target};
        }
        return null;
    }

    public static void main(String[] args) {
        int[] num =  {2,7,11,15};
        int sum = 9;
        q57_1 q57_1 = new q57_1(num, sum);
        int[] ints = q57_1.two_num();
        for (int a :
                ints) {
            System.out.println(a);
        }
    }
}
