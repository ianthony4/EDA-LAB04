public class DoubleLinkList<T>{
  Node<T> head;
  Node<T> end;
  public DoubleLinkList(){
    head = null;
    end = null;
  }
  public void addFirst(T data){
    Node<T> aux = new Node<T>(data, head.getNextNode(), head);
    head.setNextNode(aux);
      
  }
  public void add(T data){
    Node<T> aux = new Node<T>(data);
    if(this.isEmpty()) 
      head = aux;
    else
      end.setNextNode(aux);
      
  }
  public boolean isEmpty(){
    return end == null;
  }
  
}
