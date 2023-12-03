
//tìm phần tử lớn nhất trong mảng
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 5, 7, 15, 20, 3, 25};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
