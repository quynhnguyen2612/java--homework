//tính tổng các số nguyên tố
public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        int n = 100; // khoảng từ 1 đến n
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("Tổng các số nguyên tố từ 1 đến " + n + " là: " + sum);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

