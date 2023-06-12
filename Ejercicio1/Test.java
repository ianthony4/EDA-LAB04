
public class Test {
    public static void main(String[] args){
        //Aqui se aplicaran las prubas
        int PRUEBAS = 2000;

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
