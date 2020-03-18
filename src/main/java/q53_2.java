public class q53_2 {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int low = 0;
        int high = length-1;
        while(low<high){
            int mid = (low+high)/2;
            if (nums[mid]==mid)
                low = mid+1;
            if (nums[mid]!=mid)
                high = mid-1;
            System.out.println(low+" "+high);
        }

        return low;
    }

    public static void main(String[] args) {
        q53_2 q53_2 = new q53_2();
        int[] nums = {0};
        int i = q53_2.missingNumber(nums);
        System.out.println(i);
    }
}
