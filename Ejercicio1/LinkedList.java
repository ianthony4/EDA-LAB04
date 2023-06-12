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

    @Override
    public void remove(E x){
        //Solo se elimina si list no esta vacio y si el elemento se encuentra en la lista
        if(!this.isEmpty()){
            if(!this.first.getDato().equals(x)){
                this.first = first.getNext();
            }
        }else{
            Node<E> aux = this.first;
            //Recorremos hasta llegar al elemento anterior del que se va a eliminar
            while(aux.getNext() != null && !aux.getNext().getDato().equals(x)){
                aux = aux.getNext();
            }
            // cambio el nodo siguiente de ese nodo por el de la posicion siguiente
            if(aux.getNext() != null){
                aux.setNext(aux.getNext().getNext());
            }
        }
        size++;
    }

    @Override
    public void insert(E x, int p){
        //Si la lista esta vacia lo insertamos en la primera posicion
        if(this.isEmpty() || p == 0){
            insertFirst(x);
        }else{
            //De lo contrario recorro hasta la posicion anterior p -1 
            Node<E> aux = this.first;
            // El "next" tiene que ser diferente de null
            for(int i = 0; i < p - 1 && aux.getNext() != null; i++){
                aux = aux.getNext();
            }
            // cambio el next por el dato que se insertara, y en ese next coloco el next de p-1
            aux.setNext(new Node<E>(x, aux.getNext()));
        }
        //aumento de tamaño
        size++;
    }
    
}