
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            insertIndexToTheRightPosition(arr,i);
        }
    }
    public static void insertIndexToTheRightPosition(int[] arr, int index) {
        for (int i = index; i > 0; i--) {
            if(arr[i]<arr[i-1]) swapBack(arr,i);
            else break;
        }
    }

    private static void swapBack(int[] arr, int i) {
        int temp=arr[i];
        arr[i]=arr[i-1];
        arr[i-1]=temp;
    }

}