//Đảo ngược thứ tự các phần tử trong mảng mà không sử dụng mảng phụ.
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Mảng ban đầu:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.println("\nMảng sau khi đảo ngược:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
