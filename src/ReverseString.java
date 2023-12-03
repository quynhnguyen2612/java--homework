//đảo ngược chuổi
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần đảo ngược: ");
        String input = scanner.nextLine();
        scanner.close();

        String reversed = reverseString(input);
        System.out.println("Chuỗi sau khi đảo ngược: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

