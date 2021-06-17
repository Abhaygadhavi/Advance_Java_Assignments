package Assignment1;

public class CustomerMain{

    public static void main(String []args){
       Customer c= new Customer();
       c.setName("Abhay");
       String b = c.getName();
       System.out.println(b);
       Customer c1= new Customer(1,"Abhay",21,"Ahmedabad",380058);
       
       c1.printdetails();
    }
    
    
    public static class Customer
    {
        int custId;
        String name;
        int age;
        String city;
        int pin;
        
        Customer()
        {
            System.out.println("Default:");
        }
        Customer( int cid, String n, int a, String c, int p)
        {
            custId=cid;
            name=n;
            age=a;
            city=c;
            pin=p;
        }
       public void setName (String n){
           name=n;
       }
       public String getName(){

           return name;
       }

       public void printdetails()
       {
           System.out.println("Parametrized : ");
     
           System.out.println(custId + " " + name + " " + age + " " + city + " " + pin);
     
       }
    }
}