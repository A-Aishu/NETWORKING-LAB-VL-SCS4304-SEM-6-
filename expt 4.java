import java.util.Scanner;
import java.io.*;
public class Main {
public static int ls(int[] arr, int k) {
  for(int i = 0; i < arr.length; i++) {
    if (arr[i] == k) {
      return i;
    }
  }
  return -1;
}
public static void main(String args[]) {
  Scanner scan = new Scanner(System.in);
  int[] a1 = new int[20];
  int n = scan.nextInt();
  for (int i  = 0; i < n; i++)
    a1[i] = scan.nextInt();
  int key = scan.nextInt();
  int l = ls(a1, key);
  if (l >= 0)
    System.out.println(key + " is present at location " + (l+1));
  else
    System.out.println(key + " isn't present in array");
}
}
