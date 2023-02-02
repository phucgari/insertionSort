import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    int[]arr=new int[]{12,11,2,3,4,22,5,7,16,20};
    int[] expected;
    @Test
    void insertIndexToTheRightPosition(){
        expected=arr;
        Main.insertIndexToTheRightPosition(arr,0);
        assertTrue(Arrays.equals(arr,expected));

        Main.insertIndexToTheRightPosition(arr,1);
        expected=new int[]{11,12,2,3,4,22,5,7,16,20};
        assertTrue(Arrays.equals(arr,expected));

        Main.insertIndexToTheRightPosition(arr,2);
        expected=new int[]{2,11,12,3,4,22,5,7,16,20};
        assertTrue(Arrays.equals(arr,expected));
    }
    @Test
    void insertionSort(){
        Main.insertionSort(arr);
        expected= Arrays.stream(arr).sorted().toArray();
        assertTrue(Arrays.equals(arr,expected));

        arr=new int[]{4,3,2,2,5,6,3,1,7,7};
        Main.insertionSort(arr);
        expected= Arrays.stream(arr).sorted().toArray();
        assertTrue(Arrays.equals(arr,expected));
    }
}