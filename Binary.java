public class Binary{
//
// public static double decimaltoBinary(int n) {
//
//
// //
// // double binarycode = 00000000;
// //   if(n > 128) {
// //     binarycode += 10000000;
// //   }
// //   else if (n > 64) {
// //     binarycode += 01000000;
// //   }
// //   else if( n > 32) {
// //     binarycode += 00100000;
// //   }
// //   else if(n > 16) {
// //     binarycode += 00010000;
// //   }
// //   else if( n > 8) {
// //       binarycode += 00001000;
// //     }
// //   else if( n > 4) {
// //     binarycode += 00000100;
// //   }
// //   else if( n > 2) {
// //     binarycode += 00000010;
// //   }
// //   else if( n > 1)  {
// //     binarycode += 00000001;
// //   }
//    return(binarycode);
//
// }

public static void main(String[] Args) {
//   System.out.println(decimaltoBinary(23));
// System.out.println(decimaltoBinary(7));
// System.out.println(decimaltoBinary(3));
// System.out.println(decimaltoBinary(1));

int n=255;
String s = Integer.toBinaryString(n);
System.out.println(s);

}


}
