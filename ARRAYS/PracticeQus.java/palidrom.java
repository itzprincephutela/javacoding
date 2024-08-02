public class palidrom {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int i = 0 ;
        int j = nums.length-1;
        boolean pali = false;
        while(i <= j ){
            if(nums[i]!=nums[j]){
                pali = false;
                break;
            }
            else{
                i++;
                j--;
                pali =true;
            }
        }
        System.out.println(pali);
    }
}
