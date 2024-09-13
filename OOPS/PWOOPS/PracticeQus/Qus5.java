class Contact{
    private int fieldID , mobileNo ;
    private String firstName , lastName , emailId ;

    public void setfieldID(int f){fieldID=f;}
    public void setmobileNo(int m){mobileNo=m;}
    public void setfirstName(String fNo){firstName=fNo;}
    public void setlastName(String lNo){lastName=lNo;}
    public void setemailId (String EID){emailId =EID;}

    public int getfieldID(){return fieldID;}
    public int getmobileNo(){ return mobileNo ;}
    public String getfirstName(){return firstName ;}
    public String getlastName(){return lastName ;}
    public String getemailId (){return emailId ;}
}

public class Qus5 {
    public static void main(String[] args) {
        Contact C = new Contact();
        C.setfirstName("Prince");
        C.setlastName("Kumar");
        C.setfieldID(2210);
        C.setmobileNo(99924);
        C.setemailId("Prince2090.be22@chitkara");
        System.out.println(C.getfirstName()+" "+C.getlastName()+" "+C.getemailId()+" "+C.getfieldID()+" "+C.getmobileNo());

    }
    
}
