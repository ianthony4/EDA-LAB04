
import java.util.*;

public class Ordenamiento{
  public static void main(String[] args){
    int tamano;
    Scanner teclado = new Scanner( System.in );
    System.out.print( "Introduzca el tamaño máximo del lasting arreglo: ");
    tamano = teclado.nextInt();

    DoubleLinkList<int[]> casos = new DoubleLinkList<int[]>();

    for(int n=1; n<=tamano; n++) {
      casos.add(generarPeorCaso(n));
    }
    for(int n=0; n< casos.length(); n++) {
    	System.out.println(insertionSort(casos.get(n)));
    }
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

  public static int[] generarPeorCaso(int t) {
    int[] lista= new int[t];
    for (int i=0; i<t; i++) {
      lista[i] = t-i;
    }
    return lista;
  }

  public static void imprimirArreglo(int[] lista){
    System.out.println("");
    for (int x=0; x<lista.length; x++) {
      System.out.print(lista[x] + " ");
    }
  }
}

