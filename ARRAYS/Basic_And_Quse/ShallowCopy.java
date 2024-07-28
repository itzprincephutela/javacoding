public class ShallowCopy {
    public static void main(String[] args) {
        int[] arr ={10,5,50,60,70};
        for(int ele :arr){         //For each Loops
            System.out.print(ele+" ");
        }
        // shallow copy
        System.out.println();
        int[] nums = arr;
        nums[0]=70;
        for(int ele :nums){         //For each Loops this nums
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele :arr){         //For each Loops this is arr
            System.out.print(ele+" ");
        }
    }
}
