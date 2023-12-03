//Viết hàm để tìm tất cả các số nguyên tố trong một mảng và in chúng ra.
public class PrimeNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {7, 12, 5, 8, 11, 13, 20, 17};
        findAndPrintPrimeNumbers(arr);
    }

    public static void findAndPrintPrimeNumbers(int[] arr) {
        System.out.print("Các số nguyên tố trong mảng: ");
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

