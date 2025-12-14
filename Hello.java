//question 1,,  basic way to implementation

//  interface  A {
//   void  show();
// }
// class B implements A{

// }
// public class Hello{
//     public static void main(String[] args) {
//         A obj =new B();
//         obj.show();
//     }
// }


//ABOVE CODE WILL NOT COMPILE BCZ <<<<<<<<<<<<<<<<?
 //Class B implements interface A, but does
  //NOT provide implementation of method show().
 // non-abstract class
 //implementing an interface MUST implement all abstract methods.


 //LETS FIX ERROR <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
//    interface  A {
//   void  show();
// }
// class B implements A{
//   public void show(){
//     System.out.println("hello");
//   }
// }
// public class Hello{
//     public static void main(String[] args) {
//         A obj =new B();
//         obj.show();
//     }
// }


//out give perfect




//QUESTION NO 2<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<,,
//INTERFACE VARIABLE (PUBLIC STATIC FINAL)
interface A{
String city ="New Delhi";
}
    
public class Hello{
    public static void main(String[] args) {
        // System.out.println(A.city);
        
        // A.city="indore:";
    }
}