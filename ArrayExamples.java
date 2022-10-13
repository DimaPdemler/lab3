

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int[] copyArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      copyArray[i] = arr[arr.length - i - 1];
      // System.out.println(copyArray[i]);
    }

    for(int j=0;j<arr.length;j+=1){
      arr[j]=copyArray[j];
    }
    // arr=copyArray;

    // for(int elements : arr){
    //   System.out.println("new array: "+elements);
    // }
    
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int j=0;j<arr.length;j+=1){
      newArray[j]=arr[j];
    }
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    int count=0;
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }

    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { sum += num; count+=1; }
    }
    if(count==0){
      return 0.0;
    }
    return sum / (count);
  }


}

