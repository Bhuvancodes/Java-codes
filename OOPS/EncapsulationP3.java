package OOPS;
class Human                                     
{
   private int age;
    private String name;                         //get: for getting data
                                                 //set: for setting value 
    public int getAge()
    {
    return age;
   }
   public void setAge(int a)             //we are not returing any value so i used void; 
    {
    age=a;                          //here we have a method that accepting an value, i.e assigning to age
    } 

     public String getName()
    {
    return name;
    }
public void setName(String n)
   {  
     name=n;
   }
}
public class EncapsulationP3
{
    public static void main(String[] args)
     {
        Human obj = new Human();
        obj.setAge(24);
        obj.setName("Bhuvan");;
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
