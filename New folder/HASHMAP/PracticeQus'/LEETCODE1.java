import java.util.HashMap;

public class LEETCODE1 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9}; 
        int target = 15;
        int[] ans={-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0  ; i < arr.length ;i++){
            int rem  = target  - arr[i];
            if(map.containsKey(rem)){
                int j = map.get(rem);
                    ans[0]=i;
                    ans[1]=j;
                    break;
            }
            else{
                map.put(arr[i],i);
            }
        }
        System.out.println(ans[0]+" "+ans[1]);
    }
}
