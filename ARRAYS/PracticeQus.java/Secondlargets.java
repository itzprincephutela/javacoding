public class Secondlargets {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        int mx = Integer.MIN_VALUE;
        int smx=Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            mx=Math.max(mx,arr[i]);
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>smx && arr[i]!=mx){
                smx=arr[i];
            }
        }
        System.out.println(smx);
    }
}
