
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        int[] a = new int[n];
        int[] a1 = new int[n-1];
        int count = 0;
        String[] b = new String[n];
        for(int i = 0; i < n; i++){
            k = sc.nextInt();
            a[i] = k;
        }
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n; j++){
                a1[j] = a[j];
                if(a[i]>a1[j]){
                    b[j] = ">";
                } else if(a[i] < a1[j]){
                    b[j] = "<";
                } else if(a[i] == a1[j]){
                    b[j] = "=";
                }
            }
        }
        for(int i = 1; i <= n; i++){
            System.out.printf("%d: ",i);
            for(int j = 0; j < b.length; j++){
                System.out.printf("%s ",b[j]);
            }
            System.out.println();
        }
    }
}
