public class LargestThreeElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,16,4,50};
        int mx1=Integer.MIN_VALUE;
        int mx2=Integer.MIN_VALUE;
        int mx3=Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0 ; i<n ;i++){
            if(arr[i]>mx1)
            mx1=arr[i];
        }
        for(int i = 0 ; i<n ;i++){
            if(arr[i]>mx2 && arr[i]!=mx1)
            mx2=arr[i];
        }
        for(int i = 0 ; i<n ;i++){
            if(arr[i]>mx3 && arr[i]!=mx1 && arr[i]!=mx2)
            mx3=arr[i];
        }
        System.out.println(mx1);
        System.out.println(mx2);
        System.out.println(mx3);
    }
}
