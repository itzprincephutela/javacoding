public class Duplicate {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,5,8,4,6,7};
        for (int i = 0 ; i <arr.length ; i++){
            for(int j = i+1 ;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicte");
                    // break;
                }
                break;
            }
        
        }
    }
}
