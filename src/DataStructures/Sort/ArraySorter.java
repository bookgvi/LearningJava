package DataStructures.Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySorter extends ArrayHelper {
  int[] resultArr = new int[]{};

  public int[] quickSort(int[] unsortedArr) {
    int[] firstPart = Arrays.copyOfRange(unsortedArr, 0, (int) Math.floor(unsortedArr.length / 2));
    int[] secondPart = Arrays.copyOfRange(unsortedArr, firstPart.length, unsortedArr.length);
    if (unsortedArr.length > 2) {
      this.quickSort(firstPart);
    }
    this.displayArr("First part", firstPart);
    this.displayArr("Second part", secondPart);
    return resultArr;
  }

  @Override
  public void displayArr(String str, int[] unsortedArr) {
    super.displayArr(str, unsortedArr);
  }
}
