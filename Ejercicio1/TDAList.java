//Esta es una interface que especifica las operaciones basicas que se 
//pueden realizar en una lista generica. 

public interface TDAList<E> {
    //verifica si la lista esta vacia
    boolean isEmpty();

    //inserta un elemento x al inicio de la lista
    void insertFirst(E x);

    //inserta un elemento x al final de la lista
    void insertLast(E x);

    //Busca el elemento X, true si la encuentra, false si no encuentra
    boolean search(E x);

    //Elimina el elemento x, si lo encuentra lo hace, caso contrario no pasa nada
    void remove(E x);

    //Este metodo inserta el elemento X en la posicion P de la lista
    void insert(E x, int p);

}