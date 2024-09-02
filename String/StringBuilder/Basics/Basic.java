

public class Basic {
    public static void main(String[] args) {
        // this is inbuild fuction  and stringbuilder are mutables 
        String s = "Prince"; //normal 
        String st = new String("Prince");// with new Space or Memory;// 16 predefine 
        // StringBuilder str = ("Prince")   this is Wrong method and this is also Not working 
        StringBuilder str = new StringBuilder("Prince Kumar");
        //Empty StringBuilder
        StringBuilder empty =   new StringBuilder(" ");  
        System.out.println("Empty is "+empty.isEmpty());
        //We can also gave to  capacity of string
        StringBuilder capacity =   new StringBuilder(10);   //space le liya hai itna hmne 
        System.out.println("Capacity is :"+ capacity.capacity());
        //reverse 
        StringBuilder rev = new StringBuilder("Reverse");
        System.out.println("Reverse : "+rev.reverse());
        //append()
        StringBuilder app =  new StringBuilder("App");
        System.out.println(app);
        System.out.println(app.append("end"));//append add to str to str2 without using another memory  
        System.out.println(app);
        //insert and deletechatAt();

        System.out.println("Delete index : "+app.deleteCharAt(5));
        //insert with out fuction;
        app.setCharAt(2,'i');
        System.out.println(app);//apien
        //insert without delete current element 
        app.insert(2, 'p');
        System.out.println(app);


         
    }
}
