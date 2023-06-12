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
    
}