

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,6,8,9};
        int[] arr3 = new int[arr1.length+arr2.length];
        int i =0;
        int j =0;
        int k =0;
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // Arrays.sort(arr1);
        while(i < arr1.length && j< arr2.length ){
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                
                i++;
            }

            else {
                arr3[k]=arr2[j];
                j++; 
            }
            k++;
        }
        if(i==arr1.length){ //now takee elements from arr2
            while(j<arr2.length){
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        if(j==arr2.length){ //now takee elements from arr1
            while(i<arr1.length){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
        }
for(int ele : arr3){
    System.out.println(ele + " ");
}
        
    }
}
