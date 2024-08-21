public class Constructor{
    public static class Default{
        int a ;
        String name ; 
        Default(){
            a = 0 ;
            name ="Prince";
        }
        void Show(){
            System.out.println(a+" "+name);
        }
    }
    public static void main(String args[]){
               Default D = new Default();
               D.Show();
    }
}