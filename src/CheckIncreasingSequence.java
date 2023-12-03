
public class CheckIncreasingSequence {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        boolean isIncreasing = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Mảng là một dãy số tăng dần.");
        } else {
            System.out.println("Mảng không phải là một dãy số tăng dần.");
        }
    }


    //Viết chương trình để sắp xếp một mảng số nguyên theo thứ tự tăng dần.
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi giá trị của arr[j] và arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    //Tính tổng của các chữ số trong một số nguyên.
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // Lấy chữ số cuối cùng và cộng vào tổng
            number /= 10; // Loại bỏ chữ số cuối cùng
        }
        return sum;
    }



    //Tìm phần tử lớn thứ k trong một mảng.
    public static int findKthDistinctLargest(int[] arr, int k) {
//        Arrays.sort(arr);
        int distinctCount = 1;
        int prev = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != prev) {
                distinctCount++;
                if (distinctCount == k) {
                    return arr[i];
                }
            }
            prev = arr[i];
        }
        return -1; // Trả về -1 nếu không tìm thấy phần tử lớn thứ k
    }
}

