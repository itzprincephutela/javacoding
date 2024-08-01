import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args) {
        int[] arr ={10,5,50,60,70};
        for(int ele :arr){         //For each Loops
            System.out.print(ele+" ");
        }

        System.out.println();


        // use methods of Copy    

        int[] arr2=Arrays.copyOf(arr, arr.length);//DeepArray

        arr2[0]=50;
            for(int ele :arr2){         //For each Loops 
                System.out.print(ele+" ");
                
            }

            System.out.println();
            for(int ele :arr){         //For each Loops
                System.out.print(ele+" ");
            }
    }
}
