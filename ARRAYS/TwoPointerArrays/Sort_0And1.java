public class Sort_0And1 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1};
        int n = arr.length;
        int i = 0;
        int j = n-1;


        for(int ele:arr){
            System.out.print(ele+" ");
        }
System.out.println(" ");
        while(i < j){
            if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
           else if(arr[i]==1 && arr[j]==0){
                swap(arr,i,j);
                i++;
                j--;
            } 
        }

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    
    public static void swap(int[] arr , int i , int j ) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}
