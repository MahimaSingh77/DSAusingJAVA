public class QuickSort {

    static void displayArr(int[] arr) {
        for (int val : arr) {
            System.out.println(val + " ");
        }
    }

    static void swap(int[] arr, int st, int end) {
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }

    static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        int cnt = 0;
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot)
                cnt++;
        }

        int pivotIdx = st + cnt;
        swap(arr, st, pivotIdx);

        int i = st, j = end;

        // element lesser or equal left , greater -> right side of pivotIdx
        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;

            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotIdx;

    }

    static void quickSort(int[] arr, int st, int end) {
        if (st >= end)
            return;

        int pi = partition(arr, st, end);
        quickSort(arr, st, pi - 1);
        quickSort(arr, pi + 1, end);

    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 3, 5, 2 };
        int n = arr.length;
        System.out.println("Array before sorting");
        displayArr(arr);
        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array after sorting");
        displayArr(arr);

    }
}
