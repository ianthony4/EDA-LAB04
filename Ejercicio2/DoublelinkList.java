public class DoubleLinkList<T>{
  Node<T> head;
  Node<T> end;
  int len;
  public DoubleLinkList(){
    head = null;
    end = null;
    len = 0;
  }
  public void addFirst(T data){
    Node<T> aux = new Node<T>(data);
    if(this.isEmpty())
      end = aux;
    else
      head.setPreviousNode(aux);
    aux.setNextNode(head);
    head = aux;
    len++;

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
    len++;

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
    len--;
    // Que elemento se elimino ->
    return aux.getData();
  }
  public T delLast(){
    if(this.isEmpty())
      return null;
    Node<T> aux = end;
    if(head == end)
      head = null;
    else // El anterior nodo al ultimo tendra como siguiente nodo un nulo
      end.getPreviousNode().setNextNode(null);
    end = end.getPreviousNode();
    len--;
    // Que elemento eliminamos
    return aux.getData();

  }
  public T get(int i){
    Node<T> aux = this.head;
    return null;
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
