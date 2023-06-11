public class Test{
  public static void main(String[] args){
    DoubleLinkList<Integer> nums = generarPeorCaso(10);
    System.out.println("Elementos " + nums);
    System.out.println("Elementos " + nums);
  }
  public static DoubleLinkList<Integer> generarPeorCaso(int t) {
    DoubleLinkList<Integer> nums = new DoubleLinkList<Integer>();
    for (int i = 0; i < t; i++) {
      nums.add(t-i);
    }
    return nums;
  }
  public static long insertionSort(int[] A) {
    int key;
    int i;
    long nano_startTime = System.nanoTime();
    for(int j=1; j<A.length; j=j+1) {
      key = A[j];
      //Insertar A[j] en la secuencia ordenada A[1..j-1]
      i = j-1;
      while(i>-1 && A[i]>key) {
        A[i+1] = A[i];
        i = i-1;
      }
      A[i+1] = key;
      //imprimirArreglo(A);
    }
    long nano_endTime = System.nanoTime();
    return nano_endTime - nano_startTime;
  }
}
