
class LinkedList <T> {
    Node<T> raiz;
    int tamano;
    public Node<T> get(int indice) {
        Node<T> aux=raiz;
        for(int i=0;i<indice;i++)
        aux=aux.getNextNode();
        return aux;
    }

    public void remove(int indice) {
        if(indice<tamano) {
            if(indice==0)
                raiz=raiz.getNextNode();
            else {
                Node<T> anterior=this.get(indice-1);
                anterior.setNextNode(this.get(indice+1));
            }
        tamano--;
        }
    }
}


