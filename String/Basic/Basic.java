import java.util.Scanner;
public class Basic {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
// System.out.println("Declaration of String ");
// String str ="prince"; //declaration of strings
// System.err.println(str);
// System.out.println("Enter the input of string");
// String s = sc.next();//input
// System.out.println(s);

// Fuction in Sring 
// char at ();
String str = "Prince Kumar is the best";
System.out.println("Char At (3) : "+str.charAt(3));// n
//length()
System.out.println("Length of str : "+str.length());//24
//indexof
System.out.println("Index OF : "+str.indexOf('P'));//0
//comparison 
//takin one more str2
String Str2 = "Basic of String ";
System.out.println(str.compareTo(Str2));//14
//contain()  true and false me ata hai hmesha inka ans  
String s = "Prince";
System.out.println("Contain Fuction "+s.contains("nnce"));//false
//start with 
System.out.println("Start with "+s.startsWith("Prin"));//true 
//Ends with 
System.out.println("Ends with "+s.endsWith("nce"));//true 
//toLowercase
System.out.println("To Lower case : "+str.toLowerCase());//prince kumar is the best
//to Uppercase
System.out.println("To Upper Case : "+Str2.toUpperCase());//BASIC OF STRING
//to con cat
System.out.println("ConCat Fuction : "+ str.concat(Str2));
//empty string;
String X = "";
System.out.println("Empty String  : "+X.length());

//substring(i) and substring (i,j)  but jab i,j ki baat ati hai to j - 1  hi print krta hai dekho age 
String newone = "Hi I am Prince Kumar ";
System.out.println("Newonr String  length : "+newone.length());
System.out.println("Only i se leke end tak  substring : "+newone.substring(1));//" i I am Prince Kumar "
System.out.println("Only i se leke j- 1 tak substring : "+newone.substring(1,19));//" i I am Prince Kumar "


String a = "abc";
String b = "abc";
System.out.println(a+b);//abcabc
a = a.concat(b);//concat me hum sirf char ke andr char add kr shkte hai number add nhi kr shkte 
System.out.println(a);//abcabc

// + Operator
a = a + "xyz";//we can also do one more thing;
System.out.println(a);//abcabcxyz
a = a + b ;
System.out.println(a);//abcaabcxyzabc
String op = "hi";
op = op + "10";
System.out.println(op);//hi10
op = op + "z";
System.out.println(op);//hiz


//integer to string fuction
// System.out.println("Enter the number : ");
// int num =sc.nextInt();

// String strr =Integer.toString(num);
// System.out.println(strr);
// System.out.println(strr.length());

//String are mutables



// interning and new keyword
String p = "Prince"; // to save space 
String q = "Prince"; // this is aslo use a shallow copy in java 
// but  but  we can  use new keywod to ye shallow copy nhai bne ga 
String r = new String("Prince");


// equal and ==
  String e= "abcdxyz";
  String f= "abcd";
  f = f +"xyz";
  System.out.println(e);
  System.out.println(f);
  System.out.println(e==f);// why this is given false;  because they are checking adressing;
  System.out.println(e.equals(f));// true  //we can aslo use compare to
  System.out.println(e.compareTo(f));// 0  


  //String to arr
  
  String[] arr = {"123","432","0"};
  int mx = Integer.MIN_VALUE;
  for(int i=0 ; i <arr.length ; i++){
    int n = Integer.parseInt(arr[i]);
    mx = Math.max(mx,n);
  }
System.out.println(mx);
m
  
}
}
