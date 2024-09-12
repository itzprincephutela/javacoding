class Time{
    private int hours,min,sec;
    public void setTime(int h ,int m ,int s)
    {
        hours =h;
        min = m;
        sec =s;
    }
    public void Display(){
        System.out.println(hours+"hr"+" "+min+"min"+" "+sec+" ");
    }
}


public class Qus2 {
public static void main(String[] args) {
    Time t = new Time();
    t.setTime(3, 14, 60);
    t.Display();
}
}
