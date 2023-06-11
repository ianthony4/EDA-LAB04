public class DoubleLinkList<T>{
  Node<T> head;
  public DoubleLinkList(){
    head = null;
  }
  public void add(T data){
    Node<T> aux = new Node<T>(data);
    if(this.isEmpty()) 
      head = aux;
    else{
      head.se1tNextNode(aux);
    }
      
  }
  public boolean isEmpty(){
    return head == null;
  }
  
}
