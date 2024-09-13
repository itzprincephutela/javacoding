public class Qus4 {
    public static void main(String[] args) {
        Employee E =new Employee();
        E.setname("Prince");
        E.setempID(221099);
        E.setSalary(10000000);
        System.out.println(E.geteName()+E.getempId()+E.getSalary());
    }
}   


class Employee{
    private int empID,salary;
    private String name;
    
    public void setempID(int ID){
        empID =ID;
    }
    public void setSalary(int S){
        salary = S;
    }
    public void setname(String N){
        name = N;
    }



    public int getempId(){return empID;}
    public int getSalary(){return salary;}
    public String geteName(){return name;}

}
