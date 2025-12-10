import java.util.*;

//take a input of array and find sum of array 
// public class array {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);


//          System.out.println("enter size of array");
//          int n=sc.nextInt();


//          int []  arr = new int[n];
//          int sum=0;

//          System.out.println("enter array elements:");
//          for(int i=0; i<n; i++){
//              arr[i]=sc.nextInt();
//              sum +=arr[i];
//          }
//          System.out.println("sum:"+sum);
//     }
// }


///print the max/largest elemen in the  array 


// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter the size of array");
//         int n = sc.nextInt();

//         int []arr = new int[n];

//         System.out.println("enter elements:");
//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//      int max=arr[0];
//      for(int i=1; i<n; i++){
//         if(arr[i]>max){
//             max=arr[i];
//         }
//      }
//         System.out.println("Maximum element: " + max);
//     }
// }


// count number of even or odd elemnt in array,,,,,,,,,,,,,,
// public class array{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);

//          System.out.println("enetr the sixe of array:");
//          int n=sc.nextInt();
          
//            int[]arr=new int[n];
//           int  even=0;
//           int odd=0;

         
//          System.out.println("enter the element of array:");
//          for(int i=0; i<n; i++){
//               arr[i]=sc.nextInt();
//         if(arr[i]%2==0)
//               even++;
//         else
//              odd++;
//          }
//      System.out.print("even: " +even+ " odd: " +odd);
//     }
// }




//. Linear Search
//User se ek number lo, aur check karo wo number array me hai ya nahi.,,,,,,,,,,,,,,,,,,,,,,
//  public class array{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);

//          System.out.println("enetr the size of array:");
//          int n=sc.nextInt();
          
//            int[]arr=new int[n];
          
         
//          System.out.println("enter the element of array:");
//          for(int i=0; i<n; i++){
//               arr[i]=sc.nextInt();
//          }
//          System.out.println("enter number to be search:");
//          int x=sc.nextInt();

//          boolean found=false;
//             for(int val:arr){
//                 if(val==x){
//                     found=true;
//                     break;
//                 }
//             }
//              if (found)
//             System.out.println(x + " is present in the array.");
//         else
//             System.out.println(x + " is not present in the array.");
//         }}