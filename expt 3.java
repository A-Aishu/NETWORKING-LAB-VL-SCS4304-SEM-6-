import java.util.Scanner;
class prog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = recurSum(n);
        System.out.print(sum);
    }

    public static int recurSum(int n) {
        if (n <= 1) 
            return n; 
        return n + recurSum(n - 1); 
    } 
}