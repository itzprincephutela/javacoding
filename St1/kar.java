// import java.util.*;
// public class missing{
//     public static void main(String args[]){
//         int[] x = {0,5,8,2,7,4,3,1,6}        ;
//         int s = x.length;
//         Arrays.sort(x);
//         for(int i = 0 ; i < s ; i++){
//             if(x[i]!=i){
//                 System.out.println("The missing number is: " + i);
//                 break;
//             }
//             else{
//                 System.out.println(s);
//                 break;
//             }
            
//         }
//     }}

//     ///////////////////////////////bits 
//  import java.util.*;
// public class bit{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n  = sc.nextInt();
//         int count = 0 ;
//         while(n!=0){
//             if(n%2!=0){
//                 count++;
//             } 
//             n = n / 2 ;
//         }
//         System.out.println(count);
//     }
    
// }

// ///////////////////////////////////////////////////////////
// import java.util.*;
// public class prime{
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     if(num<=1){
//         System.out.println("Not prime");
//     }
//     for(int i = 2 ; i < num ; i++){
//         if (num%i==0){
//             System.out.println("Not prime");
//             break;
//         }
//         else{
//             System.out.
//             //////////////////////////////////////






//             import java.util.*;
// public class Leap_year {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();
//         if(year % 4 == 0){
//             if(year % 400 ==0 || year % 100 != 0){
//                 System.out.println("Leap Year");
//             }
//             else{
//                 System.out.println("Not Leap Year");
//             }
//         }
//         else{
//                 System.out.println("Not Leap Year");
//             }
//     }
// }

//////////////////////////////////////////
// import java.util.*;
// public class evenodd{
//     public static void main (String args[]){
//         int[] arr = {2, 4, 6, 8, 10, 3, 1};
//        List<Integer> odd = new ArrayList<>();
//        List<Integer> even = new ArrayList<>();
       
//        for(int num : arr){
//            if(num%2==0){
//                even.add(num);
//            }
//            else{
//                odd.add(num);
//            }
//        }
//            odd.addAll(even);
//            for(int i = 0 ; i < arr.length ; i++){
//                arr[i]=odd.get(i);
//            }
//            for(int ele:arr){
//                System.out.print(ele);
//            }
//        }
    
// }


////////////////////////////
// import java.util.*;
// public class high{
//     public static void main(String args[]){
//         int[] arr={2, 2, 1, 1, 1, 2, 2,1,5};
//         int count = 1;
//         int num = arr[0] ; 
//         for(int i = 1 ; i < arr.length ; i++){
//             if(arr[i]==num){
//                 count++;
//             }
//             else{
//                 count--;
//                 if(count == 0){
//                 num = arr[i];
//             }
//         }
//         }
//         System.out.println(num);
//     }
// }






//////////////////////////////
// public class kar{
//     public static void main(String args[]){
//        int num ,temp ,sqr , a=0 ,b=0 ,c = 1;
//        num = 45;
//        sqr = num * num ; 
//        temp = num ;
//        while(temp!=0){
//            c = c * 10 ;
//            temp = temp / 10;
//        }
//         a = sqr % c ;
//         b = sqr / c ; 
//         int sum = a + b ;
//         if(sum==num)System.out.println("YES");
//         else{
//             System.out.println("NOO");
//         }
//     }
//     }