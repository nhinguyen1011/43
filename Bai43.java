import java.util.Scanner;

public class Bai43 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("enter n: " + n);
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("value of a [" + i + "]:" + a[i]);
        }
        int m = scanner.nextInt();
        System.out.println("enter n: " + m);
        int[] b = new int[m];
        for (int i = 0; i < b.length; i++) {
            System.out.println("value of b [" + i + "]:" + b[i]);
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.println("merge 2 array: " +merge(a[],n, b[],m));
            }
        }
        
    }
    public static void merge(int[] a,int n,int[] b,int m){
        int d=0;
        int[] c = new int[d];
        for (int i = 0; i < n; i++) {
            c[d]=a[i];
            d++;
        }
        for (int i = 0; i < m; i++) {
            c[d]=b[i];
            d++;
        }
    }
}
