//tìm UCLN và BCNN
import java.util.Scanner;

public class UCLN_BCNN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();
        scanner.close();

        int ucln = findUCLN(num1, num2);
        int bcnn = (num1 * num2) / ucln;

        System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là: " + ucln);
        System.out.println("Bội chung nhỏ nhất của " + num1 + " và " + num2 + " là: " + bcnn);
    }

    public static int findUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
