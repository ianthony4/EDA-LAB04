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
    Node<T> aux = new Node<T>(data, head, null);
    if(this.isEmpty())
      end = aux;
    else
      head.setPreviousNode(aux);
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
  public T get(int ind){
    T data = null;
    if(ind >= len)
      return null;
    if(ind > (len/2))
      data = this.getByEnd(ind);
    else
      data = this.getByHead(ind);
    return data;
  }
  public T getByHead(int ind){
    Node<T> aux = head;
    T data = null;
    for(int i = 0; i < this.len; i++){
      if(i == ind){
        data = aux.getData();
        break;
      }
      aux = aux.getNextNode();
    }
    return data;
  }
  public T getByEnd(int ind){
    Node<T> aux = end;
    T data = null;
    for(int i = (len - 1); i > 0; i--){
      if(i == ind){
        data = aux.getData();
        break;
      }
      aux = aux.getPreviousNode();    
    }
    return data;
  }
  public T set(int ind, T data){
    if(ind >= len)
      return null;
    if(ind > (len/2))
      data = this.setByEnd(ind, data);
    else
      data = this.setByHead(ind, data);
    return data;
  }
  public T setByHead(int ind, T data){
    Node<T> aux = head;
    for(int i = 0; i < this.len; i++){
      if(i == ind){
        aux.setData(data);
        break;
      }
      aux = aux.getNextNode();
    }
    return data;
  }
  public T setByEnd(int ind, T data){
    Node<T> aux = end;
    for(int i = (len - 1); i > 0; i--){
      if(i == ind){
        aux.setData(data);
        break;
      }
      aux = aux.getPreviousNode();    
    }
    return data;
  }
  public boolean isEmpty(){
    return len == 0;
  }
  public int length(){
    return this.len;
  }

  // toString
  public String toString(){
    String str = "";
    for(Node<T> aux = this.head; aux != null; aux = aux.getNextNode())
      str += aux.toString() + " ";
    return str;
  }
}
