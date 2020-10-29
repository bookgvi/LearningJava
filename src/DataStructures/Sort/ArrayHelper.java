package DataStructures.Sort;

public abstract class ArrayHelper {
  int[] unsortedArr = new int[]{1, 2, 6, 2, 9, 3, 7, 8, 5, 5};
  void displayArr(String str, int[] arr) {
    System.out.printf("%s: ",str);
    for(int item: arr) {
      System.out.printf("%s ", item);
    }
    System.out.println();
  }
}
