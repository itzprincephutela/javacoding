
import java.util.Scanner;



public class reversenumberintraingle {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the n number : ");
//         int n = sc.nextInt();{
//         for(int i = 1 ; i <= n ; i ++){
            
//             for(int j = 1 ; j<=n+1-i ; j++){
//                 System.out.print(j+" ");
//             } 
//             System.out.println(" ");
//         }}
//     }
// }


// samwalphabets

// import java.util.Scanner;



// public class reversenumberintraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number : ");
        int n = sc.nextInt();{
        for(int i = 1 ; i <= n ; i ++){
            
            for(int j = 1 ; j<=n+1-i ; j++){
                System.out.print((char)(i+64)+" ");
            } 
            System.out.println(" ");
        }}
    }
}
