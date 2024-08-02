public class Sumofevenandodd {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        int odd= 0;
        int even = 0;
        // int dif =0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%2==0){
                even+=arr[i];
            }
            else odd+=arr[i];
        }
        // dif=even-odd;
        System.out.println("odd is : "+odd);
        System.out.println("Even is : "+even);
    }
}
