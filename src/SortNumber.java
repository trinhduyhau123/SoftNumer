import java.util.Scanner;

public class SortNumber {
    public static void sortNumber(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.printf(a + "\t");
            if (b > c) {
                System.out.printf(b + "\t" + c);
            }
            else
                System.out.printf(c + "\t"+ b);
        } else if (a < b && b > c) {
            System.out.println(b);
            if (a > c) {
                System.out.printf(a + "\t" + c);
            } else
                System.out.printf(c + "\t" + a);
        } else if(c > b && c > a){
            System.out.printf(c +"\t");
            if (b > a) {
                System.out.printf(b + "\t" + a);
            } else
                System.out.printf(a + "\t" + b);

        }

    }
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = scanner.nextInt();
        System.out.println("Nhap b:");
        b = scanner.nextInt();
        System.out.println("Nhap c:");
        c = scanner.nextInt();
        System.out.println("Ba so sau khi sap xep: ");
        sortNumber(a,b,c);
    }
}
