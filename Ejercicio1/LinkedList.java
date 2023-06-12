public class LinkedList<E extends Comparable<E>> implements TDAList<E> {
    Node<E> first;
    int size;
    
    //Constructor
    public LinkedList() {
        this.size = 0;
    }
    
    //Metodos de TDAList: proporcionando una la lógica real para cada uno de estos métodos.
    
    @Override
    public boolean isEmpty(){
        return this.first == null;
    } 

    @Override
    public void insertFirst(E x){
        this.first = new Node<E>(x, this.first);
        size++;
    }

    @Override
    public void insertLast(E x){
        //Si la lista esta vacia solo inserto X al inicio
        if(this.isEmpty()){
            insertFirst(x);
        }else{
            //Recorro la lista hasta llegar al ultimo elemento y hago uso/referencio al siguiente nodo
            Node<E> aux = this.first;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(new Node<E>(x));
        }
        //aumento el tamaño
        size++;
    }

    @Override
    public boolean search(E x){
        Node<E> aux = this.first;
        while(aux != null &&  !aux.getDato().equals(x)){
            aux = aux.getNext();
        }
        return aux != null;
    }
    
}