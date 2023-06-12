//Se usa la interfaz general COMPARABLE
public class Node<E extends Comparable<E>> {
    private E dato; // Dato almacenado
    private Node<E> next; // referencia al siguiente nodo

    //Obtener el dato almacenado en DATO
    public E getDato() {
        return dato;
    }
    // Constructor
    public Node(E dato) {
        this(dato, null);
    }
    // Contructor, crea el dato (nodo) y la referencia al siguiente nodo
    public Node(E dato, Node<E> next) {
        this.dato = dato;
        this.next = next;
    }
    // establecer dato para el nodo
    public void setDato(E dato) {
        this.dato = dato;
    }
    // Obtener el siguiente nodo
    public Node<E> getNext() {
        return next;
    }
    // Establecer el siguiente nodo
    public void setNext(Node<E> next) {
        this.next = next;
    }
    // Representar el nodo en un string
    @Override
    public String toString() {
        return this.dato.toString();
    }
    //Metodo compara 2 nodos
    // Explicaion: Compara el dato del nodo actual con el dato de otro nodo pasado como argumento y devuelve un entero
    // que indica si el nodo actual es menor, igual o mayor al nodo pasado.
    public int compareTo(Node<E> x) {
        return this.getDato().compareTo(x.getDato());
    }

}