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
    if(this.isEmpty()) {
      head = aux;
    }else{
      end.setNextNode(aux);
      aux.setPreviousNode(end);
    }
    end = aux;

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
