import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0)
            for (int i = 1; i < a; i++)
            {
                System.out.print(i+" ");
            };
        if (a < 0)
            for (int i = a + 1; i < 0; i++)
            {
                System.out.print(i+ "  ");
            }
    }

}