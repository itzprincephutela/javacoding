public class Linear {
    public static boolean Target(int[] arr ,int idx , int target){
        if(idx>=arr.length){
            return false;
        }
        if(arr[idx]==target){return true;}
        return Target(arr,idx+1,target);
        

    }
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 1, 9, 8, 7, 7};
        int target = 4;

        

    }
}
