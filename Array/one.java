public class one{
    static int sub(int[] arr, int k) {
        int len = 0;
        int n = arr.length;
        int right = 0, left = 0, sum = 0;

        while (right < n) {
            sum += arr[right];

            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                len = Math.max(len, right - left + 1);
            }

            right++;
        }

        return len;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, };
        int k = 6;
        System.out.println(sub(arr, k));  // Output: 4 (e.g., subarray [1,1,1,3])
    }
}

