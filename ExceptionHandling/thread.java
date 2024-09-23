
class thread1 implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Thread : " + i);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.setStackTrace(null);
            }

        }
    }

}

// public class thread {

//     public static void main(String[] args) {
//         thread1 t = new thread1();
//         Thread thread = new Thread(t);
//         thread.start();
//     }
// }



class thread2 extends Thread{
    @Override
    public void run() {
        for(int i = 10 ; i  >=1;i-- ){
            System.out.println("Reverese : "+i);
            try {
                  Thread.sleep(2000);
                } 
            catch (Exception e) {
                  e.setStackTrace(null);
                 } 
        }
    }

}
public class thread{
    public static void main(String[] args) {
        // thread2 t2 = new thread2();
        // t2.start();

        // thread1 t = new thread1();
        // Thread thread = new Thread(t);
        // thread.start();
        System.out.println("Program Started");
        int  a = 5;
        int  b = 4;
        int c = a +b;
        System.out.println(c);
        Thread N = Thread.currentThread();
        String NewThread=N.getName();
      
        System.out.println("ThreAD naME : "+NewThread);
        N.setName("MyTHREAD");       
        System.out.println(N.getName());
        
        try{
        Thread.sleep(5000);
        }
        catch(Exception e){
        }
        System.out.println("pROGRAM eNDEDN");

    }
}