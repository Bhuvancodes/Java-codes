package Conditionalstatements;

class Turnaryoperator 
{
 public static void main(String args[])
 {
   int n = 5  ;
   int result=0;

 //if(n%2==0)
   //{
   // result=10;
   // System.out.println(result);
   //}
   //else
   //{
   // result=20;
    //System.out.println(result);//
   //}

   //Let's see how Turnaryoperator works here
  result=n%2==0 ? 10 : 20;
  System.out.println(result);
 }    
}
