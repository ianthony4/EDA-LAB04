public class DoubleLinkList<T>{
  Node<T> head;
  Node<T> end;
  public DoubleLinkList(){
    head = null;
    end = null;
  }
  public void addFirst(T data){
    Node<T> aux = new Node<T>(data);
    if(this.isEmpty())
      end = aux;
    else
      head.setPreviousNode(aux);
    aux.setNextNode(head);
    head = aux;

  }
  public void add(T data){
    Node<T> aux = new Node<T>(data);
    if(this.isEmpty())
      head = aux;
    else{
      end.setNextNode(aux);
      aux.setPreviousNode(end);
    }
    end = aux;

  }
  public T delFirst(){
    if(this.isEmpty())
      return null;
    Node<T> aux = head;
    if(head == end)
      end = null;
    else // el segundo nodo tendra como anterior nodo un nulo
      head.getNextNode().setPreviousNode(null);
    // Desconectamos ambos nodos
    head = head.getNextNode();
    aux.setNextNode(null);
    // Que elemento se elimino ->
    return aux.getData();
  }
  public boolean isEmpty(){
    return end == null;
  }

  // toString
  public String toString(){
    String str = "";
    for(Node<T> aux = this.head; aux != null; aux = aux.getNextNode())
      str += aux.toString() + " ";
    return str;
  }
}
