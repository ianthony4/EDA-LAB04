import java.util.*;

public class Test{
  public static void main(String[] args){
    int tamano;		        
    Scanner teclado = new Scanner( System.in );
    System.out.print( "Introduzca el tamaño máximo del último arreglo: " );
    tamano = teclado.nextInt();

    ArrayList<DoubleLinkList<Integer>> casos = new ArrayList<DoubleLinkList<Integer>>();        
    for(int n=1; n<=tamano; n++) {
      casos.add(generarPeorCaso(n));
    }        
    Iterator<DoubleLinkList<Integer>> puntero = casos.iterator();
    while(puntero.hasNext()){
      System.out.println(insertionSort(puntero.next()));
    }
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
        A.set(i+1, A.get(i));
        i = i-1;
      }
      A.set(i+1, key);
      //System.out.println(A);
    }
    long nano_endTime = System.nanoTime();
    return nano_endTime - nano_startTime;
  }
}
