public class Test{
  public static void main(String[] args){
    DoubleLinkList<Integer> nums = new DoubleLinkList<Integer>();
    nums.addFirst(12);
    nums.add(100);
    nums.add(4);
    nums.addFirst(9);
    nums.addFirst(0);
    System.out.println("Esta vacio? " + nums.isEmpty());
    System.out.println("Elementos " + nums);
    nums.delFirst();
    nums.delLast();
    nums.delLast();
    System.out.println("Elementos " + nums);
  }
  public static int[] generarPeorCaso(int t) {
    int[] lista= new int[t];
    for (int i=0; i<t; i++) {
      lista[i] = t-i;
    }
    return lista;
  }
}
