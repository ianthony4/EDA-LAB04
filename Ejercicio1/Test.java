
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
}
