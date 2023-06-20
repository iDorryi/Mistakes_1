// package Task_1;
// import java.io.File;
// import java.io.FileReader;

// public class Task_1 {

    // // 1.Первое исключение, индекс вне границы (ArrayIndexOfBoundsException)
// //     public static void main(String[] args) {
// //         int[] ints = new int[10];
// //         System.out.println(ints[1000]);
// //     }
    
// // }
// // // 2.Второе исключение: деление на ноль ( Arithmetic Exception: /by zero)
// //     public static void main(String[] args) {
// //         System.out.println(divide(-10,0));
// // }
// //     public static int divide(int x, int y) {
// //         return(x/y);
// // }
// // }

// //3. Файл не найден исключение (Unhandled exception type FileNotFoundException)
//    public static void main(String args[]) {		
//       File f = new File("D://java/file.txt");
//       FileReader fr = new FileReader(f); 
   
// }
// }
// public static int sum2d(String[][] arr)
// { int sum = 0; for (int i = 0; i < arr.length; i++) 
//     { for (int j = 0; j < 5; j++)
//          { int val = Integer.parseInt(arr[i][j]); 
//             sum += val; 
//         } 
//         } return sum; 
//     }

 // 1 Ошибка - уход за пределы массива в 32 строке.
 // 2 Ошибка - не возможность перевести в строке 33 - String в Integer(невалидные
 //   данные например слово)
 // 3 Ошибка - возможно превышение размера типа int в 34 строке.

//  public static int[] division(int[] arr1, int[] arr2) {
//     int[] result = new int[arr1.length];
//     if (arr1.length != arr2.length) {
//         throw new RuntimeException("Массивы не равны !");
//     } else {
//         for (int index = 0; index < arr1.length; index++) {
//             if (arr2[index] == 0) {
//                 throw new RuntimeException("На ноль делить нельзя !");
//             } else {
//                 result[index] = arr1[index] / arr2[index];
//             }
//         }
//     }
//     return result;
// }
// }

