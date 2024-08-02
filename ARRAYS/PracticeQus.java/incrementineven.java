public class incrementineven {
        public static void main(String[] args) {
            int[] arr = { 1,2,3,4,5};
        

            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i]%2==1){
                    arr[i]=arr[i]*2;
                }
                else arr[i]=arr[i]+10;
            }
            // dif=even-odd;
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
           
    }
    
}
