public class Node <E > {
  private E data;
  private Node<E> nextNode;
  private Node<E> previousNode;
  // Constructores
  public Node() {
    this.data = null;
    this.nextNode = null;
    this.previousNode = null;
  }
  public Node( E data ) {
    this.data = data;
    this.nextNode = null;
    this.previousNode = null;
  }   
  public Node( E data , Node <E > nextNode ) {
    this.data = data;
    this.nextNode = nextNode;
    this.previousNode = null;
  }   
  public Node( E data , Node <E > nextNode , Node <E > previousNode ) {
    this.data = data;
    this.nextNode = nextNode;
    this.previousNode = previousNode;
  }      
  /* Getters y Setter ... */
}
