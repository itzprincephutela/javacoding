import java.util.*;
public class total_marks{
    public static void main (String args[]){
        int a ,b,c,d,e ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Subjects : ");
        a = sc.nextInt();
         System.out.println("Enter the marks of Subjects : ");
        b = sc.nextInt();
         System.out.println("Enter the marks of Subjects : ");
        c = sc.nextInt();
         System.out.println("Enter the marks of Subjects : ");
        d = sc.nextInt();
         System.out.println("Enter the marks of Subjects : ");
        e = sc.nextInt();
        
        int totalmarks = a + b + c +d +e;
        System.out.println("Total marks : "+totalmarks);
        
        
        float Percentage = totalmarks*100/500;
          System.out.println("Total marks : "+Percentage);
    }
}