public class Test{
  public static void main(String[] args){
    DoubleLinkList<Integer> nums = generarPeorCaso(10);
    nums.set(5, 0);
    nums.set(9, 9);
    System.out.println("El mismo indice: " + nums.get(5) + " == " + nums.get(9));
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
  public static long insertionSort(DoubleLinkList<Integer> A) {
    int key;
    int i;
    long nano_startTime = System.nanoTime();
    for(int j = 1; j < A.length(); j++) {
      key = A.get(j);
      //Insertar A[j] en la secuencia ordenada A[1..j-1]
      i = j-1;
      while(i > -1 && A.get(i) > key) {
        /// A.get(i+1) = A.get(i);
        i = i-1;
      }
      // A[i+1] = key;
      //imprimirArreglo(A);
    }
    long nano_endTime = System.nanoTime();
    return nano_endTime - nano_startTime;
  }
}
