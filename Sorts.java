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
      }
    }
  }
}
