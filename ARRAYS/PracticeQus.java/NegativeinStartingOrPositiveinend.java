public class NegativeinStartingOrPositiveinend {
    public static void main(String[] args) {
        int[] arr = {-1,110,10,-5,-50,01,50,-20,-30,41,71,11,-30};
        int n = arr.length;
        int i = 0 ;
        int j = n-1;
        while(i<j){
            if(arr[i]<=0){
                i++;
            }
            else if(arr[j]>=1){
                j--;
            }
            else{
                swap(arr, i, j);
                i++;j--;
            }
        }for(int ele:arr){
            System.out.print(ele+" ");
        }


    }
    public static void swap(int[] arr , int i , int j ) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

}
