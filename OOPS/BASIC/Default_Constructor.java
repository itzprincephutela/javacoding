public class Default_Constructor{
    public static class Default{
        int a ;
        String name ; 
        // Default(){
        //     a = 0 ;
        //     nameDefault_ =null;
        // }
        void Show(){
            System.out.println(a+" "+name);
        }
    }
    public static void main(String args[]){
               Default D = new Default();
               D.Show();
    }
}