// class test extends Thread{
//     public void run(){
//             System.out.println("hi");
//     }
//     public static void main(String[] args) {
//         test t = new test();
//         t.start();
//     }
// }


public class test implements Runnable{
    public void run(){
        System.out.println("HI SEC");
    }
    public static void main(String[] args) {
        test t = new test();
        Thread th = new Thread(t);
        th.start();
    }
}
add


