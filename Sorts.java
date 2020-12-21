import java.util.Arrays;
public class Sorts{

  public static void bubbleSort(int[] data){
    boolean sorted = false;
    for (int i = data.length; i > 0 && sorted == false; i--){
      sorted = true;
      for (int j = 1; j < i; j++){
        if (data[j-1] > data[j]){
          sorted = false;
          int temp = data[j];
          data[j] = data[j-1];
          data[j-1] = temp;
        }
        // System.out.println(Arrays.toString(data));
      }
    }
  }

  public static void selectionSort(int[] data){
    for (int i = 0; i < data.length; i++){
      int index = i;
      int minimum = data[i];
      for (int j = i; j < data.length-1; j++){
        if (data[j+1] < minimum) {
          index = j+1;
          minimum = data[j+1];
        }
      }
      data[index] = data[i];
      data[i] = minimum;
      // System.out.println(Arrays.toString(data));
    }
  }

  public static void insertionSort(int[] data){
    for (int i = 1; i < data.length; i++){
      int index = i-1;
      int insertValue = data[i];
      while (index >= 0 && insertValue < data[index]){
        data[index+1] = data[index];
        index--;
      }
      data[index] = insertValue;
    }
  }
}
