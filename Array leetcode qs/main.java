// import java.util.*;
//  public class main {
//  //sort an array
//      public static void main(String[] args) {
//         Scanner  sc=new Scanner (System.in);
//          System.out.print("enetr number of elemnets:");
//             int n=sc.nextInt();

//                 int arr[]=new int[n];
//          System.out.println("enter the element");
//               for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//          }
//              Arrays.sort(arr);

//           System.out.println("sorted elements");
//               for(int x:arr){
//            System.out.println(x+" ");
//    }
//      }
//  }


// //sum of element in array either positive or negative value
// using hashmap
//  public static void main(String[] args) {
//         Scanner  sc=new Scanner (System.in);
//          System.out.print("enetr number of elemnets:");
//             int n=sc.nextInt();

//                 int arr[]=new int[n];
//          System.out.println("enter the element");
//               for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//  }
//  System.out.println("ente target sum:");
// int target=sc.nextInt();
// // using hashmap
// Map<Integer,Integer>map=new HashMap<>();
// int prefixSum=0;
// boolean found=false;
//   for(int i=0; i<n; i++){
//     prefixSum+=arr[i];

//   // if prefixsum itself==target
//     if(prefixSum==target){
//       System.out.println("subsarray found from o to"+i);
//       found=true;
//       break;
//     }
//   }

//     // chechk if(prefixsum-target)exists in mapping
//     if (map.containsKey(prefixSum - target)) {
//                 System.out.println("Subarray found from index " + (map.get(prefixSum - target) + 1) + " to " + i);
//                 found = true;
//                 break;
//             }

//             // Store prefix sum with index
//             map.put(prefixSum, i);
//         }

//         if (!found) {
//             System.out.println("No subarray with given sum found.");
//         }
//     }
// }
   

 
//. Find the Union and Intersection of the two sorted arrays
// import java.util.Scanner;
// import java.util.ArrayList;

// public class UnionIntersectionSortedArrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter size of first array: ");
//         int n1 = sc.nextInt();
//         int[] arr1 = new int[n1];
//         System.out.println("Enter elements of first array (sorted):");
//         for (int i = 0; i < n1; i++) {
//             arr1[i] = sc.nextInt();
//         }

       
//         System.out.print("Enter size of second array: ");
//         int n2 = sc.nextInt();
//         int[] arr2 = new int[n2];
//         System.out.println("Enter elements of second array (sorted):");
//         for (int i = 0; i < n2; i++) {
//             arr2[i] = sc.nextInt();
//         }

        
//         ArrayList<Integer> union = new ArrayList<>();
//         ArrayList<Integer> intersection = new ArrayList<>();

//         int i = 0, j = 0;
//         while (i < n1 && j < n2) {
//             if (arr1[i] < arr2[j]) {
//                 union.add(arr1[i]);
//                 i++;
//             } else if (arr1[i] > arr2[j]) {
//                 union.add(arr2[j]);
//                 j++;
//             } else {
                
//                 union.add(arr1[i]);
//                 intersection.add(arr1[i]);
//                 i++;
//                 j++;
//             }
//         }

       
//         while (i < n1) {
//             union.add(arr1[i]);
//             i++;
//         }
//         while (j < n2) {
//             union.add(arr2[j]);
//             j++;
//         }

       
//         System.out.println("Union: " + union);
//         System.out.println("Intersection: " + intersection);
//     }
// }

