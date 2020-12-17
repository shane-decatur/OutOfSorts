public class Sorts{

  public static void bubbleSort(int[] data){
    for (int i = data.length-1; i > 0; i--){
      for (int j = 0; j < i; j++){
        if (data[j] > data[i]){
          int temp = data[j];
          data[j] = data[i];
          data[i] = temp;
        }
      }
    }
  }
}
