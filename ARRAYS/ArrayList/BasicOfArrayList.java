import java.util.ArrayList;

// package ARRAYS.ArrayList;x

public class BasicOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(3);
        arr.add(0,10);
        arr.add(1,100);
        arr.add(2,1000);
        arr.add(3,1000);
        
      
        System.out.println(arr);
        System.out.println();
        arr.set(2, 200);  //updations of value oon index 2 
        System.out.println(arr);
        boolean isEmpty=arr.isEmpty();
        arr.clear();
          for(int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));//get se print hota hai
        }
    }

    
}
