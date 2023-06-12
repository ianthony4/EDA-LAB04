import java.io.*;
import com.panayotis.gnuplot.GNUPlotParameters;
import com.panayotis.gnuplot.JavaPlot;

public class Test {
    public static void main(String[] args) throws Exception{
        //Aqui se aplicaran las prubas
        int PRUEBAS = 2000;
        //variables de tiempo de ordenamiento para cada lista
        long insercionInicio, insercionFin, insercionTotal;
        //Creacion del grafico
        PrintStream grafico = new PrintStream("insercion.dat");
        //Calculo del tiempo en hacer toda la prueba
        long inicioSimulacion = System.nanoTime();
        for (int i = 2; i <= PRUEBAS; i++) {
            //generamos una lista del peor caso con esa cantidad de elementos 
            LinkedList<Integer> list = generarPeorCaso(i);
            //inicio del tiempo
            insercionInicio = System.nanoTime();
            insertionSort(list); //ordenamos la lista
            //fin del tiempo
            insercionFin = System.nanoTime(); 
            //calculamos el tiempo total
            insercionTotal = insercionFin - insercionInicio;
            //En el archivo se crean 2 columnas
            
            grafico.print(i); // 1ra columna - numero de elementos
            grafico.print(" - "); // separador
            grafico.print(insercionTotal); // 2da columna - tiempo (nanosegundos) para ese numero de elementos (i)
            grafico.println(); //salto de linea
        }
        grafico.close();
        long finSimulacion = System.nanoTime();
        long totalSimulacion = finSimulacion - inicioSimulacion;
        //Calculo del tiempo total en minutos
        double minutosTotales = (double) totalSimulacion / 1_000_000_000 / 60;
        System.out.println("Tiempo total de la prueba : "+ minutosTotales+" minutos");

        
    }

    //Este metodo realiza el ordenamiento (INSERTION)
    public static <E extends Comparable<E>> void insertionSort(LinkedList<E> list) {
        E key;
        int i;
        for (int j = 1; j < list.size; j = j + 1) {
            key = list.get(j).getDato();
            i = j - 1;
            while (i > -1 && list.get(i).getDato().compareTo(key) > 0) {
                list.get(i + 1).setDato(list.get(i).getDato());
                i = i - 1;
            }
            list.get(i + 1).setDato(key);
        }
        System.out.println(list);
    }

    //Este metodo genera la lista de los peores casos
    public static LinkedList<Integer> generarPeorCaso(int t) {
        LinkedList<Integer> list = new LinkedList<>();
        // Va insertando al primer elemento con insertFirst
        // para i = 5 -> primero inserta 1, luego inserta 2 como primero desplazando al 1 y de esa manera
        // la lista queda asi : [5,4,3,2,1]
        for (int i = 0; i < t; i++) {
            list.insertFirst(i + 1);
        }
        return list;
    }
}
