class Anonymous
{
    public void method1(){
        System.out.println("This sample method");
    }
}
public class CallAnonymous{
     public static void main(String []ma){
         Anonymous a=new Anonymous(){
              public String toString(){
                   return "Hai how are you"; 
              }
         };
         System.out.println(a.toString());
      }
}